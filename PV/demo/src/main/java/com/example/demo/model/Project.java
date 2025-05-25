package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Головна сутність, що описує проєкт користувача для аналізу сонячної електростанції.
 */
@Entity
@Table(name = "projects")
public class Project extends BaseEntity {

    /** Назва проєкту */
    @Column(nullable = false)
    private String name;

    /** Дата створення проєкту */
    @Column(nullable = false)
    private LocalDateTime createdAt;

    /** Географічна широта */
    private double latitude;

    /** Географічна довгота */
    private double longitude;

    /** Джерело метеоданих (наприклад, "OpenWeatherMap") */
    private String weatherSource;

    /** Прив'язка до користувача */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    /** Вибраний тариф */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tariff_id")
    private Tariff tariff;

    /** Вибрана модель інвертора */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inverter_id")
    private Inverter inverter;

    /** Вибрана модель панелі */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "solar_panel_id")
    private SolarPanel solarPanel;

    /** Кількість панелей у проєкті */
    private int panelCount;

    /** Кут нахилу (опціонально) */
    private double tiltAngle;

    /** Орієнтація панелей (напр., "Південь", "Південний-схід") */
    private String orientation;

    // --- Конструктори ---

    public Project() {
        this.createdAt = LocalDateTime.now();
    }

    // --- Геттери та сеттери ---

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getWeatherSource() {
        return weatherSource;
    }

    public void setWeatherSource(String weatherSource) {
        this.weatherSource = weatherSource;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public Inverter getInverter() {
        return inverter;
    }

    public void setInverter(Inverter inverter) {
        this.inverter = inverter;
    }

    public SolarPanel getSolarPanel() {
        return solarPanel;
    }

    public void setSolarPanel(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }

    public int getPanelCount() {
        return panelCount;
    }

    public void setPanelCount(int panelCount) {
        this.panelCount = panelCount;
    }

    public double getTiltAngle() {
        return tiltAngle;
    }

    public void setTiltAngle(double tiltAngle) {
        this.tiltAngle = tiltAngle;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}
