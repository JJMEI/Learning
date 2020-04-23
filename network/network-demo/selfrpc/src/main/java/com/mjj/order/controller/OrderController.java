package com.mjj.order.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OrderController {

    @GetMapping(value = "/")
    public String createOrder(){
        return "create order success! order no is " + UUID.randomUUID().toString();
    }
}
