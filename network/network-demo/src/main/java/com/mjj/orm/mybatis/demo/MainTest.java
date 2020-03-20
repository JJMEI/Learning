package com.mjj.orm.mybatis.demo;

import com.mjj.orm.mybatis.demo.mapper.OrderMapperBasedAnnotation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.util.Date;
import java.util.List;

public class MainTest {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsReader("mybatis-config.xml"));


        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrderMapperBasedAnnotation orderMapperBasedAnnotation = sqlSession.getMapper(OrderMapperBasedAnnotation.class);
        List<OrderEntity> orderEntityList = orderMapperBasedAnnotation.selectAll();
        for (OrderEntity o : orderEntityList){
            System.out.println(o);
        }


        System.out.println(orderMapperBasedAnnotation.selectByOrderId(1L).toString());


        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderTime(new Date());
        orderEntity.setOrderMoney(1);
        orderEntity.setOrderStatus(1);

        orderMapperBasedAnnotation.insertOrderInfo(orderEntity);

        System.out.println("primarkey is " + orderEntity.getOrderId());

        sqlSession.commit();



    }
}
