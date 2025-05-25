package com.example.demo.dto;

import java.time.LocalDateTime;

/**
 * DTO-відповідь для передачі погодних даних на основі координат.
 * Дані використовуються в енергетичних розрахунках онлайн-платформи.
 */
public class WeatherResponse {

    /** Назва локації (населений пункт або регіон) */
    private String locationName;

    /** Температура повітря, °C */
    private double temperatureCelsius;

    /** Хмарність, % */
    private double cloudCoveragePercent;

    /** Атмосферний тиск, гПа */
    private int pressure;

    /** Швидкість вітру, м/с */
    private double windSpeed;

    /** Вологість повітря, % */
    private int humidity;

    /** Поточна глобальна сонячна радіація, Вт/м² (опціонально, якщо підтримується) */
    private Double solarIrradiance;

    /** Час оновлення даних */
    private LocalDateTime timestamp;

    public WeatherResponse() {}

    public WeatherResponse(String locationName,
                           double temperatureCelsius,
                           double cloudCoveragePercent,
                           int pressure,
                           double windSpeed,
                           int humidity,
                           Double solarIrradiance,
                           LocalDateTime timestamp) {
        this.locationName = locationName;
        this.temperatureCelsius = temperatureCelsius;
        this.cloudCoveragePercent = cloudCoveragePercent;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.humidity = humidity;
        this.solarIrradiance = solarIrradiance;
        this.timestamp = timestamp;
    }

    // Геттери та сеттери

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public double getCloudCoveragePercent() {
        return cloudCoveragePercent;
    }

    public void setCloudCoveragePercent(double cloudCoveragePercent) {
        this.cloudCoveragePercent = cloudCoveragePercent;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public Double getSolarIrradiance() {
        return solarIrradiance;
    }

    public void setSolarIrradiance(Double solarIrradiance) {
        this.solarIrradiance = solarIrradiance;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
