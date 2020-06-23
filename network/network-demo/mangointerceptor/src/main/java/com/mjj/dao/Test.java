package com.mjj.dao;

import org.jfaster.mango.datasource.DataSourceFactory;
import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.datasource.MasterSlaveDataSourceFactory;
import org.jfaster.mango.operator.Mango;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        DataSource master = new DriverManagerDataSource("com.mysql.jdbc.Driver","jdbc:mysql://m3554i.tjtn.db.lecloud.com:3554/mmall_goods",
                "mmallgood_w","YTNhM2RjNGFjNGU0Zjdk");

        DataSource slave = new DriverManagerDataSource("com.mysql.jdbc.Driver","jdbc:mysql://m3307i-vip_letv.tjtn.db.lecloud.com:3307/mmall_goods_db?characterEncoding=utf-8&amp;autoReconnect=true&amp;autoReconnectForPools=true&amp;zeroDateTimeBehavior=convertToNull",
                "vip_letv_test","vip_letv");


        DataSourceFactory sourceFactory = new MasterSlaveDataSourceFactory(master, Collections.singletonList(slave));

        Mango mango = Mango.newInstance(sourceFactory);
        mango.setCacheHandler(new MangoCacheHandler());
        mango.setCheckColumn(false);

        mango.create(OrderDao.class).getAllOrderNos(1L);

        List<OrderEntity> orderEntityList =         mango.create(OrderDao.class).selectAll();


        for (OrderEntity orderEntity : orderEntityList){
            System.out.println(orderEntity.getOrderName());
        }


    }

}
