package com.mjj.dao;

import org.jfaster.mango.annotation.Cache;
import org.jfaster.mango.annotation.CacheIgnored;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.operator.cache.Second;

import java.util.List;

@DB
@Cache(prefix = "abc",expire = Second.class, num = 5)
public interface OrderDao {

    @CacheIgnored
    @SQL("select order_no from t_mmall_order where user_id=:1")
    List<String> getAllOrderNos(long uid);


    @CacheIgnored
    @SQL("select P.* from t_mmall_order P left join t_mmall_order_vendor a on a.order_id=P.id where P.user_id=123 limit 1,10")
    List<OrderEntity> selectAll();
}
