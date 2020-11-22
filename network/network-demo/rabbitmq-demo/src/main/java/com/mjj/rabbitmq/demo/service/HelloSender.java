package com.mjj.rabbitmq.demo.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello" + new Date();

        System.out.println("Sender: " + context);

        this.amqpTemplate.convertAndSend("hello",context);
    }
}
