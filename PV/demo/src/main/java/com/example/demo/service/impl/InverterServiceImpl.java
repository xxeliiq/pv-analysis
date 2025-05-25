package com.example.demo.service.impl;

import com.example.demo.model.Inverter;
import com.example.demo.model.Panel;
import com.example.demo.service.InverterService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Сервіс для отримання довідкової інформації про інвертори.
 */
@Service
public class InverterServiceImpl implements InverterService {

    @Override
    public List<Inverter> getAvailableInverters() {
        return Arrays.asList(
                new Inverter("Huawei SUN2000-5KTL-M1", 5000, 98.6),
                new Inverter("SMA Sunny Boy 3.0", 3000, 97.5),
                new Inverter("Fronius Primo 6.0-1", 6000, 98.1)
        );
    }
}
