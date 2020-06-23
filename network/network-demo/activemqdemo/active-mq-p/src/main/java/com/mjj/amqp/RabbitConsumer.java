package com.mjj.amqp;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitConsumer {

    private static final String EXCHANGE_NAME = "exchange_demo";
    private static final String ROUTING_KEY = "routingkey_demo";
    private static final String QUEUE_NAME = "queue_demo";
    private static final String IP_ADDRESS = "10.211.55.19";
    private static final int PORT = 5672;

    public static void main(String[] args) throws IOException, TimeoutException {
        Address[] addresses = new Address[]{new Address(IP_ADDRESS,PORT)};

        ConnectionFactory factory = new ConnectionFactory();
        factory.setUsername("root");
        factory.setPassword("root");


        Connection connection = factory.newConnection(addresses);
        for(int i=0;i<3;i++){
            new Thread(() -> {
                final Channel channel;
                try {
                    channel = connection.createChannel();
                    channel.basicQos(64);



                    Consumer consumer = new DefaultConsumer(channel){

                        @Override
                        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                            System.out.println(Thread.currentThread().getName() + "   recv message: " + new String(body));

                            try{
                                Thread.sleep(1000);
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                            channel.basicAck(envelope.getDeliveryTag(),false);

                        }
                    };channel.basicConsume(QUEUE_NAME,consumer);}catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
