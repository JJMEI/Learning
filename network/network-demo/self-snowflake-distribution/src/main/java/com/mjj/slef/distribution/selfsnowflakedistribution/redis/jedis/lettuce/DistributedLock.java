package com.mjj.slef.distribution.selfsnowflakedistribution.redis.jedis.lettuce;

import redis.clients.jedis.Jedis;

public class DistributedLock {
    private static DistributedLock ourInstance = new DistributedLock();

    private static Jedis jedis = null;

    static {
        jedis = new Jedis("10.211.55.19",6379);
    }

    public static DistributedLock getInstance() {
        return ourInstance;
    }

    private DistributedLock() {
    }

    public boolean getLock(String key){
        return jedis.setnx(key,key+"-value") > 0;
    }

    public boolean releaseLock(String key){
        return jedis.del(key)>0;
    }
}
