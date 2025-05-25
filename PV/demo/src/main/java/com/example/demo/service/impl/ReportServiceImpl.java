package com.example.demo.service.impl;

import com.example.demo.dto.CalculationResponse;
import com.example.demo.service.ReportService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Сервіс для генерації текстових (поки що) звітів для користувача.
 */
@Service
public class ReportServiceImpl implements ReportService {

    @Override
    public String generateReport(CalculationResponse response) {
        StringBuilder sb = new StringBuilder();
        sb.append("==== Звіт про ефективність СЕС ====").append(System.lineSeparator());
        sb.append("Дата: ").append(LocalDate.now()).append(System.lineSeparator());
        sb.append("Щоденне виробництво: ").append(String.format("%.2f кВт·год", response.getDailyKwh())).append(System.lineSeparator());
        sb.append("Річне виробництво: ").append(String.format("%.2f кВт·год", response.getAnnualKwh())).append(System.lineSeparator());
        sb.append("Очікуваний дохід: ").append(String.format("%.2f $", response.getEstimatedIncome())).append(System.lineSeparator());
        sb.append("Втрати (від втрат енергії): ").append(String.format("%.2f %%", response.getLossPercentage() * 100)).append(System.lineSeparator());
        sb.append("Строк окупності: ").append(String.format("%.1f років", response.getPaybackYears())).append(System.lineSeparator());

        return sb.toString();
    }
}
