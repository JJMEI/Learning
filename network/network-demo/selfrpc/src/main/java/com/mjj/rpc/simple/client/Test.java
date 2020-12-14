package com.mjj.rpc.simple.client;

import com.mjj.rpc.simple.server.itf.IOrderService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.mjj.rpc.simple.client.RpcClintFrame.getProxyObject;

public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for(;;){
            executorService.execute(() -> {
                IOrderService orderService = getProxyObject(IOrderService.class);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(orderService.createOrder());
            });
        }
    }
}
