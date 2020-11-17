package com.mjj.slef.distribution.selfsnowflakedistribution.redis.jedis.lettuce;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Pipeline;

/**
 * @author meijunjie
 */
public class JedisDemoTest {


    @Test
    public void test(){

        /**
         * Jedis(final String host, final int port, final int connectionTimeout, final int soTimeout)
         */
        Jedis jedis = null;

        try{
            jedis = new Jedis("10.211.55.19",6379);

            jedis.set("hello","world");
            String value = jedis.get("hello");
            System.out.println(value);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(jedis != null){
                jedis.close();
            }
        }
    }

    @Test
    public void jedisPoolTest(){
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        JedisPool jedisPool = new JedisPool(config,"10.211.55.19",6379);

        Jedis jedis = null;
        try{
            jedis = jedisPool.getResource();
            System.out.println(jedis.get("hello"));

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                // 归还连接池
                jedis.close();
            }
        }
    }

    @Test
    public void mdelTest(){
        Jedis jedis = new Jedis("10.211.55.19",6379);

        Pipeline pipeline = jedis.pipelined();

        String[] keys = new String[]{"hello","a","b"};

        for(String key:keys){
            // 执行命令 此时命令并未真正执行
            pipeline.del(key);
        }

        // 执行命令
        pipeline.sync();
    }
}
