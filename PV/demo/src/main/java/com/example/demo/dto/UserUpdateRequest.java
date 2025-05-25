package com.example.demo.dto;

import jakarta.validation.constraints.*;

/**
 * DTO-запит для оновлення даних профілю користувача.
 * Може використовуватись як у кабінеті користувача, так і в адміністративній панелі.
 */
public class UserUpdateRequest {

    /** Нове ім’я користувача */
    @NotBlank(message = "Ім’я не може бути порожнім")
    private String firstName;

    /** Нове прізвище користувача */
    @NotBlank(message = "Прізвище не може бути порожнім")
    private String lastName;

    /** Нова електронна адреса */
    @Email(message = "Неправильний формат електронної пошти")
    @NotBlank(message = "Email обов’язковий")
    private String email;

    /** Пароль (може залишатися незмінним, якщо не редагується) */
    @Size(min = 6, message = "Пароль має містити щонайменше 6 символів")
    private String password;

    /** Роль користувача (лише для адміністратора) */
    private String role;

    public UserUpdateRequest() {}

    public UserUpdateRequest(String firstName, String lastName, String email, String password, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Геттери та сеттери

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
