package com.example.belajar_spring.configuration;

import com.example.belajar_spring.model.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    public Bar bar() {
        return new Bar();
    }
}
