package com.example.enkai.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/users/**")
                .allowedOrigins("http://localhost:5173")
                .allowedMethods("GET", "POST","OPTIONS")
                .allowCredentials(true)
                .allowedHeaders("*")
                .maxAge(3600);
//                .allowedHeaders("Authorization");
    }
}