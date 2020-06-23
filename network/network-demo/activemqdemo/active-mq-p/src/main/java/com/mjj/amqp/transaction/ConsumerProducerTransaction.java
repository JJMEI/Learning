package com.mjj.amqp.transaction;

import com.mjj.amqp.util.RabbitMqUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * @author meijunjie
 */
public class ConsumerProducerTransaction {
    public static void main(String[] args) throws IOException {
        final Channel channel = RabbitMqUtil.getChannel();

        channel.exchangeDeclare(ProducerTransaction.EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

        // 声明一个queue
        channel.queueDeclare("producer_confirm",false,false,false,null);

        channel.queueBind("producer_confirm",ProducerTransaction.EXCHANGE_NAME,"error");

        // 创建队列消费者
        final Consumer consumerB = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag,
                                       Envelope envelope,
                                       AMQP.BasicProperties properties,
                                       byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                //记录日志到文件：
                System.out.println( "Received ["+ envelope.getRoutingKey()
                        + "] "+message);
            }
        };
        channel.basicConsume("producer_confirm", true, consumerB);
    }
}
