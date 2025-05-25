package com.example.demo.service;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.dto.UserProfileResponse;
import com.example.demo.dto.UserUpdateRequest;

/**
 * Сервіс користувача для реєстрації, оновлення профілю та отримання інформації.
 */
public interface UserService {

    /**
     * Реєстрація нового користувача.
     *
     * @param request дані для створення облікового запису
     */
    void register(RegisterRequest request);

    /**
     * Отримання профілю користувача за email.
     *
     * @param email електронна пошта
     * @return дані профілю
     */
    UserProfileResponse getProfile(String email);

    /**
     * Оновлення профілю користувача.
     *
     * @param request оновлені дані
     */
    void updateProfile(UserUpdateRequest request);
}
