package com.mjj.amqp.transaction;

import com.mjj.amqp.util.RabbitMqUtil;
import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.util.concurrent.TimeoutException;


/**
 * @author meijunjie
 */
public class ProducerTransaction {

    public static final String  EXCHANGE_NAME = "producer_transaction";

    public static void main(String[] args) throws IOException, TimeoutException {
        Channel channel = RabbitMqUtil.getChannel();

        // 指定转发 direct模式
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);

        // 信道关闭时执行
        channel.addShutdownListener(cause -> System.out.println(cause.getMessage()));

        String[] severities = {"error","info","warning"};

        // 开启channel事务
        channel.txSelect();
        try{
            for(int i=0;i<3;i++){
                String severity = severities[i%3];
                // 发送的信息
                String message = "Hello_world_" + (i+1) +"_"+System.currentTimeMillis();
                // 开启mandatory
                channel.basicPublish(EXCHANGE_NAME,severity,true,null,message.getBytes());
                System.out.println("--------------");
                System.out.println(" Sent Message: [" + severity +"]:'"
                        + message + "'");
                System.out.println(1/0);
                Thread.sleep(100);
            }
            // 提交事务
            channel.txCommit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            channel.txRollback();
        }

        channel.close();
    }
}
