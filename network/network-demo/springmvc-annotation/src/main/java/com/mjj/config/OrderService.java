package com.mjj.config;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String gobuy(String orderId){
        return "orderId==" + orderId;
    }
}
