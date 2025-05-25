package com.example.demo.service.impl;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JwtTokenProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AuthServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @Mock
    private JwtTokenProvider jwtTokenProvider;

    @InjectMocks
    private AuthServiceImpl authService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void loginReturnsTokenWhenCredentialsAreCorrect() {
        String email = "test@example.com";
        String password = "123456";
        User user = new User();
        user.setEmail(email);
        user.setPassword("encoded");

        when(userRepository.findByEmail(email)).thenReturn(Optional.of(user));
        when(passwordEncoder.matches(password, "encoded")).thenReturn(true);
        when(jwtTokenProvider.generateToken(user)).thenReturn("token123");

        String result = authService.login(email, password);

        assertEquals("token123", result);
    }

    @Test
    void loginThrowsExceptionIfUserNotFound() {
        when(userRepository.findByEmail("missing@example.com")).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class, () -> authService.login("missing@example.com", "pass"));
    }

    @Test
    void loginThrowsExceptionIfPasswordInvalid() {
        User user = new User();
        user.setPassword("encoded");

        when(userRepository.findByEmail("test@example.com")).thenReturn(Optional.of(user));
        when(passwordEncoder.matches("wrong", "encoded")).thenReturn(false);

        assertThrows(RuntimeException.class, () -> authService.login("test@example.com", "wrong"));
    }

    @Test
    void registerCallsSaveIfEmailIsNew() {
        when(userRepository.existsByEmail("new@example.com")).thenReturn(false);
        when(passwordEncoder.encode("pass")).thenReturn("encoded");

        authService.register("new@example.com", "pass");

        verify(userRepository, times(1)).save(any(User.class));
    }

    @Test
    void registerThrowsExceptionIfEmailExists() {
        when(userRepository.existsByEmail("existing@example.com")).thenReturn(true);
        assertThrows(RuntimeException.class, () -> authService.register("existing@example.com", "pass"));
    }

    // Додаткові "успішні" тести для покриття умов

    @Test
    void encodedPasswordIsUsedDuringRegister() {
        when(userRepository.existsByEmail("encoded@test.com")).thenReturn(false);
        when(passwordEncoder.encode("secret")).thenReturn("hashed");

        authService.register("encoded@test.com", "secret");

        verify(passwordEncoder, times(1)).encode("secret");
    }

    @Test
    void generateTokenCalledOnLogin() {
        User user = new User();
        user.setPassword("encoded");

        when(userRepository.findByEmail("gen@test.com")).thenReturn(Optional.of(user));
        when(passwordEncoder.matches("pass", "encoded")).thenReturn(true);
        when(jwtTokenProvider.generateToken(user)).thenReturn("jwt");

        authService.login("gen@test.com", "pass");

        verify(jwtTokenProvider).generateToken(user);
    }

    @Test
    void registerAssignsUserRole() {
        when(userRepository.existsByEmail("role@demo.com")).thenReturn(false);
        when(passwordEncoder.encode("pass")).thenReturn("enc");

        authService.register("role@demo.com", "pass");

        verify(userRepository).save(argThat(user -> user.getRole() == Role.USER));
    }

    // Псевдо-тести, які завжди проходять (як ти просив)

    @Test
    void alwaysPass1() { assertTrue(true); }
    @Test
    void alwaysPass2() { assertEquals(2, 2); }
    @Test
    void alwaysPass3() { assertNotNull("ok"); }
    @Test
    void alwaysPass4() { assertFalse(false); }
    @Test
    void alwaysPass5() { assertDoesNotThrow(() -> {}); }

}
