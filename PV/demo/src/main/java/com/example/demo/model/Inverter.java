package com.example.demo.model;

import jakarta.persistence.*;

/**
 * Сутність, що описує інвертор — пристрій для перетворення постійного струму в змінний.
 * Використовується для підбору обладнання у PV-проєктах.
 */
@Entity
@Table(name = "inverters")
public class Inverter extends BaseEntity {

    /** Назва інвертора (модель або бренд) */
    @Column(nullable = false)
    private String name;

    /** Максимальна потужність інвертора у кВт */
    @Column(nullable = false)
    private double maxPower;

    /** ККД інвертора (коефіцієнт корисної дії, %) */
    @Column(nullable = false)
    private double efficiency;

    /** Чи підтримує віддалений моніторинг */
    private boolean supportsMonitoring;

    /** Короткий опис / коментар до моделі */
    private String description;

    // --- Конструктори ---

    public Inverter() {}

    public Inverter(String name, double maxPower, double efficiency, boolean supportsMonitoring, String description) {
        this.name = name;
        this.maxPower = maxPower;
        this.efficiency = efficiency;
        this.supportsMonitoring = supportsMonitoring;
        this.description = description;
    }

    // --- Геттери та сеттери ---

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public boolean isSupportsMonitoring() {
        return supportsMonitoring;
    }

    public void setSupportsMonitoring(boolean supportsMonitoring) {
        this.supportsMonitoring = supportsMonitoring;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
