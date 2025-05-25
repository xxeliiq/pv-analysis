package com.example.demo.service;

import com.example.demo.model.Project;

/**
 * Сервіс для інтеграції з погодними API (наприклад, OpenWeatherMap) і додавання даних інсоляції до проєкту.
 */
public interface WeatherService {

    /**
     * Збагачує проєкт даними про сонячну інсоляцію для конкретної геолокації.
     *
     * @param project об'єкт проєкту, що містить широту і довготу
     */
    void enrichProjectWithWeather(Project project);
}
