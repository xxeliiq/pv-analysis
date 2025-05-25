package com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * DTO-відповідь для відображення збереженого проєкту користувача.
 * Містить основні вхідні параметри, результати розрахунку та мета-інформацію.
 */
public class ProjectResponse {

    /** Унікальний ідентифікатор проєкту */
    private Long id;

    /** Назва проєкту */
    private String name;

    /** Координати розташування */
    private double latitude;
    private double longitude;

    /** Потужність встановленої системи, кВт */
    private double systemPowerKw;

    /** Кут нахилу панелей */
    private int tiltAngle;

    /** Орієнтація (азимут) */
    private int azimuth;

    /** ID моделі панелі */
    private Long panelId;

    /** ID моделі інвертора */
    private Long inverterId;

    /** Загальні втрати системи, % */
    private double lossFactorPercent;

    /** Очікувана річна генерація, кВт·год */
    private double annualYieldKwh;

    /** Очікуваний дохід, грн/рік */
    private double estimatedRevenueUah;

    /** Графік щомісячної генерації */
    private Map<String, Double> monthlyYieldKwh;

    /** Дата створення проєкту */
    private LocalDateTime createdAt;

    public ProjectResponse() {}

    public ProjectResponse(Long id, String name, double latitude, double longitude,
                           double systemPowerKw, int tiltAngle, int azimuth,
                           Long panelId, Long inverterId, double lossFactorPercent,
                           double annualYieldKwh, double estimatedRevenueUah,
                           Map<String, Double> monthlyYieldKwh, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.systemPowerKw = systemPowerKw;
        this.tiltAngle = tiltAngle;
        this.azimuth = azimuth;
        this.panelId = panelId;
        this.inverterId = inverterId;
        this.lossFactorPercent = lossFactorPercent;
        this.annualYieldKwh = annualYieldKwh;
        this.estimatedRevenueUah = estimatedRevenueUah;
        this.monthlyYieldKwh = monthlyYieldKwh;
        this.createdAt = createdAt;
    }

    // Геттери та сеттери (типові, повні)

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

    public double getSystemPowerKw() {
        return systemPowerKw;
    }

    public void setSystemPowerKw(double systemPowerKw) {
        this.systemPowerKw = systemPowerKw;
    }

    public int getTiltAngle() {
        return tiltAngle;
    }

    public void setTiltAngle(int tiltAngle) {
        this.tiltAngle = tiltAngle;
    }

    public int getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(int azimuth) {
        this.azimuth = azimuth;
    }

    public Long getPanelId() {
        return panelId;
    }

    public void setPanelId(Long panelId) {
        this.panelId = panelId;
    }

    public Long getInverterId() {
        return inverterId;
    }

    public void setInverterId(Long inverterId) {
        this.inverterId = inverterId;
    }

    public double getLossFactorPercent() {
        return lossFactorPercent;
    }

    public void setLossFactorPercent(double lossFactorPercent) {
        this.lossFactorPercent = lossFactorPercent;
    }

    public double getAnnualYieldKwh() {
        return annualYieldKwh;
    }

    public void setAnnualYieldKwh(double annualYieldKwh) {
        this.annualYieldKwh = annualYieldKwh;
    }

    public double getEstimatedRevenueUah() {
        return estimatedRevenueUah;
    }

    public void setEstimatedRevenueUah(double estimatedRevenueUah) {
        this.estimatedRevenueUah = estimatedRevenueUah;
    }

    public Map<String, Double> getMonthlyYieldKwh() {
        return monthlyYieldKwh;
    }

    public void setMonthlyYieldKwh(Map<String, Double> monthlyYieldKwh) {
        this.monthlyYieldKwh = monthlyYieldKwh;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
