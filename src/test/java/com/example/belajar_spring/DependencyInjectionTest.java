package com.example.belajar_spring;

import com.example.belajar_spring.model.Bar;
import com.example.belajar_spring.model.Foo;
import com.example.belajar_spring.model.FooBar;
import org.junit.jupiter.api.Test;

public class DependencyInjectionTest {

    @Test
    void testNoDependencyInjection() {
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);
    }

}
