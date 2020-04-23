package com.example.orderservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class OrderController {

    AtomicLong totalNums = new AtomicLong();


    @GetMapping(value = "/create/order.json")
    public String createOrder(){
        System.out.println("已创建订单数: " + totalNums.incrementAndGet());
        return "create order success! order no is " + UUID.randomUUID().toString();
    }
}
