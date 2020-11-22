package com.mjj.springmvc.controller;

import com.mjj.springmvc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Autowired
    OrderService orderService;

    @RequestMapping(path = {"/index","/"})
    public String index(Model model){
        System.out.println("hello controller invoked");
        model.addAttribute("msg",orderService.createOrder());
        return "hello";
    }
}
