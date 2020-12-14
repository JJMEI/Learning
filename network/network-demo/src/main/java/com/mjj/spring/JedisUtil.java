package com.mjj.spring;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.time.LocalTime;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JedisUtil {

    static JedisCluster jedisCluster = null;

    static Jedis jedis = null;

    static {

        HostAndPort hostAndPort = new HostAndPort("rm6505i.test.db.lecloud.com", 6505);

        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        poolConfig.setMaxWaitMillis(10);
        poolConfig.setJmxEnabled(true);
        jedisCluster = new JedisCluster(hostAndPort, 300, 300, 3, "W99U29NPGB", poolConfig);

        jedis = new Jedis("127.0.0.1", 6379);


    }


    /**
     * @param busiCode     业务编码
     * @param key          关键字
     * @param holdLockTime 持有锁的时间 防止死锁 超时自动释放
     * @return
     */
    public static boolean acquireLock(String busiCode, String key, String value, Integer holdLockTime) {
        boolean result = false;
        try {
            if ("OK".equals(jedisCluster.set(busiCode + "_" + key, value, "NX", "PX", holdLockTime))) {
                result = true;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = false;
        } finally {
        }

        return result;

    }


    public static boolean acquireLockBlock(String busiCode, String key, String value, Integer holdLockTime) {

        // 自旋
        while (true) {
            if (acquireLock(busiCode, key, value, holdLockTime)) {
                return true;
            }
//            System.out.println(Thread.currentThread().getName() + " 尝试获取锁");
        }
    }

    public static boolean releaseLock(String busiCode, String key, String value) {
        try {
            jedisCluster.del(busiCode + "_" + key);

            return true;
        } catch (Exception e) {
            return false;
        } finally {
        }
    }


    // 实现延迟队列

    public static void addCache(String key, String value) {
        jedisCluster.set(key, value);
    }

    @Test
    public void bitTest(){
        long start = System.currentTimeMillis();
        for (int i=0;i<10000;i++){

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void main(String[] args) throws InterruptedException {


        ExecutorService service = Executors.newFixedThreadPool(4);

        //

        CountDownLatch countDownLatch = new CountDownLatch(11);
        for (int i = 0; i < 7000; i++) {
            service.execute(() -> {
                String lockValue = String.valueOf(UUID.randomUUID());

                try {
                    if (acquireLockBlock("LEGOU", "CREATE_ORDER", lockValue, 20000)) {

                        // 模拟业务代码

                        System.out.println(lockValue + " 持有分布式锁 " + LocalTime.now().toString());
                        Thread.sleep(100);

                    }
                } catch (Exception e) {

                } finally {
                    releaseLock("LEGOU", "CREATE_ORDER", lockValue);
                    System.out.println(lockValue + " 释放分布式锁 " + LocalTime.now().toString());

                }
            });
        }

        countDownLatch.await();


//        addCache("LEGOU_FRONT_CASHIER_SKU_5220072713942256948875264",
//
//"[{\"id\":2453,\"skuNo\":\"5320072713942147556839424\",\"categoryId_1\":193,\"categoryId_2\":194,\"categoryId_3\":195,\"categoryId\":195,\"name\":\"超级家庭会员1月-cibn\",\"showName\":\"超级家庭会员1月-cibn\",\"price\":0.02,\"priceInfo\":null,\"marketPrice\":222,\"code_69\":\"\",\"receiptModel\":\"\",\"receiptName\":\"\",\"spuId\":651,\"spuNo\":\"5220072713942256948875264\",\"lefanVal\":\"\",\"introduction\":\"\",\"description\":\"\",\"isOnline\":2,\"businessId\":\"1\",\"createTime\":1595829767000,\"modifyTime\":1603877102000,\"createUser\":\"cuiyannan\",\"modifyUser\":\"cuiyannan\",\"skuPayId\":\"940\",\"imgUrls\":\"http://i3.img.cp21.ott.cibntv.net/lc04_pay/202007/27/14/01/1595829714020.png\",\"skuAttribute\":\"[]\",\"duration\":1,\"durationType\":2,\"downPayment\":null,\"finalPayment\":null,\"preSaleImage\":null,\"isPreSale\":0,\"addDays\":null,\"sort\":1,\"isAutoRenewal\":0,\"downPaymentTime\":null,\"finalPaymentTime\":null,\"reviewer\":null,\"reviewTime\":null,\"superSkuNo\":null,\"subSkuNo\":null,\"isContainsPromotion\":0,\"activityTimeDescription\":null,\"groupChannelsDescription\":null,\"skuType\":2,\"productItemCode\":null,\"isUseLePlusPrice\":0,\"lePlusPrice\":0,\"lePlusImages\":null,\"cornerMarkImages\":null,\"promotionType\":null,\"vipType\":2,\"vipName\":\"超级家庭会员\",\"payedSkuName\":null,\"isShowFirstScreen\":1,\"firstPromotionType\":null,\"showNameCashier\":\"超级家庭会员1月-cibn\",\"imgUrlsCashier\":\",,\",\"payChannel\":\"1,2\",\"periodType\":\"MONTH\",\"period\":null,\"templateIdWx\":null,\"isShowFrontCashier\":1},{\"id\":2455,\"skuNo\":\"5320072713942172198637568\",\"categoryId_1\":193,\"categoryId_2\":194,\"categoryId_3\":195,\"categoryId\":195,\"name\":\"超级家庭会员1年-cibn\",\"showName\":\"超级家庭会员1年-cibn\",\"price\":0.02,\"priceInfo\":null,\"marketPrice\":222,\"code_69\":null,\"receiptModel\":\"\",\"receiptName\":\"\",\"spuId\":651,\"spuNo\":\"5220072713942256948875264\",\"lefanVal\":\"\",\"introduction\":\"\",\"description\":\"\",\"isOnline\":2,\"businessId\":\"1\",\"createTime\":1595829955000,\"modifyTime\":1603877105000,\"createUser\":\"cuiyannan\",\"modifyUser\":\"cuiyannan\",\"skuPayId\":\"940\",\"imgUrls\":\"http://i3.img.cp21.ott.cibntv.net/lc04_pay/202007/27/14/01/1595829714020.png\",\"skuAttribute\":\"[]\",\"duration\":1,\"durationType\":1,\"downPayment\":null,\"finalPayment\":null,\"preSaleImage\":null,\"isPreSale\":0,\"addDays\":null,\"sort\":2,\"isAutoRenewal\":0,\"downPaymentTime\":null,\"finalPaymentTime\":null,\"reviewer\":null,\"reviewTime\":null,\"superSkuNo\":null,\"subSkuNo\":null,\"isContainsPromotion\":0,\"activityTimeDescription\":null,\"groupChannelsDescription\":null,\"skuType\":2,\"productItemCode\":null,\"isUseLePlusPrice\":0,\"lePlusPrice\":0,\"lePlusImages\":null,\"cornerMarkImages\":null,\"promotionType\":null,\"vipType\":2,\"vipName\":\"超级家庭会员\",\"payedSkuName\":null,\"isShowFirstScreen\":1,\"firstPromotionType\":null,\"showNameCashier\":\"超级家庭会员1年-cibn\",\"imgUrlsCashier\":\",,\",\"payChannel\":\"1,2\",\"periodType\":\"MONTH\",\"period\":null,\"templateIdWx\":null,\"isShowFrontCashier\":0},{\"id\":2467,\"skuNo\":\"5320072713942399533191168\",\"categoryId_1\":193,\"categoryId_2\":194,\"categoryId_3\":195,\"categoryId\":195,\"name\":\"华影时光单卖1个月-cibn\",\"showName\":\"华影时光单卖1个月-cibn\",\"price\":0.02,\"priceInfo\":null,\"marketPrice\":111,\"code_69\":null,\"receiptModel\":\"\",\"receiptName\":\"\",\"spuId\":651,\"spuNo\":\"5220072713942256948875264\",\"lefanVal\":\"\",\"introduction\":\"\",\"description\":\"\",\"isOnline\":2,\"businessId\":\"1\",\"createTime\":1595831689000,\"modifyTime\":1603877108000,\"createUser\":\"cuiyannan\",\"modifyUser\":\"cuiyannan\",\"skuPayId\":\"1611\",\"imgUrls\":\"http://i2.img.cp21.ott.cibntv.net/lc05_pay/202007/27/14/23/1595831003992.png\",\"skuAttribute\":\"[]\",\"duration\":1,\"durationType\":2,\"downPayment\":null,\"finalPayment\":null,\"preSaleImage\":null,\"isPreSale\":0,\"addDays\":null,\"sort\":3,\"isAutoRenewal\":0,\"downPaymentTime\":null,\"finalPaymentTime\":null,\"reviewer\":null,\"reviewTime\":null,\"superSkuNo\":null,\"subSkuNo\":null,\"isContainsPromotion\":0,\"activityTimeDescription\":null,\"groupChannelsDescription\":null,\"skuType\":1,\"productItemCode\":null,\"isUseLePlusPrice\":0,\"lePlusPrice\":0,\"lePlusImages\":null,\"cornerMarkImages\":null,\"promotionType\":null,\"vipType\":1,\"vipName\":\"华影时光会员\",\"payedSkuName\":null,\"isShowFirstScreen\":0,\"firstPromotionType\":null,\"showNameCashier\":\"华影时光单卖1个月-cibn\",\"imgUrlsCashier\":\",,\",\"payChannel\":\"1,2\",\"periodType\":\"MONTH\",\"period\":null,\"templateIdWx\":null,\"isShowFrontCashier\":0}]"                );
//    }
    }

}
