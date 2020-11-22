package com.mjj.spring.self.spring;

public class StaticBarInterfaceFactory {

    public static BarInterface getInstance(){
        return new BarInterfaceImpl();
    }
}
