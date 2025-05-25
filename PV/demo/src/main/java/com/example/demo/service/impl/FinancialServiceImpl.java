package com.example.demo.service.impl;

import com.example.demo.dto.CalculationResponse;
import com.example.demo.model.CalculationResult;
import com.example.demo.service.FinancialService;
import org.springframework.stereotype.Service;

/**
 * Сервіс фінансового аналізу на основі результатів генерації.
 */
@Service
public class FinancialServiceImpl implements FinancialService {

    private static final double TARIFF = 0.16; // Тариф (наприклад, $/кВт·год)
    private static final double SYSTEM_COST = 8000.0; // Початкова вартість системи

    @Override
    public CalculationResponse mapToResponse(CalculationResult result) {
        double annualEnergy = result.getAnnualGenerationKwh();
        double lossFactor = 1.0 - result.getLossPercentage();

        double adjustedAnnual = annualEnergy * lossFactor;
        double income = adjustedAnnual * TARIFF;
        double paybackPeriod = SYSTEM_COST / income;

        CalculationResponse response = new CalculationResponse();
        response.setDailyKwh(result.getDailyGenerationKwh());
        response.setAnnualKwh(adjustedAnnual);
        response.setEstimatedIncome(income);
        response.setPaybackYears(paybackPeriod);
        response.setLossPercentage(result.getLossPercentage());

        return response;
    }
}
