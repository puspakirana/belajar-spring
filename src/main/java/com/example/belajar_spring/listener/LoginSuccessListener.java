package com.example.belajar_spring.listener;

import com.example.belajar_spring.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login for user {}", event.getUser());
    }
}
