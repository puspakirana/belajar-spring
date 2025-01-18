package com.example.belajar_spring;

import com.example.belajar_spring.listener.LoginSuccessListener;
import com.example.belajar_spring.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class
    })
    public static class TestConfiguration {}

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testLoginSuccessEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("testing", "password");
        userService.login("test", "password");
        userService.login("testing", "secret");
    }
}
