package com.example.demo.dto;

import jakarta.validation.constraints.*;

/**
 * DTO-запит для створення або оновлення проєкту користувача.
 * Містить вхідні параметри, що необхідні для PV-аналізу.
 */
public class ProjectRequest {

    /** Назва проєкту (задається користувачем) */
    @NotBlank(message = "Назва проєкту є обов’язковою")
    private String name;

    /** Географічна широта місця встановлення */
    @DecimalMin(value = "-90.0", inclusive = true)
    @DecimalMax(value = "90.0", inclusive = true)
    private double latitude;

    /** Географічна довгота місця встановлення */
    @DecimalMin(value = "-180.0", inclusive = true)
    @DecimalMax(value = "180.0", inclusive = true)
    private double longitude;

    /** Ідентифікатор обраної сонячної панелі */
    @NotNull(message = "Потрібно обрати сонячну панель")
    private Long panelId;

    /** Ідентифікатор обраного інвертора */
    @NotNull(message = "Потрібно обрати інвертор")
    private Long inverterId;

    /** Кількість панелей у системі */
    @Min(value = 1, message = "Кількість панелей повинна бути не менше 1")
    private int panelCount;

    /** Площа доступного даху або ділянки, м² (опціонально) */
    private Double area;

    /** Ідентифікатор тарифного плану */
    private Long tariffId;

    public ProjectRequest() {}

    public ProjectRequest(String name, double latitude, double longitude,
                          Long panelId, Long inverterId, int panelCount, Double area, Long tariffId) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.panelId = panelId;
        this.inverterId = inverterId;
        this.panelCount = panelCount;
        this.area = area;
        this.tariffId = tariffId;
    }

    // Геттери та сеттери

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

    public int getPanelCount() {
        return panelCount;
    }

    public void setPanelCount(int panelCount) {
        this.panelCount = panelCount;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Long getTariffId() {
        return tariffId;
    }

    public void setTariffId(Long tariffId) {
        this.tariffId = tariffId;
    }
}
