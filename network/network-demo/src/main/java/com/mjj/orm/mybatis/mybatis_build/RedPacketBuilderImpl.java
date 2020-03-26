package com.mjj.orm.mybatis.mybatis_build;

import java.math.BigDecimal;
import java.util.Date;

public class RedPacketBuilderImpl implements RedPacketBuilder {

   private String publiserName;
   private String acceptName;
   private BigDecimal packetAmount;
   private int packetType;
   private Date publishPacketTime;
   private Date openPacketTime;



    @Override
    public RedPacketBuilder setPublisherName(String publisherName) {
        this.publiserName = publisherName;
        return this;
    }

    @Override
    public RedPacketBuilder setAcceptName(String acceptName) {
        this.acceptName = acceptName;
        return this;
    }

    @Override
    public RedPacketBuilder setPacketAmount(BigDecimal packetAmount) {
        this.packetAmount = packetAmount;
        return this;
    }

    @Override
    public RedPacketBuilder setPacketType(int type) {
        this.packetType = type;
        return this;
    }

    @Override
    public RedPacketBuilder setPublishPacketTime(Date publishPacketTime) {
        this.publishPacketTime = publishPacketTime;
        return this;
    }

    @Override
    public RedPacketBuilder setOpenPacketTime(Date openPacketTime) {
        this.openPacketTime = openPacketTime;
        return this;
    }

    @Override
    public RedPacket build() {
        return new RedPacket(publiserName,acceptName,packetAmount,packetType,publishPacketTime,openPacketTime);
    }

    public static RedPacketBuilderImpl getBuilder(){
        return new RedPacketBuilderImpl();
    }
}
