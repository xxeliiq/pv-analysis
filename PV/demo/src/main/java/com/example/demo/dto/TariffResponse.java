package com.example.demo.dto;

import java.time.LocalDate;

/**
 * DTO-відповідь, яка використовується для передачі інформації про тариф користувачу або адміністратору.
 */
public class TariffResponse {

    /** Унікальний ідентифікатор тарифу */
    private Long id;

    /** Назва тарифу (наприклад, "Зелений тариф 2024") */
    private String name;

    /** Вартість електроенергії за 1 кВт·год у вибраній валюті */
    private double pricePerKwh;

    /** Валюта тарифу (наприклад, UAH, EUR) */
    private String currency;

    /** Дата початку дії тарифу */
    private LocalDate validFrom;

    /** Дата завершення дії тарифу (може бути null) */
    private LocalDate validTo;

    public TariffResponse() {}

    public TariffResponse(Long id, String name, double pricePerKwh, String currency,
                          LocalDate validFrom, LocalDate validTo) {
        this.id = id;
        this.name = name;
        this.pricePerKwh = pricePerKwh;
        this.currency = currency;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    // Геттери і сеттери

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }
}
