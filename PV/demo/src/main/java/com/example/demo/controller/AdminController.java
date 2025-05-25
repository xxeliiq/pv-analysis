package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final UserService userService;
    private final PanelService panelService;
    private final InverterService inverterService;
    private final TariffService tariffService;

    public AdminController(UserService userService,
                           PanelService panelService,
                           InverterService inverterService,
                           TariffService tariffService) {
        this.userService = userService;
        this.panelService = panelService;
        this.inverterService = inverterService;
        this.tariffService = tariffService;
    }

    // 🔸 Отримати список усіх користувачів
    @GetMapping("/users")
    public ResponseEntity<List<UserProfileResponse>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // 🔸 Деактивація користувача
    @PutMapping("/users/{username}/deactivate")
    public ResponseEntity<Void> deactivateUser(@PathVariable String username) {
        userService.deactivateUser(username);
        return ResponseEntity.ok().build();
    }

    // 🔸 Додавання нової панелі
    @PostMapping("/panels")
    public ResponseEntity<PanelResponse> addPanel(@Valid @RequestBody PanelRequest request) {
        return ResponseEntity.ok(panelService.createPanel(request));
    }

    // 🔸 Додавання нового інвертора
    @PostMapping("/inverters")
    public ResponseEntity<InverterResponse> addInverter(@Valid @RequestBody InverterRequest request) {
        return ResponseEntity.ok(inverterService.createInverter(request));
    }

    // 🔸 Оновлення тарифу
    @PutMapping("/tariff")
    public ResponseEntity<TariffResponse> updateTariff(@Valid @RequestBody TariffRequest request) {
        return ResponseEntity.ok(tariffService.updateTariff(request));
    }
}
