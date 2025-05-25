package com.example.demo.service.impl;

import com.example.demo.model.Tariff;
import com.example.demo.service.TariffService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Сервіс для отримання тарифів на електроенергію (наприклад, зелений тариф, комерційний тощо).
 */
@Service
public class TariffServiceImpl implements TariffService {

    @Override
    public List<Tariff> getAllTariffs() {
        return Arrays.asList(
                new Tariff("Зелений тариф", 0.16, "Підтримка приватних СЕС"),
                new Tariff("Комерційний тариф", 0.12, "Тариф для бізнес-об'єктів"),
                new Tariff("Промисловий тариф", 0.10, "Оптовий тариф для великих СЕС")
        );
    }
}
