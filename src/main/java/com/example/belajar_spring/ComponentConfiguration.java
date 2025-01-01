package com.example.belajar_spring;

import com.example.belajar_spring.model.MultiFoos;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com/example/belajar_spring/service",
        "com/example/belajar_spring/repository",
        "com/example/belajar_spring/configuration"
})
@Import(MultiFoos.class)
public class ComponentConfiguration {
}
