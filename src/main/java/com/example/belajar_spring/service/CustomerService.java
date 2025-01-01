package com.example.belajar_spring.service;

import com.example.belajar_spring.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Autowired
    @Qualifier("normalCustomerRepository") //bisa dipakai di constructor & setter DI
    private CustomerRepository normalCustomerRepository;

    @Getter
    @Autowired
    @Qualifier("premiumCustomerRepository") //bisa dipakai di constructor & setter DI
    private CustomerRepository premiumCustomerRepository;
}
