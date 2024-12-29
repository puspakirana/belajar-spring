package com.example.belajar_spring.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server2 {
    @PostConstruct
    public void start() {
        log.info("Start Server 2");
    }

    @PreDestroy
    public void stop() {
        log.info("Stop Server 2");
    }
}
