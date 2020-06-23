package com.mjj.amqp.produceconfirm;

import com.mjj.amqp.util.RabbitMqUtil;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author meijunjie
 */
public class ProducerConfirm {

    public static final String EXCHANGE_NAME = "producer_confirm";
    public static final String ROUTING_KEY = "error";

    public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {
        Channel channel = RabbitMqUtil.getChannel();
        // 指定转发
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        channel.addReturnListener((replyCode, replyText, exchange, routingKey, properties, body) -> {
            String message = new String(body);
            System.out.println("RabbitMq返回的replyCode:  "+replyCode);
            System.out.println("RabbitMq返回的replyText:  "+replyText);
            System.out.println("RabbitMq返回的exchange:  "+exchange);
            System.out.println("RabbitMq返回的routingKey:  "+routingKey);
            System.out.println("RabbitMq返回的message:  "+message);
        });

        // 启用发送确认模式
        channel.confirmSelect();
        for(int i=0;i<2;i++){
            // 发送的消息
            String message = "Hello World_"+(i+1);
            //参数1：exchange name
            //参数2：routing key
            channel.basicPublish(EXCHANGE_NAME, ROUTING_KEY, true,null, message.getBytes());
            System.out.println(" Sent Message: [" + ROUTING_KEY +"]:'"+ message + "'");

            //
            if(channel.waitForConfirms()){
                System.out.println("send success");
            }else{
                System.out.println("send failure");
            }
        }
        // 关闭频道和连接
        channel.close();

    }
}
