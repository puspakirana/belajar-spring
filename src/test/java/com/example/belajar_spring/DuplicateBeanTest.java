package com.example.belajar_spring;

import com.example.belajar_spring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanTest {
    @Test
    void testDuplicate() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });
    }

    @Test
    void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);
        Foo foo2_1 = context.getBean("foo2", Foo.class);
        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertSame(foo2,foo2_1);
    }
}
