package com.example.belajar_spring;

import com.example.belajar_spring.model.Bar;
import com.example.belajar_spring.model.Foo;
import com.example.belajar_spring.model.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDependencyInjectionConfig {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }

}
