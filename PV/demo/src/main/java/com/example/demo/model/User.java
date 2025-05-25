package com.example.demo.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Сутність, що представляє користувача системи.
 * Містить дані для автентифікації та профільну інформацію.
 */
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    /** Унікальний логін користувача */
    @Column(nullable = false, unique = true)
    private String username;

    /** Електронна адреса */
    @Column(nullable = false, unique = true)
    private String email;

    /** Хешований пароль */
    @Column(nullable = false)
    private String password;

    /** Ім’я користувача (для відображення в інтерфейсі) */
    private String firstName;

    /** Прізвище користувача */
    private String lastName;

    /** Роль користувача у системі */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    /** Чи активний обліковий запис */
    private boolean active = true;

    /** Список проєктів, створених користувачем */
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Project> projects = new HashSet<>();

    // --- Конструктори ---

    public User() {}

    public User(String username, String email, String password, Role role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // --- Геттери та сеттери ---

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
