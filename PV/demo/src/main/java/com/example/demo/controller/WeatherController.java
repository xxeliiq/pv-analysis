package com.example.demo.controller;

import com.example.demo.dto.WeatherResponse;
import com.example.demo.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    // Отримання метеоданих за координатами
    @GetMapping
    public ResponseEntity<WeatherResponse> getWeatherData(
            @RequestParam("lat") double latitude,
            @RequestParam("lon") double longitude) {
        WeatherResponse response = weatherService.getWeatherData(latitude, longitude);
        return ResponseEntity.ok(response);
    }
}
