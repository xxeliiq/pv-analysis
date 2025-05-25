package com.example.demo.service.impl;

import com.example.demo.model.Panel;
import com.example.demo.service.PanelService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Сервіс для отримання довідкової інформації про сонячні панелі.
 */
@Service
public class PanelServiceImpl implements PanelService {

    @Override
    public List<Panel> getAvailablePanels() {
        return Arrays.asList(
                new Panel("Longi LR5-66HIH 500M", 0.21, 500),
                new Panel("JA Solar JAM60S20-390/MR", 0.20, 390),
                new Panel("Trina Solar TSM-DE09.05 375W", 0.198, 375)
        );
    }
}
