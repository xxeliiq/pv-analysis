package com.example.demo.service;

import com.example.demo.dto.CalculationResponse;
import com.example.demo.model.CalculationResult;

/**
 * Сервіс фінансового аналізу для результатів PV-розрахунку.
 */
public interface FinancialService {

    /**
     * Перетворює технічні результати розрахунку на фінансову відповідь.
     *
     * @param result результат генерації енергії
     * @return сформована відповідь із фінансовими показниками
     */
    CalculationResponse mapToResponse(CalculationResult result);
}
