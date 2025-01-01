package com.example.belajar_spring.client;

import lombok.Data;


//MISAL INI THIRD-PARTY LIBRARY
@Data
public class PaymentGatewayClient {
    private String endpoint;
    private String privateKey;
    private String publicKey;
}
