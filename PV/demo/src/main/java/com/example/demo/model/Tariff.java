package com.example.demo.model;

import jakarta.persistence.*;

/**
 * Сутність, що описує тариф на електроенергію,
 * який використовується для фінансового розрахунку прибутку.
 */
@Entity
@Table(name = "tariffs")
public class Tariff extends BaseEntity {

    /** Назва тарифного плану (наприклад, "Зелений тариф", "Комерційний") */
    @Column(nullable = false)
    private String name;

    /** Вартість за 1 кВт·год */
    @Column(nullable = false)
    private double pricePerKwh;

    /** Валюта (наприклад, "UAH", "EUR", "USD") */
    @Column(nullable = false)
    private String currency;

    /** Короткий опис тарифу */
    private String description;

    // --- Конструктори ---

    public Tariff() {}

    public Tariff(String name, double pricePerKwh, String currency, String description) {
        this.name = name;
        this.pricePerKwh = pricePerKwh;
        this.currency = currency;
        this.description = description;
    }

    // --- Геттери та сеттери ---

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerKwh() {
        return pricePerKwh;
    }

    public void setPricePerKwh(double pricePerKwh) {
        this.pricePerKwh = pricePerKwh;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
