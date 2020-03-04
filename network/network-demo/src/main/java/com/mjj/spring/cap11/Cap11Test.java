package com.mjj.spring.cap11;

import com.mjj.spring.cap11.config.Cap11MainConfig;
import com.mjj.spring.cap11.service.OrderService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap11Test {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap11MainConfig.class);


        OrderService orderService = context.getBean(OrderService.class);

        orderService.addOrder();

    }
}
