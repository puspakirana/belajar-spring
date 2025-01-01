package com.example.belajar_spring.configuration;

import com.example.belajar_spring.model.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FooConfiguration {
    @Bean
    @Primary
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return new Foo();
    }

    @Bean
    public Foo foo3() {
        return new Foo();
    }
}
