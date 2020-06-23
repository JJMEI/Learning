package com.mjj.amqp.mandatory;

import com.mjj.amqp.util.RabbitMqUtil;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author meijunjie
 * 不做任何配置的情况下，生产者是不知道消息是否真正到达RabbitMq,也就是说消息发布操作不返回任何消息给
 * 生产者，如何保证我们发布消息的可靠性？
 *  1. 失败通知
 *      发送消息时设置mandatory标志
 *  2. 事务
 *      事务的实现主要是对信道的设置，主要分为启动事务，提交事务，回滚事务。AMQP协议层面为我们提供了事务机制，
 *      但事务机制本身会带来问题
 *          1.严重的性能问题，性能下降10倍之多
 *          2.生产者应用程序产生同步
 *  3. 发送确认模式
 */
public class ProducerMandatory {
    public static final String EXCHANGE_NAME = "mandatory_test";

    public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {
        Channel channel = RabbitMqUtil.getChannel();

        // 指定转发 direct模式
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

        // 信道关闭时执行
        channel.addShutdownListener(cause -> System.out.println(cause.getMessage()));


        channel.addReturnListener((replyCode, replyText, exchange, routingKey, properties, body) -> {
            String message  = new String(body);

            System.out.println("返回的replyText: " + replyText);
            System.out.println("返回的exchange: " + exchange);
            System.out.println("返回的routingKey: " + routingKey);
            System.out.println("返回的message: " + message);

        });

        String[] severities = {"error","info","warning"};
        for(int i=0;i<3;i++){
            String severity = severities[i%3];
            // 发送的信息
            String message = "Hello_world_" + (i+1) +"_"+System.currentTimeMillis();
            // 开启mandatory
            channel.basicPublish(EXCHANGE_NAME,severity,true,null,message.getBytes());
            System.out.println("--------------");
            System.out.println(" Sent Message: [" + severity +"]:'"
                    + message + "'");
            Thread.sleep(200);
        }

        channel.close();

    }
}
