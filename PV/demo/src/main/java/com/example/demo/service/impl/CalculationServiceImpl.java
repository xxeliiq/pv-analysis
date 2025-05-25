package com.example.demo.service.impl;

import com.example.demo.model.CalculationResult;
import com.example.demo.model.Project;
import com.example.demo.service.CalculationService;
import org.springframework.stereotype.Service;

/**
 * Реалізація сервісу розрахунків PV-генерації та ефективності.
 */
@Service
public class CalculationServiceImpl implements CalculationService {

    @Override
    public CalculationResult calculateForProject(Project project) {
        // Простий приклад розрахунку базової генерації

        double panelEfficiency = 0.18; // ефективність панелі
        double averageIrradiance = 4.5; // середня денна інсоляція (кВт·год/м²)
        double panelPower = 400; // потужність однієї панелі (Вт)
        int daysPerYear = 365;

        // Розрахунок продуктивності в кВт·год
        double dailyGeneration = project.getPanelCount() * panelPower / 1000 * averageIrradiance * panelEfficiency;
        double annualGeneration = dailyGeneration * daysPerYear;

        CalculationResult result = new CalculationResult();
        result.setAnnualGenerationKwh(annualGeneration);
        result.setDailyGenerationKwh(dailyGeneration);
        result.setLossPercentage(0.12); // втрати за замовчуванням 12%
        result.setProject(project);

        return result;
    }
}
