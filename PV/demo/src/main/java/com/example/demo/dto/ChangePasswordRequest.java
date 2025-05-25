package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * DTO-запит для зміни пароля користувача.
 * Використовується у профілі або при відновленні доступу.
 */
public class ChangePasswordRequest {

    /** Поточний пароль (опціонально, залежить від сценарію) */
    private String currentPassword;

    /** Новий пароль, який хоче встановити користувач */
    @NotBlank(message = "Новий пароль не може бути порожнім")
    @Size(min = 6, message = "Пароль повинен містити щонайменше 6 символів")
    private String newPassword;

    /** Повторення нового пароля для підтвердження */
    @NotBlank(message = "Підтвердження пароля є обов’язковим")
    private String confirmPassword;

    public ChangePasswordRequest() {}

    public ChangePasswordRequest(String currentPassword, String newPassword, String confirmPassword) {
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
        this.confirmPassword = confirmPassword;
    }

    // Геттери та сеттери

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
