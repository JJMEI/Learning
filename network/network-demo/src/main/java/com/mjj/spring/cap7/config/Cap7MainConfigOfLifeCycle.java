package com.mjj.spring.cap7.config;


import com.mjj.spring.cap7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value = {"com.mjj.spring.cap7.bean"})
public class Cap7MainConfigOfLifeCycle {


    /**
     * 多实例下启动方式
     *
     *
     * 对于单实例的bean 可以正常调用初始化和销毁方法
     * 对于多实例的bean 容器只负责初始化 但不会管理bean，容器关闭时不会调用销毁方法
     *
     * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
     * 实现InitializingBean接口的afterPropertiesSet()方法 当beanFactory创建好对象，且把bean所有属性之后，会调用这个方法 初始化方法
     * DisposableBean  destory()方法  当bean销毁时 会把单实例bean进行销毁
     *
     * @return
     */
    @Scope(value = "prototype")
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Bike bike(){
        return new Bike();
    }
}
