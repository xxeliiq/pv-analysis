package com.example.demo.dto;

/**
 * DTO-відповідь для відображення параметрів інвертора.
 * Повертається після додавання, редагування або під час перегляду.
 */
public class InverterResponse {

    /** Унікальний ідентифікатор інвертора */
    private Long id;

    /** Назва моделі інвертора */
    private String name;

    /** Потужність на стороні змінного струму, кВт */
    private double acPowerKw;

    /** ККД інвертора, % */
    private double efficiencyPercent;

    /** Мінімальна вхідна напруга, В */
    private int minInputVoltage;

    /** Максимальна вхідна напруга, В */
    private int maxInputVoltage;

    public InverterResponse() {}

    public InverterResponse(Long id, String name, double acPowerKw, double efficiencyPercent,
                            int minInputVoltage, int maxInputVoltage) {
        this.id = id;
        this.name = name;
        this.acPowerKw = acPowerKw;
        this.efficiencyPercent = efficiencyPercent;
        this.minInputVoltage = minInputVoltage;
        this.maxInputVoltage = maxInputVoltage;
    }

    // Геттери і сеттери

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
