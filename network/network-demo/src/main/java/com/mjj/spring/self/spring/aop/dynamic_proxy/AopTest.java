package com.mjj.spring.self.spring.aop.dynamic_proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");

        Player player = (Player) context.getBean("player");

        player.play();
//        player.play("我爱你中国");
    }
}
