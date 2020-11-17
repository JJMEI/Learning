package com.mjj.orm.mango;

import com.google.common.collect.Lists;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.operator.Mango;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        String driverClass = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://m3554i.tjtn.db.lecloud.com:3554/mmall_goods?characterEncoding=utf-8&amp;autoReconnect=true&amp;autoReconnectForPools=true&amp;zeroDateTimeBehavior=convertToNull";
        String username = "mmallgood_w";
        String password = "YTNhM2RjNGFjNGU0Zjdk";

        DataSource dataSource = new DriverManagerDataSource(driverClass,url,username,password);

        Mango mango = Mango.newInstance(dataSource);
        CleanDataDao cleanDataDao = mango.create(CleanDataDao.class);

        List<SubOrder> subOrders = cleanDataDao.querySubOrderInfo("2020-07-22", Arrays.asList("10000100","10009555"));

        List<List<SubOrder>> lists = Lists.partition(subOrders,5000);

        for(List<SubOrder> list : lists){
            cleanDataDao.batchUpdateSharePrice(list);
        }



    }


    @DB
    interface CleanDataDao{

        @SQL("select a.order_no,a.vendor_code,a.share_price,b.id as orderId from t_mmall_sub_order a,t_mmall_order b  where pay_operate_time>=:1  " +
                "and pay_operate_time <'2020-07-24' and vendor_code in (:2) and a.order_no=b.order_no")
        List<SubOrder> querySubOrderInfo(String date, List<String> vendorCodes);

        @SQL("select id from t_mmall_order where order_no=:1")
        Long getOrderId(String orderNo);

        @SQL("update t_mmall_order_vendor set share_price=:3 where order_id=:1 and vendor_code=:2")
        Integer updateSharePrice(Long orderId,String vendorCode,BigDecimal sharePrice);

        @SQL("update t_mmall_order_vendor set share_price=:1.sharePrice where order_id=:1.orderId and vendor_code=:1.vendorCode")
        Integer[] batchUpdateSharePrice(List<SubOrder> suborders);


    }

    public static class SubOrder{

        private String orderNo;
        private String vendorCode;
        private BigDecimal sharePrice;
        private Long orderId;

        public SubOrder() {
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getVendorCode() {
            return vendorCode;
        }

        public void setVendorCode(String vendorCode) {
            this.vendorCode = vendorCode;
        }

        public BigDecimal getSharePrice() {
            return sharePrice;
        }

        public void setSharePrice(BigDecimal sharePrice) {
            this.sharePrice = sharePrice;
        }

        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }
    }

}
