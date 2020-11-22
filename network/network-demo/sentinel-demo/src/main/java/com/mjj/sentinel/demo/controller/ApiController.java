package com.mjj.sentinel.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {



    @RequestMapping(value = "/api/validate")
    public String api() throws InterruptedException {

        // 模拟资源处理时间
        Thread.sleep(1000);
        return "success";
    }
}
