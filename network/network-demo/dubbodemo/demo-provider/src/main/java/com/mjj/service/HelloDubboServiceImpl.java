package com.mjj.service;

import org.springframework.stereotype.Service;

@Service("helloDubboService")
public class HelloDubboServiceImpl implements HelloDubboService{
    @Override
    public String sayHelloDubbo() {
        return "Hello, this is dubbo!";
    }
}
