package com.mjj.dao;

import org.jfaster.mango.binding.BoundSql;
import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.interceptor.Parameter;
import org.jfaster.mango.interceptor.QueryInterceptor;

import javax.sql.DataSource;
import java.util.List;

public class MyQueryInterceptor extends QueryInterceptor {
    @Override
    public void interceptQuery(BoundSql boundSql, List<Parameter> list, DataSource dataSource) {

        if(boundSql.getSql().contains("select")){
            dataSource = new DriverManagerDataSource("com.mysql.jdbc.Driver","jdbc:mysql://m3307i-vip_letv.tjtn.db.lecloud.com:3307/mmall_goods_db?characterEncoding=utf-8&amp;autoReconnect=true&amp;autoReconnectForPools=true&amp;zeroDateTimeBehavior=convertToNull",
                    "vip_letv_test","vip_letv");
        }

    }
}
