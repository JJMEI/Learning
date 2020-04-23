package com.mjj.rpc.basic.zookeeper.basic.service_registry;

import java.util.Random;

public class RandomLoadBlance extends LoadBlance {
    @Override
    public String getRemoteServiceAddress() {

        Random random = new Random();
        int index = random.nextInt(serviceServerList.size());
        return serviceServerList.get(index);
    }


    public static void main(String[] args) {

        Random random = new Random(3);


        for (;;){

        }
    }
}
