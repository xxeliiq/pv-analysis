package com.example.demo.dto;

import jakarta.validation.constraints.*;

/**
 * DTO-запит для додавання або редагування тарифного плану в системі.
 * Визначає параметри тарифу, які використовуються у фінансових розрахунках.
 */
public class TariffRequest {

    /** Назва тарифу (наприклад, "Зелений тариф 2024") */
    @NotBlank(message = "Назва тарифу є обов’язковою")
    private String name;

    /** Значення тарифу, грн за 1 кВт·год */
    @Positive(message = "Тариф повинен бути додатним")
    private double pricePerKwh;

    /** Валюта (наприклад, "UAH", "EUR") */
    @NotBlank(message = "Валюта є обов’язковою")
    private String currency;

    /** Дата початку дії тарифу (формат: YYYY-MM-DD) */
    @NotBlank(message = "Дата початку дії є обов’язковою")
    private String validFrom;

    /** Дата завершення дії тарифу (опціонально) */
    private String validTo;

    public TariffRequest() {}

    public TariffRequest(String name, double pricePerKwh, String currency, String validFrom, String validTo) {
        this.name = name;
        this.pricePerKwh = pricePerKwh;
        this.currency = currency;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    // Геттери і сеттери

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

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }
}
