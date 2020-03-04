package com.mjj.self.mvc.service;


@com.mjj.self.mvc.annotation.MjjService("mjjServiceImpl")
public class MjjServiceImpl implements MjjService {
    @Override
    public String query(String name, String age) {
        return name + "...." + age;
    }

    @Override
    public String insert(String param) {
        return "insert..." + param;
    }

    @Override
    public String update(String param) {
        return "insert..." + param;
    }
}
