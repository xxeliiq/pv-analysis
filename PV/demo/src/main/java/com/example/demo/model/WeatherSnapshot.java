package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Сутність, що зберігає знімок метеоумов для конкретного проєкту та часу.
 * Використовується для аналітики, архівації та порівняння розрахунків.
 */
@Entity
@Table(name = "weather_snapshots")
public class WeatherSnapshot extends BaseEntity {

    /** Назва локації або координатна мітка */
    private String locationName;

    /** Географічна широта */
    private double latitude;

    /** Географічна довгота */
    private double longitude;

    /** Температура в градусах Цельсія */
    private double temperatureC;

    /** Хмарність, % */
    private double cloudiness;

    /** Атмосферний тиск у гПа */
    private int pressure;

    /** Вологість, % */
    private int humidity;

    /** Швидкість вітру, м/с */
    private double windSpeed;

    /** Потужність сонячної радіації, Вт/м² */
    private Double solarIrradiance;

    /** Дата та час знімка */
    private LocalDateTime timestamp;

    /** Зв’язок із проєктом (опційно) */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

    // --- Геттери та сеттери ---

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
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

    public double getTemperatureC() {
        return temperatureC;
    }

    public void setTemperatureC(double temperatureC) {
        this.temperatureC = temperatureC;
    }

    public double getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(double cloudiness) {
        this.cloudiness = cloudiness;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
