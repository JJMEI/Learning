package com.mjj.amqp.util;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author meijunjie
 */
public class RabbitMqUtil {

    private static final Connection connection;

    static {
        ConnectionFactory factory = new ConnectionFactory();

        factory.setUsername("root");
        factory.setPassword("root");
        factory.setPort(5672);
        factory.setHost("10.211.55.19");

        try {
            connection = factory.newConnection();
        } catch (IOException | TimeoutException e) {
            throw new IllegalStateException("connect rabbit mq error!");
        }
    }

    public static Channel getChannel() throws IOException {
        return connection.createChannel();
    }

    public static void main(String[] args) throws IOException {
        for (;;){
            getChannel();
        }
    }
}
