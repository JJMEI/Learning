package com.mjj.amqp.mandatory;

import com.mjj.amqp.util.RabbitMqUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * @author meijunjie
 */
public class ConsumerProducerMandatory {

    public static void main(String[] args) throws IOException {
        final Channel channel = RabbitMqUtil.getChannel();

        channel.exchangeDeclare(ProducerMandatory.EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

        // 随机返回一个queue
        String queueName = channel.queueDeclare().getQueue();

        // 绑定queue到mandatory_test 通过路由键error路由
        // 先启动消费者，会自动生成queue即使生产者中没有绑定queue 也可以通过路由键路由到相应的队列上
        channel.queueBind(queueName,ProducerMandatory.EXCHANGE_NAME,"error");

        final Consumer consumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body,"UTF-8");

                System.out.println("Received [" + envelope.getRoutingKey() + "]" + message);
            }
        };

        channel.basicConsume(queueName,true,consumer);
    }
}
