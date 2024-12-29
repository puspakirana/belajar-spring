package com.example.belajar_spring.service;

import com.example.belajar_spring.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Lazy
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    @Autowired //menandakan constructor ini yang akan digunakan by default
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }
}
