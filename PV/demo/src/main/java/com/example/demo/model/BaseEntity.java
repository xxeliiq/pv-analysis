package com.example.demo.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * Абстрактний базовий клас для всіх JPA-сутностей.
 * Містить загальні поля: id, дата створення, дата оновлення.
 */
@MappedSuperclass
public abstract class BaseEntity {

    /** Унікальний первинний ключ (генерується автоматично) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Час створення запису (заповнюється автоматично) */
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    /** Час останнього оновлення (заповнюється автоматично) */
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // --- Геттери та сеттери ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
