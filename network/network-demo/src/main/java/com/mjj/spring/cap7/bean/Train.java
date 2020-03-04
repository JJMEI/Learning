package com.mjj.spring.cap7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


/**
 * bean实例化默认都是单实例的
 */
@Component
public class Train implements InitializingBean,DisposableBean {

    public Train() {
        System.out.println("Train ... constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train .... afterProperties");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Train .... destory");
    }
}
