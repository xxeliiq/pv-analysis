package com.example.demo.service;

import com.example.demo.model.CalculationResult;
import com.example.demo.model.Project;

/**
 * Сервіс розрахунку продуктивності СЕС.
 */
public interface CalculationService {

    /**
     * Виконує розрахунок для заданого проєкту.
     *
     * @param project модель проєкту з параметрами панелей, геолокацією, погодою тощо
     * @return результат розрахунку генерації
     */
    CalculationResult calculateForProject(Project project);
}
