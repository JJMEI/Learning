package com.mjj.spring.cap7.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Jeep {
    public Jeep() {
        System.out.println("Jeep .... constructor");
    }

    /**
     * @PostConstruct
     */

    @PostConstruct
    public void init(){
        System.out.println("Jeep .... @PostConstruct");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Jeep ... @PreDestory");
    }

}
