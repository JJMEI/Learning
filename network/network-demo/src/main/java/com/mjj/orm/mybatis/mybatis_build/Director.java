package com.mjj.orm.mybatis.mybatis_build;

import java.math.BigDecimal;
import java.util.Date;

public class Director {
    public static void main(String[] args) {
        RedPacket redPacket = RedPacketBuilderImpl.getBuilder()
                .setPublisherName("MJJ")
                .setAcceptName("VIP 群")
                .setPacketAmount(new BigDecimal("1000.00"))
                .setPacketType(1)
                .setPublishPacketTime(new Date())
                .setOpenPacketTime(new Date())
                .build();

        System.out.println(redPacket);
    }
}
