package com.example.demo.dto;

import jakarta.validation.constraints.*;

/**
 * DTO-запит для створення нового користувача (реєстрація).
 * Містить особисті дані та облікову інформацію.
 */
public class RegisterRequest {

    /** Ім’я користувача */
    @NotBlank(message = "Ім’я обов’язкове")
    private String firstName;

    /** Прізвище користувача */
    @NotBlank(message = "Прізвище обов’язкове")
    private String lastName;

    /** Електронна пошта (логін) */
    @Email(message = "Некоректна електронна адреса")
    @NotBlank(message = "Email є обов’язковим")
    private String email;

    /** Пароль користувача */
    @NotBlank(message = "Пароль не може бути порожнім")
    @Size(min = 6, message = "Пароль повинен містити щонайменше 6 символів")
    private String password;

    /** Підтвердження пароля (опціонально) — для фронтенду */
    // private String confirmPassword;

    public RegisterRequest() {}

    public RegisterRequest(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
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
}
