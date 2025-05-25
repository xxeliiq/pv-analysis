package com.example.demo.service;

/**
 * Інтерфейс аутентифікаційного сервісу, який визначає базові операції для входу та реєстрації користувачів.
 */
public interface AuthService {

    /**
     * Авторизує користувача та повертає JWT-токен у разі успіху.
     *
     * @param email    електронна пошта користувача
     * @param password пароль користувача
     * @return JWT токен
     */
    String login(String email, String password);

    /**
     * Реєструє нового користувача.
     *
     * @param email    електронна пошта користувача
     * @param password пароль користувача
     */
    void register(String email, String password);
}
