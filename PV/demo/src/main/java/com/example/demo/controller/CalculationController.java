package com.example.demo.controller;

import com.example.demo.dto.CalculationRequest;
import com.example.demo.dto.CalculationResponse;
import com.example.demo.service.CalculationService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/calculate")
public class CalculationController {

    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    // Розрахунок генерації енергії для обраного проєкту
    @PostMapping
    public ResponseEntity<CalculationResponse> calculate(
            @AuthenticationPrincipal UserDetails userDetails,
            @Valid @RequestBody CalculationRequest request) {

        CalculationResponse result = calculationService.calculateGeneration(userDetails.getUsername(), request);
        return ResponseEntity.ok(result);
    }
}
