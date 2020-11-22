package com.mjj.distribute.lock;

/**
 * @author meijunjie
 */
public interface DistributedLock {

    /**
     * 获取锁
     * @param businessCode     业务编码
     * @param key              锁key
     * @param value            锁客户端唯一标识
     * @param expireTime       默认的锁过期时间 防止死锁
     * @return
     */
    boolean acquireLock(String businessCode, String key, String value, Integer expireTime);


    boolean releaseLock(String businessCode, String key, String value);

    boolean blockAcquireLock(String businessCode, String key, String value, Integer expireTime);

}
