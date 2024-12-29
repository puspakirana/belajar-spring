package com.example.belajar_spring;

import com.example.belajar_spring.model.Connection;
import com.example.belajar_spring.model.Server;
import com.example.belajar_spring.model.Server2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server() {
        return new Server();
    }

    @Bean
    public Server2 server2() {
        return new Server2();
    }

}
