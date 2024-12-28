package com.example.belajar_spring;

import com.example.belajar_spring.model.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void dependsOnTest() {
        Foo foo = applicationContext.getBean(Foo.class);
    }

}
