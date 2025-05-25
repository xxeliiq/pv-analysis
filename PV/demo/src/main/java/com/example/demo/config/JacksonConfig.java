package com.example.demo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();

        // Формат дати: yyyy-MM-dd
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        mapper.setTimeZone(TimeZone.getTimeZone("Europe/Kyiv"));

        // Використання Java 8 дат
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        // Пропуск null-значень
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        // Зробити insensitive для json-ключів
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);

        // Обробка невідомих властивостей
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        // Українська локаль
        mapper.setLocale(new Locale("uk", "UA"));

        return mapper;
    }
}
