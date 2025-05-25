package com.example.demo.service.impl;

import com.example.demo.dto.CalculationRequest;
import com.example.demo.dto.CalculationResponse;
import com.example.demo.model.CalculationResult;
import com.example.demo.model.Panel;
import com.example.demo.model.Project;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Фасад, який координує повний процес аналізу СЕС: від геолокації до фінансового результату.
 */
@Service
public class AnalysisFacadeImpl implements AnalysisFacade {

    private final PanelService panelService;
    private final WeatherService weatherService;
    private final CalculationService calculationService;
    private final FinancialService financialService;

    @Autowired
    public AnalysisFacadeImpl(PanelService panelService,
                              WeatherService weatherService,
                              CalculationService calculationService,
                              FinancialService financialService) {
        this.panelService = panelService;
        this.weatherService = weatherService;
        this.calculationService = calculationService;
        this.financialService = financialService;
    }

    @Override
    public CalculationResponse analyze(CalculationRequest request) {
        // Крок 1: Створення проєкту на основі запиту
        Project project = new Project();
        project.setLatitude(request.getLatitude());
        project.setLongitude(request.getLongitude());
        project.setPanelCount(request.getPanelCount());

        // Крок 2: Отримання характеристик панелі
        Optional<Panel> panel = panelService.getAvailablePanels().stream()
                .filter(p -> p.getName().equals(request.getPanelName()))
                .findFirst();

        panel.ifPresent(p -> {
            project.setPanelPower(p.getPower());
            project.setPanelEfficiency(p.getEfficiency());
        });

        // Крок 3: Отримання погодних умов для локації
        weatherService.enrichProjectWithWeather(project);

        // Крок 4: Розрахунок генерації
        CalculationResult result = calculationService.calculateForProject(project);

        // Крок 5: Формування фінансового результату
        return financialService.mapToResponse(result);
    }
}
