package com.example.demo.dto;

import jakarta.validation.constraints.*;

/**
 * DTO-запит для створення або редагування інвертора в системі.
 * Включає базові параметри інвертора, необхідні для розрахунків і каталогізації.
 */
public class InverterRequest {

    /** Назва інвертора (наприклад, Huawei SUN2000-10KTL) */
    @NotBlank(message = "Назва інвертора обов’язкова")
    private String name;

    /** Максимальна потужність змінного струму, кВт */
    @Positive(message = "Потужність має бути додатною")
    private double acPowerKw;

    /** ККД інвертора (наприклад, 98.2%) */
    @DecimalMin(value = "80.0", message = "ККД повинен бути не менше 80%")
    @DecimalMax(value = "100.0", message = "ККД не може перевищувати 100%")
    private double efficiencyPercent;

    /** Мінімальна вхідна напруга постійного струму, В */
    @Positive(message = "Вхідна напруга повинна бути додатною")
    private int minInputVoltage;

    /** Максимальна вхідна напруга постійного струму, В */
    @Positive(message = "Вхідна напруга повинна бути додатною")
    private int maxInputVoltage;

    public InverterRequest() {}

    public InverterRequest(String name, double acPowerKw, double efficiencyPercent,
                           int minInputVoltage, int maxInputVoltage) {
        this.name = name;
        this.acPowerKw = acPowerKw;
        this.efficiencyPercent = efficiencyPercent;
        this.minInputVoltage = minInputVoltage;
        this.maxInputVoltage = maxInputVoltage;
    }

    // Геттери і сеттери

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAcPowerKw() {
        return acPowerKw;
    }

    public void setAcPowerKw(double acPowerKw) {
        this.acPowerKw = acPowerKw;
    }

    public double getEfficiencyPercent() {
        return efficiencyPercent;
    }

    public void setEfficiencyPercent(double efficiencyPercent) {
        this.efficiencyPercent = efficiencyPercent;
    }

    public int getMinInputVoltage() {
        return minInputVoltage;
    }

    public void setMinInputVoltage(int minInputVoltage) {
        this.minInputVoltage = minInputVoltage;
    }

    public int getMaxInputVoltage() {
        return maxInputVoltage;
    }

    public void setMaxInputVoltage(int maxInputVoltage) {
        this.maxInputVoltage = maxInputVoltage;
    }
}
