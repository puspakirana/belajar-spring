package com.example.belajar_spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com/example/belajar_spring/service",
        "com/example/belajar_spring/repository",
        "com/example/belajar_spring/configuration"
})
public class ComponentConfiguration {
}
