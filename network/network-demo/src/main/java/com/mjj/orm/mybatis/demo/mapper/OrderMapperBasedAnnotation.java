package com.mjj.orm.mybatis.demo.mapper;

import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface OrderMapperBasedAnnotation {

    @Select("select * from `order`")
    @Results(id="OrderEntity",value = {
            @Result(column ="orderid",property = "orderId",javaType = long.class),
            @Result(column = "ordertime",property = "orderTime",javaType = Date.class),
            @Result(column = "ordermoney",property = "orderMoney",javaType = int.class ),
            @Result(column = "orderstatus",property = "orderStatus",javaType = int.class)
    })
    List<OrderEntity> selectAll();

    @Select("select * from `order` where orderid=#{orderId}")
    @ResultMap(value = {"OrderEntity"})
    OrderEntity selectByOrderId(@Param(value = "orderId") Long orderId);



    @Insert("insert into `order`(ordertime,ordermoney,orderstatus)values(" +
            "#{orderTime},#{orderMoney},#{orderStatus})")
    @Options(useGeneratedKeys = true,keyColumn = "orderid",keyProperty = "orderId")
    int insertOrderInfo(OrderEntity o);
}
