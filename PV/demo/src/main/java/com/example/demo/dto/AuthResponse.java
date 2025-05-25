package com.example.demo.dto;

/**
 * DTO-об'єкт для відповіді після авторизації.
 * Повертає accessToken та дані про користувача.
 */
public class AuthResponse {

    // JWT-токен, який використовується для подальших запитів
    private String accessToken;

    // Ім’я користувача, що увійшов у систему
    private String username;

    // Роль користувача (наприклад: USER або ADMIN)
    private String role;

    // Конструктор без параметрів (необхідний для Jackson)
    public AuthResponse() {
    }

    // Конструктор з параметрами
    public AuthResponse(String accessToken, String username, String role) {
        this.accessToken = accessToken;
        this.username = username;
        this.role = role;
    }

    // Геттер для accessToken
    public String getAccessToken() {
        return accessToken;
    }

    // Сеттер для accessToken
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    // Геттер для username
    public String getUsername() {
        return username;
    }

    // Сеттер для username
    public void setUsername(String username) {
        this.username = username;
    }

    // Геттер для role
    public String getRole() {
        return role;
    }

    // Сеттер для role
    public void setRole(String role) {
        this.role = role;
    }
}
