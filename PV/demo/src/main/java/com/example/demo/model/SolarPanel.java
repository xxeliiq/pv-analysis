package com.example.demo.model;

import jakarta.persistence.*;

/**
 * Сутність, що описує сонячну панель, яка використовується у проєктах.
 * Містить основні параметри: потужність, ефективність, площу та тип.
 */
@Entity
@Table(name = "solar_panels")
public class SolarPanel extends BaseEntity {

    /** Назва моделі або виробника панелі */
    @Column(nullable = false)
    private String name;

    /** Номінальна потужність панелі, Вт */
    @Column(nullable = false)
    private double power; // W

    /** Ефективність перетворення сонячного світла, % */
    @Column(nullable = false)
    private double efficiency;

    /** Площа однієї панелі, м² */
    private double area;

    /** Тип панелі: моно-, полі-, тонкоплівкова тощо */
    private String type;

    /** Короткий опис або технічний коментар */
    private String description;

    // --- Конструктори ---

    public SolarPanel() {}

    public SolarPanel(String name, double power, double efficiency, double area, String type, String description) {
        this.name = name;
        this.power = power;
        this.efficiency = efficiency;
        this.area = area;
        this.type = type;
        this.description = description;
    }

    // --- Геттери та сеттери ---

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
