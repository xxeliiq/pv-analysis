package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Сутність, що зберігає результати розрахунків для проєкту СЕС.
 * Включає енергію, доходи, втрати, строк окупності та дату розрахунку.
 */
@Entity
@Table(name = "calculation_results")
public class CalculationResult extends BaseEntity {

    /** Загальна вироблена енергія (кВт·год) */
    private double totalEnergy;

    /** Сумарні втрати енергії в системі (%) */
    private double totalLosses;

    /** Очікуваний прибуток (у грошових одиницях) */
    private double expectedProfit;

    /** Строк окупності (у роках) */
    private double paybackPeriod;

    /** Час останнього розрахунку */
    private LocalDateTime calculatedAt;

    /** Зв’язок з проєктом */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    // --- Геттери та сеттери ---

    public double getTotalEnergy() {
        return totalEnergy;
    }

    public void setTotalEnergy(double totalEnergy) {
        this.totalEnergy = totalEnergy;
    }

    public double getTotalLosses() {
        return totalLosses;
    }

    public void setTotalLosses(double totalLosses) {
        this.totalLosses = totalLosses;
    }

    public double getExpectedProfit() {
        return expectedProfit;
    }

    public void setExpectedProfit(double expectedProfit) {
        this.expectedProfit = expectedProfit;
    }

    public double getPaybackPeriod() {
        return paybackPeriod;
    }

    public void setPaybackPeriod(double paybackPeriod) {
        this.paybackPeriod = paybackPeriod;
    }

    public LocalDateTime getCalculatedAt() {
        return calculatedAt;
    }

    public void setCalculatedAt(LocalDateTime calculatedAt) {
        this.calculatedAt = calculatedAt;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
