package com.example.demo.service;

import com.example.demo.model.Inverter;

import java.util.List;

/**
 * Сервіс для роботи з довідником інверторів.
 */
public interface InverterService {

    /**
     * Повертає список усіх доступних інверторів.
     *
     * @return список інверторів
     */
    List<Inverter> getAvailableInverters();
}
