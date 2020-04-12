package com.mjj.rpc.simple.server.itf.impl;

import com.mjj.rpc.simple.server.itf.IOrderService;

import java.util.UUID;

/**
 * @author meijunjie
 */
public class OrderServiceImpl implements IOrderService {
    @Override
    public String createOrder() {
        try {
            Thread.sleep(10);
            // 模拟执行10ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "order create successfully! order no is " + UUID.randomUUID();
    }
}
