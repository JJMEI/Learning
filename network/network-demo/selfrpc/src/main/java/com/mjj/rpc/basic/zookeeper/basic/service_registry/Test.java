package com.mjj.rpc.basic.zookeeper.basic.service_registry;

import org.apache.zookeeper.KeeperException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

public class Test {


    public static void main(String[] args) throws InterruptedException, URISyntaxException, IOException, KeeperException {
        // 启动一个线程 用于关注远端服务的变化

        Executors.newFixedThreadPool(1)
                .execute(() -> {
                    try {
                        AcquireRemoteServiceInfo acquireRemoteServiceInfo = new AcquireRemoteServiceInfo();
                    } catch (IOException | KeeperException | InterruptedException e) {
                        e.printStackTrace();
                    }

                });

        Thread.sleep(1000);

        RandomLoadBlance randomLoadBlance = new RandomLoadBlance();
        for (;;){
            RestTemplate template = new RestTemplate();
            try{
                template.headForHeaders(new URI("http://" + randomLoadBlance.getRemoteServiceAddress() + "/create/order.json"));

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
