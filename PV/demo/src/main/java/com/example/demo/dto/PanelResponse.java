package com.example.demo.dto;

/**
 * DTO-відповідь для виводу параметрів сонячної панелі.
 * Використовується для перегляду або отримання списку доступних моделей.
 */
public class PanelResponse {

    /** Унікальний ідентифікатор панелі */
    private Long id;

    /** Назва моделі панелі (наприклад, Trina TSM-450) */
    private String name;

    /** Потужність в пікових умовах, Вт (Wp) */
    private double powerWp;

    /** Ефективність панелі, у відсотках */
    private double efficiencyPercent;

    /** Довжина панелі в міліметрах */
    private int lengthMm;

    /** Ширина панелі в міліметрах */
    private int widthMm;

    /** Кількість фотоелементів */
    private int cellCount;

    public PanelResponse() {
    }

    public PanelResponse(Long id, String name, double powerWp, double efficiencyPercent,
                         int lengthMm, int widthMm, int cellCount) {
        this.id = id;
        this.name = name;
        this.powerWp = powerWp;
        this.efficiencyPercent = efficiencyPercent;
        this.lengthMm = lengthMm;
        this.widthMm = widthMm;
        this.cellCount = cellCount;
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
