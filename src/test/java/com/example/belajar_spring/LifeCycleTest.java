package com.example.belajar_spring;

import com.example.belajar_spring.model.Connection;
import com.example.belajar_spring.model.Server;
import com.example.belajar_spring.model.Server2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        applicationContext.registerShutdownHook(); //sama fungsinya dengan close()
    }

    @AfterEach
    void tearDown() {
//        applicationContext.close(); //untuk simulasi, aslinya otomatis
    }

    @Test
    void testConnection() {
        Connection connection = applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer() {
        Server server = applicationContext.getBean(Server.class);
    }

    @Test
    void testServer2() {
        Server2 server2 = applicationContext.getBean(Server2.class);
    }
}
