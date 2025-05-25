package com.example.demo.service;

/**
 * Сервіс для надсилання повідомлень електронною поштою.
 */
public interface EmailService {

    /**
     * Надсилає email користувачу з темою та вмістом.
     *
     * @param toEmail адреса одержувача
     * @param subject тема листа
     * @param content основний текст повідомлення
     */
    void sendEmail(String toEmail, String subject, String content);
}
