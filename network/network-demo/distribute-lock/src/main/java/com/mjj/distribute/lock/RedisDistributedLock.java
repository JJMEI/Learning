package com.mjj.distribute.lock;

import redis.clients.jedis.JedisCluster;

import java.util.Collections;

/**
 *
 * 单机版

 * @author meijunjie
 */
public class RedisDistributedLock implements DistributedLock {


    private static final String ACQUIRE_LOCK_SUCCESS = "OK";
    private static final Long RELEASE_LOCK_SUCCESS = 1L;
    private static final String SET_IF_KEY_NOT_EXISTS = "NX";
    private static final String SET_WITH_EXPIRE_TIME = "PX";
    private static final String INNER_LOCK_KEY = "%s_%s";

    private JedisCluster jedisCluster;

    public RedisDistributedLock(JedisCluster jedisCluster) {
        this.jedisCluster = jedisCluster;
    }


    @Override
    public boolean acquireLock(String businessCode, String key, String value, Integer expireTime) {

        boolean result = false;

        try {
            if (ACQUIRE_LOCK_SUCCESS.equals(jedisCluster.set(String.format(INNER_LOCK_KEY, businessCode, key), value, SET_IF_KEY_NOT_EXISTS, SET_WITH_EXPIRE_TIME, expireTime))) {
                result = true;
            }
        } catch (Exception e) {
            // 输出异常日志
            System.out.println(e.getMessage());
        }

        return result;
    }

    @Override
    public boolean releaseLock(String businessCode, String key, String value) {

        String safeReleaseLuaScript = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";
        String innerLockKey = String.format(INNER_LOCK_KEY, businessCode, key);
        Object result;

        try {
            result = jedisCluster.eval(safeReleaseLuaScript, Collections.singletonList(innerLockKey), Collections.singletonList(value));
            if (RELEASE_LOCK_SUCCESS.equals(result)) {
                return true;
            } else {
                System.out.println("释放锁失败 " + innerLockKey + " 客户端版本 " + value);
            }
        } catch (Exception e) {
            System.out.println("释放锁失败 " + innerLockKey + " 客户端版本 " + value);
        }
        return false;
    }

    @Override
    public boolean blockAcquireLock(String businessCode, String key, String value, Integer expireTime) {

        // 自旋
        while (true) {
            if (acquireLock(businessCode, key, value, expireTime)) {
                return true;
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }
}
