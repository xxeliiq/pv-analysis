package com.example.demo.service.impl;

import com.example.demo.model.Project;
import com.example.demo.service.WeatherService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Сервіс для емуляції отримання погодних даних. У реальному сценарії – інтеграція з OpenWeatherMap API.
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    private final Random random = new Random();

    @Override
    public void enrichProjectWithWeather(Project project) {
        // Тут має бути інтеграція з зовнішнім API (OpenWeatherMap), поки – симуляція
        double simulatedIrradiance = 3.5 + (random.nextDouble() * 3.0); // 3.5–6.5 кВт·год/м²
        project.setAverageIrradiance(simulatedIrradiance);
    }
}
