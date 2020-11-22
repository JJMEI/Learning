package com.mjj.springmvc.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    public String createOrder(){
        return UUID.randomUUID().toString();
    }
}
