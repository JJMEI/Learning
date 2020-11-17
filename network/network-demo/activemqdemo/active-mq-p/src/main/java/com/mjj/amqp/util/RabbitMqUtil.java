package com.mjj.amqp.util;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.net.URLDecoder;
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
//        for (;;){
//            getChannel();
//        }

        String url = "http://openott.api.mgtv.com/v1/factory_other/lePay/notice?order_no=5820101214814894190891008-1&user_ip=223.104.175.94&create_time=1602488295952&pay_order_no=11120201012199422919670538241&businessId=511708211815898872758272&sign=cd6b0df989811332ec0e68c7a4a88067&product_info=%5B%7B%22duration%22%3A1%2C%22product_type%22%3A%22100%22%2C%22price%22%3A0.0%2C%22product_id%22%3A%2228%22%2C%22duration_type%22%3A2%7D%5D&device_type=2&success_time=1602488307000&terminal=141007&type=orderSuccessNotify&platform=23&order_name=%E8%B6%85%E7%BA%A7%E7%94%B5%E8%A7%86%E5%9B%BD%E5%B9%BF-%E5%AE%B6%E5%BA%AD%E4%BC%9A%E5%91%98%E4%BA%94%E5%90%88%E4%B8%80%281%E5%8D%8E%E6%95%B0%29%E6%9C%88%E5%8C%85-207-79-%E9%A1%B6%E5%AF%BC&sku_no=5320091514506826346663936&user_id=304336391&spu_no=5220091514506853288775680&user_mac=B01BD2214F98&pay_channel=25&cps_id=5082354535274418&vendor_no=511708211815898872758272";

        String originUrl = URLDecoder.decode(url,"UTF-8");

        System.out.println(originUrl);
    }
}
