package com.example.demo.dto;

import jakarta.validation.constraints.*;

/**
 * DTO-запит для створення або редагування сонячної панелі.
 * Включає всі основні технічні характеристики, необхідні для PV-аналізу.
 */
public class PanelRequest {

    /** Назва моделі панелі */
    @NotBlank(message = "Назва панелі обов’язкова")
    private String name;

    /** Пікова потужність (Wp) */
    @Positive(message = "Потужність має бути додатною")
    private double powerWp;

    /** ККД панелі у відсотках (наприклад, 20.5) */
    @DecimalMin(value = "10.0", message = "ККД має бути не менше 10%")
    @DecimalMax(value = "25.0", message = "ККД не може перевищувати 25%")
    private double efficiencyPercent;

    /** Довжина панелі в міліметрах */
    @Positive(message = "Довжина має бути додатною")
    private int lengthMm;

    /** Ширина панелі в міліметрах */
    @Positive(message = "Ширина має бути додатною")
    private int widthMm;

    /** Кількість елементів (наприклад, 60, 72) */
    @Positive(message = "Кількість елементів має бути додатною")
    private int cellCount;

    public PanelRequest() {
    }

    public PanelRequest(String name, double powerWp, double efficiencyPercent,
                        int lengthMm, int widthMm, int cellCount) {
        this.name = name;
        this.powerWp = powerWp;
        this.efficiencyPercent = efficiencyPercent;
        this.lengthMm = lengthMm;
        this.widthMm = widthMm;
        this.cellCount = cellCount;
    }

    // Геттери і сеттери

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPowerWp() {
        return powerWp;
    }

    public void setPowerWp(double powerWp) {
        this.powerWp = powerWp;
    }

    public double getEfficiencyPercent() {
        return efficiencyPercent;
    }

    public void setEfficiencyPercent(double efficiencyPercent) {
        this.efficiencyPercent = efficiencyPercent;
    }

    public int getLengthMm() {
        return lengthMm;
    }

    public void setLengthMm(int lengthMm) {
        this.lengthMm = lengthMm;
    }

    public int getWidthMm() {
        return widthMm;
    }

    public void setWidthMm(int widthMm) {
        this.widthMm = widthMm;
    }

    public int getCellCount() {
        return cellCount;
    }

    public void setCellCount(int cellCount) {
        this.cellCount = cellCount;
    }
}
