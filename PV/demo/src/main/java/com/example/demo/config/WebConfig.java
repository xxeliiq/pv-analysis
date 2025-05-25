package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // Дозволяємо CORS (для взаємодії з фронтендом)
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000") // або замінити на свій фронтенд
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }

    // Обробка статичних ресурсів
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }

    // Налаштування локалізації (необов'язково)
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // Можна додати сторінку за замовчуванням
        registry.addViewController("/").setViewName("index");
    }
}
