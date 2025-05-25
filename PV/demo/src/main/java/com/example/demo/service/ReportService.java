package com.example.demo.service;

import com.example.demo.dto.CalculationResponse;

/**
 * Сервіс для створення PDF/Excel-звітів за результатами аналізу.
 */
public interface ReportService {

    /**
     * Генерує PDF-звіт на основі результатів PV-аналізу.
     *
     * @param response відповідь з розрахунковими та фінансовими показниками
     * @return масив байтів PDF-файлу
     */
    byte[] generatePdf(CalculationResponse response);

    /**
     * Генерує Excel-файл для детального аналізу.
     *
     * @param response відповідь з розрахунковими та фінансовими показниками
     * @return масив байтів Excel-файлу
     */
    byte[] generateExcel(CalculationResponse response);
}
