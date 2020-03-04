package com.mjj.spring.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class Plane implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Plane() {
        System.out.println("Plane .... constructor");
    }

    /**
     * @PostConstruct
     */

    @PostConstruct
    public void init(){
        System.out.println("Plane .... @PostConstruct");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Plane ... @PreDestory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext(){
        return applicationContext;
    }
}
