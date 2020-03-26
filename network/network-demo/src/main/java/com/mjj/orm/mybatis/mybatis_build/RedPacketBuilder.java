package com.mjj.orm.mybatis.mybatis_build;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 红包规范 定义各个组件
 *
 * 建造者模式
 */
public interface RedPacketBuilder {
    RedPacketBuilder setPublisherName(String publisherName);
    RedPacketBuilder setAcceptName(String acceptName);
    RedPacketBuilder setPacketAmount(BigDecimal packetAmount);
    RedPacketBuilder setPacketType(int type);
    RedPacketBuilder setPublishPacketTime(Date publishPacketTime);
    RedPacketBuilder setOpenPacketTime(Date openPacketTime);

    RedPacket build();
}
