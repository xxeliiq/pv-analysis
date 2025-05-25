package com.example.demo.dto;

import jakarta.validation.constraints.*;

/**
 * DTO для надсилання вхідних параметрів у модуль розрахунку PV-генерації.
 * Містить геолокацію, параметри СЕС, орієнтацію, втрати тощо.
 */
public class CalculationRequest {

    /** Географічна широта об'єкта */
    @NotNull(message = "Широта обов’язкова")
    private Double latitude;

    /** Географічна довгота об'єкта */
    @NotNull(message = "Довгота обов’язкова")
    private Double longitude;

    /** ID обраної сонячної панелі */
    @NotNull(message = "Панель обов’язкова")
    private Long panelId;

    /** ID обраного інвертора */
    @NotNull(message = "Інвертор обов’язковий")
    private Long inverterId;

    /** Загальна встановлена потужність системи, кВт */
    @Positive(message = "Потужність має бути додатною")
    private Double systemPowerKw;

    /** Кут нахилу панелей (0–90 градусів) */
    @Min(0) @Max(90)
    private Integer tiltAngle;

    /** Орієнтація панелей (азимут, градуси: 0 = північ, 180 = південь) */
    @Min(0) @Max(360)
    private Integer azimuth;

    /** Загальні втрати системи у відсотках (наприклад, 15) */
    @Min(0) @Max(100)
    private Double lossFactorPercent;

    // Конструктори
    public CalculationRequest() {}

    public CalculationRequest(Double latitude, Double longitude, Long panelId, Long inverterId,
                              Double systemPowerKw, Integer tiltAngle, Integer azimuth, Double lossFactorPercent) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.panelId = panelId;
        this.inverterId = inverterId;
        this.systemPowerKw = systemPowerKw;
        this.tiltAngle = tiltAngle;
        this.azimuth = azimuth;
        this.lossFactorPercent = lossFactorPercent;
    }

    // Геттери і сеттери
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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

    public Double getSystemPowerKw() {
        return systemPowerKw;
    }

    public void setSystemPowerKw(Double systemPowerKw) {
        this.systemPowerKw = systemPowerKw;
    }

    public Integer getTiltAngle() {
        return tiltAngle;
    }

    public void setTiltAngle(Integer tiltAngle) {
        this.tiltAngle = tiltAngle;
    }

    public Integer getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(Integer azimuth) {
        this.azimuth = azimuth;
    }

    public Double getLossFactorPercent() {
        return lossFactorPercent;
    }

    public void setLossFactorPercent(Double lossFactorPercent) {
        this.lossFactorPercent = lossFactorPercent;
    }
}
