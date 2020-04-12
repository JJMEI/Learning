package com.mjj.rpc.simple.client;

import com.mjj.rpc.simple.server.itf.IOrderService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.mjj.rpc.simple.client.RpcClintFrame.getProxyObject;

public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for(;;){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    IOrderService orderService = getProxyObject(IOrderService.class);

                    System.out.println(orderService.createOrder());
                }
            });
        }
    }
}
