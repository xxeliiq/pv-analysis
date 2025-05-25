package com.example.demo.service;

import com.example.demo.dto.ProjectRequest;
import com.example.demo.model.Project;

import java.util.List;

/**
 * Сервіс для керування проєктами користувачів.
 */
public interface ProjectService {

    /**
     * Зберігає новий або оновлює існуючий проєкт користувача.
     *
     * @param request дані про проєкт
     */
    void save(ProjectRequest request);

    /**
     * Повертає список проєктів, пов’язаних з email користувача.
     *
     * @param userEmail електронна адреса користувача
     * @return список проєктів
     */
    List<Project> findAllByUser(String userEmail);

    /**
     * Видаляє проєкт за його ідентифікатором.
     *
     * @param projectId ідентифікатор проєкту
     */
    void delete(Long projectId);
}
