package com.example.demo.service;

import com.example.demo.model.Panel;

import java.util.List;

/**
 * Сервіс для роботи з довідником сонячних панелей.
 */
public interface PanelService {

    /**
     * Повертає список усіх доступних сонячних панелей.
     *
     * @return список панелей
     */
    List<Panel> getAvailablePanels();
}
