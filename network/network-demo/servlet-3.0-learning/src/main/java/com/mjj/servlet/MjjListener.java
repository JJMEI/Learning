package com.mjj.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MjjListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器初始化....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("容器销毁....");
    }
}
