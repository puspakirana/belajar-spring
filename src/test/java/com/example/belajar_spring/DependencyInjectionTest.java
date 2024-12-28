package com.example.belajar_spring;

import com.example.belajar_spring.model.Bar;
import com.example.belajar_spring.model.Foo;
import com.example.belajar_spring.model.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
    
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(BeanDependencyInjectionConfig.class);
    }

    @Test
    void testNoDependencyInjection() {
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }

    @Test
    void testDependencyInjection() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean("fooSecond",Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertNotSame(foo, fooBar.getFoo());
        Assertions.assertSame(foo2, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
