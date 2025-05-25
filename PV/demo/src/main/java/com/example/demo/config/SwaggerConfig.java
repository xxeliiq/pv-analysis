package com.example.demo.config;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI pvAnalysisOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Онлайн-платформа для PV-аналізу СЕС")
                        .description("API-документація для системи прогнозування та аналізу сонячних електростанцій")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Команда розробки")
                                .email("support@pv-platform.com")
                                .url("https://pv-platform.com")
                        )
                )
                .servers(List.of(new Server().url("http://localhost:8080").description("Локальне середовище")));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public-api")
                .pathsToMatch("/api/**")
                .build();
    }
}
