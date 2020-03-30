package com.mjj.slef.distribution.selfsnowflakedistribution.version1;

import java.util.HashSet;
import java.util.Set;

/**
 * 雪花算法的优点与缺点
 * @author meijunjie
 */
public class SnowFlake {

    /**
     * 系统起始时间戳
     */
    private final static long START_STMP = 1585555909000L;

    /**
     * 12位序列号
     */
    private final static long SEQUENCE_BIT = 12L;

    /**
     * 5位机器中心
     */
    private final static long MACHINE_BIT = 5L;

    /**
     * 5位数据中心
     */
    private final static long DATA_CENTER_BIT = 5L;


    /**
     * 每一部分最大值，先进行左移运算，再同-1进行异或运算,
     * 用异或运算计算出每个部分的最大值，最大支持数据中心的值为31 即支持0~31个编号
     */
    private final static long MAX_DATACENTER_NUM = ~(-1L << DATA_CENTER_BIT);

    /**
     * 支持最多中心编号31  0~31个编号
     */
    private final static long MAX_MACHINE_NUM = ~(-1L << MACHINE_BIT);


    /**
     * 用位运算计算出12位能存储的最大整数4095
     */
    private final static long  MAX_SEQUENCE = ~(-1L << SEQUENCE_BIT);


    /**
     * 机器标志较序列化的偏移量
     */
    private final static long MACHINE_LEFT = SEQUENCE_BIT;

    /**
     * 数据中心较机器标志的偏移量
     */
    private final static long DATA_CENTER_LEFT = SEQUENCE_BIT + MACHINE_BIT;

    /**
     * 时间戳较数据中心的偏移量
     */
    private final static long TIMESTMP_LEFT = DATA_CENTER_LEFT + DATA_CENTER_BIT;


    /**
     * 数据中心ID
     */
    private static long dataCenterId;

    /**
     * 机器标识
     */
    private static long machineId;

    /**
     * 序列号
     */
    private static long sequence = 0L;

    /**
     * 上一次时间戳
     */
    private static long lastStmp = -1L;

    private SnowFlake(){
    }

    /**
     * 容器集群环境下machineId和自动dataCenterId自动注册问题
     */
    static {
        dataCenterId = 23L;
        machineId = 19L;
    }

    public static synchronized long nextId(){
        long currStmp = System.currentTimeMillis();

        if(currStmp < lastStmp){
            throw new RuntimeException("Clock moved backwards. Refusing to generate id");
        }

        // 相同毫秒内
        if(currStmp == lastStmp){
            // 相同毫秒内 序列号自增
            sequence = (sequence + 1) & MAX_SEQUENCE;
            if(sequence == 0L){
                currStmp = getNextMil();
            }
        }else {
            sequence = 0L;
        }

        lastStmp = currStmp;

        /**
         * 这里是整个雪花算法的关键之处
         *  时间戳部分
         *  数据中心部分
         *  机器标识部分
         *  序列号部分
         *  通过或运算将所有高低位组合
         */
        return (currStmp - START_STMP) << TIMESTMP_LEFT
                | dataCenterId << DATA_CENTER_LEFT
                | machineId << MACHINE_LEFT
                |sequence;
    }

    private static long getNextMil(){
        long mill = System.currentTimeMillis();
        while (mill <= lastStmp){
            mill = System.currentTimeMillis();
        }
        return mill;
    }

    public static void main(String[] args) throws InterruptedException {


        long startTime = System.currentTimeMillis();
        Set<Long> uniq_key = new HashSet<>();

       for (;;){
           if((System.currentTimeMillis() - startTime) < 1000){
               uniq_key.add(nextId());
           }else {
               break;
           }
       }

        System.out.println("每秒产生 " + uniq_key.size() + " 个key");
    }

}
