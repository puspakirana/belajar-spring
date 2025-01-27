package com.example.belajar_spring.application;

import com.example.belajar_spring.model.Bar;
import com.example.belajar_spring.model.Foo;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooApplication {

//    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(FooApplication.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext applicationContext = springApplication.run(args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }

}
