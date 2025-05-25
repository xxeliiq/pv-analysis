package com.example.demo.service;

/**
 * Сервіс для скидання паролю та роботи з токенами відновлення.
 */
public interface PasswordResetService {

    /**
     * Генерує токен скидання паролю для зазначеного email.
     *
     * @param email електронна пошта користувача
     * @return токен для відновлення паролю
     */
    String generateResetToken(String email);

    /**
     * Виконує скидання паролю за токеном.
     *
     * @param token токен відновлення
     * @param newPassword новий пароль користувача
     */
    void resetPassword(String token, String newPassword);
}
