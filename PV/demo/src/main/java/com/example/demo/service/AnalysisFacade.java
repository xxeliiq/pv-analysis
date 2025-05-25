package com.example.demo.service;

import com.example.demo.dto.CalculationRequest;
import com.example.demo.dto.CalculationResponse;

/**
 * Фасад для координації повного циклу аналізу СЕС: від вхідних параметрів до фінансової оцінки.
 */
public interface AnalysisFacade {

    /**
     * Виконує повний аналіз сонячної електростанції на основі вхідних даних.
     *
     * @param request вхідні параметри проєкту
     * @return відповідь з технічними і фінансовими результатами
     */
    CalculationResponse analyze(CalculationRequest request);
}
