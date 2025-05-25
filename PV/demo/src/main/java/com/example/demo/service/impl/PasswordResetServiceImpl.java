package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.EmailService;
import com.example.demo.service.PasswordResetService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Сервіс для ініціалізації скидання пароля та оновлення нового пароля.
 */
@Service
public class PasswordResetServiceImpl implements PasswordResetService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final EmailService emailService;

    private final ConcurrentHashMap<String, Long> tokenStorage = new ConcurrentHashMap<>();

    @Autowired
    public PasswordResetServiceImpl(UserRepository userRepository,
                                    PasswordEncoder passwordEncoder,
                                    EmailService emailService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.emailService = emailService;
    }

    @Override
    @Transactional
    public void initiateReset(String email) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isEmpty()) {
            throw new IllegalArgumentException("Користувача з таким email не знайдено");
        }

        User user = optionalUser.get();
        String token = UUID.randomUUID().toString();
        tokenStorage.put(token, user.getId());

        String resetLink = "https://pv-platform.com/reset-password?token=" + token;
        String message = "Щоб скинути пароль, перейдіть за посиланням: " + resetLink;

        emailService.send(email, "Скидання пароля", message);
    }

    @Override
    @Transactional
    public void confirmReset(String token, String newPassword) {
        Long userId = tokenStorage.get(token);
        if (userId == null) {
            throw new IllegalArgumentException("Невірний або прострочений токен");
        }

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Користувача не знайдено"));

        user.setPassword(passwordEncoder.encode(newPassword));
        userRepository.save(user);

        tokenStorage.remove(token);
    }
}
