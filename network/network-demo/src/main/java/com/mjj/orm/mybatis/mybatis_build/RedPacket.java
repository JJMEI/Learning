package com.mjj.orm.mybatis.mybatis_build;

import java.math.BigDecimal;
import java.util.Date;

public class RedPacket {
    private String publiserName;
    private String acceptName;
    private BigDecimal packetAmount;
    private int packetType;
    private Date publishPacketTime;
    private Date openPacketTime;

    public RedPacket(String publiserName, String acceptName, BigDecimal packetAmount, int packetType, Date publishPacketTime, Date openPacketTime) {
        this.publiserName = publiserName;
        this.acceptName = acceptName;
        this.packetAmount = packetAmount;
        this.packetType = packetType;
        this.publishPacketTime = publishPacketTime;
        this.openPacketTime = openPacketTime;
    }

    public String getPubliserName() {
        return publiserName;
    }

    public void setPubliserName(String publiserName) {
        this.publiserName = publiserName;
    }

    public String getAcceptName() {
        return acceptName;
    }

    public void setAcceptName(String acceptName) {
        this.acceptName = acceptName;
    }

    public BigDecimal getPacketAmount() {
        return packetAmount;
    }

    public void setPacketAmount(BigDecimal packetAmount) {
        this.packetAmount = packetAmount;
    }

    public int getPacketType() {
        return packetType;
    }

    public void setPacketType(int packetType) {
        this.packetType = packetType;
    }

    public Date getPublishPacketTime() {
        return publishPacketTime;
    }

    public void setPublishPacketTime(Date publishPacketTime) {
        this.publishPacketTime = publishPacketTime;
    }

    public Date getOpenPacketTime() {
        return openPacketTime;
    }

    public void setOpenPacketTime(Date openPacketTime) {
        this.openPacketTime = openPacketTime;
    }

    @Override
    public String toString() {
        return "RedPacket{" +
                "publiserName='" + publiserName + '\'' +
                ", acceptName='" + acceptName + '\'' +
                ", packetAmount=" + packetAmount +
                ", packetType=" + packetType +
                ", publishPacketTime=" + publishPacketTime +
                ", openPacketTime=" + openPacketTime +
                '}';
    }
}
