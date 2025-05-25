package com.example.demo.dto;

import java.util.Map;

/**
 * DTO для повернення результатів розрахунку продуктивності PV-системи.
 * Містить енергетичні показники, фінансові дані, втрати та графіки.
 */
public class CalculationResponse {

    /** Загальне річне виробництво, кВт·год */
    private double annualProductionKwh;

    /** Середньодобове виробництво, кВт·год/день */
    private double averageDailyProductionKwh;

    /** Очікуваний дохід, грн/рік */
    private double annualRevenueUah;

    /** Загальні втрати системи, % */
    private double totalLossPercent;

    /** Середньомісячна генерація, кВт·год */
    private Map<String, Double> monthlyProductionKwh;

    /** Додаткова інформація (наприклад, Pmax, коефіцієнт продуктивності) */
    private Map<String, String> additionalInfo;

    // Конструктор без параметрів
    public CalculationResponse() {}

    // Повний конструктор
    public CalculationResponse(double annualProductionKwh,
                               double averageDailyProductionKwh,
                               double annualRevenueUah,
                               double totalLossPercent,
                               Map<String, Double> monthlyProductionKwh,
                               Map<String, String> additionalInfo) {
        this.annualProductionKwh = annualProductionKwh;
        this.averageDailyProductionKwh = averageDailyProductionKwh;
        this.annualRevenueUah = annualRevenueUah;
        this.totalLossPercent = totalLossPercent;
        this.monthlyProductionKwh = monthlyProductionKwh;
        this.additionalInfo = additionalInfo;
    }

    // Геттери і сеттери
    public double getAnnualProductionKwh() {
        return annualProductionKwh;
    }

    public void setAnnualProductionKwh(double annualProductionKwh) {
        this.annualProductionKwh = annualProductionKwh;
    }

    public double getAverageDailyProductionKwh() {
        return averageDailyProductionKwh;
    }

    public void setAverageDailyProductionKwh(double averageDailyProductionKwh) {
        this.averageDailyProductionKwh = averageDailyProductionKwh;
    }

    public double getAnnualRevenueUah() {
        return annualRevenueUah;
    }

    public void setAnnualRevenueUah(double annualRevenueUah) {
        this.annualRevenueUah = annualRevenueUah;
    }

    public double getTotalLossPercent() {
        return totalLossPercent;
    }

    public void setTotalLossPercent(double totalLossPercent) {
        this.totalLossPercent = totalLossPercent;
    }

    public Map<String, Double> getMonthlyProductionKwh() {
        return monthlyProductionKwh;
    }

    public void setMonthlyProductionKwh(Map<String, Double> monthlyProductionKwh) {
        this.monthlyProductionKwh = monthlyProductionKwh;
    }

    public Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
