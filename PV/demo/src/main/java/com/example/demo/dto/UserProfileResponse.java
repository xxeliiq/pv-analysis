package com.example.demo.dto;

/**
 * DTO-відповідь для виводу інформації про профіль користувача.
 * Виводиться у кабінеті користувача після авторизації.
 */
public class UserProfileResponse {

    /** Унікальний ідентифікатор користувача */
    private Long id;

    /** Ім’я користувача */
    private String firstName;

    /** Прізвище користувача */
    private String lastName;

    /** Електронна адреса */
    private String email;

    /** Роль користувача (наприклад, USER, ADMIN) */
    private String role;

    /** Загальна кількість збережених проєктів */
    private int totalProjects;

    public UserProfileResponse() {}

    public UserProfileResponse(Long id, String firstName, String lastName,
                               String email, String role, int totalProjects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.totalProjects = totalProjects;
    }

    // Геттери і сеттери

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(int totalProjects) {
        this.totalProjects = totalProjects;
    }
}
