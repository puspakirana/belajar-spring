package com.example.belajar_spring;

import com.example.belajar_spring.configuration.BarConfiguration;
import com.example.belajar_spring.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class,
})
public class MainConfiguration {
}
