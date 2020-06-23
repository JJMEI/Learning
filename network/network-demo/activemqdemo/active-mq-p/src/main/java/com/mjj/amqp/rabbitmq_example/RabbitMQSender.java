package com.mjj.amqp.rabbitmq_example;

import com.mjj.amqp.util.RabbitMqUtil;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author meijunjie
 */
public class RabbitMQSender {

    public static void main(String[] args) throws IOException {
        final Channel channel = RabbitMqUtil.getChannel();


        // 1. 设置死信交换 Topic类 持计划
        channel.exchangeDeclare("dlx", BuiltinExchangeType.TOPIC,true,false,null);

        // 2. 设置死信队列 持久化 lazy型
        Map<String,Object> argsMap = new HashMap<>();
        argsMap.put("x-queue-mode","lazy");
        channel.queueDeclare("dlq", true, false, false,argsMap);

        // 接收所有消息给死信队列和


    }
}
