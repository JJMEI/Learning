package com.mjj.spring.self.spring;

public class NoStaticBarInterfaceFactory  {

    public BarInterface getInstance(){
        return new BarInterfaceImpl();
    }
}
