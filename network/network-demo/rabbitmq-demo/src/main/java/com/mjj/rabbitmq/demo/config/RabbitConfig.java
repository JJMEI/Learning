package com.mjj.rabbitmq.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

/**
 * @author meijunjie
 */
@Configuration
public class RabbitConfig {


    public Queue queue(){
        return new Queue("hello");
    }
}
