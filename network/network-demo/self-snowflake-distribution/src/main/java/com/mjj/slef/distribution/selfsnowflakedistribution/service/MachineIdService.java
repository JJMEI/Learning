package com.mjj.slef.distribution.selfsnowflakedistribution.service;

import cn.hutool.system.HostInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/**
 * @author meijunjie
 */
@Slf4j
@Service("machineIdService")
public class MachineIdService {



    @Resource
    @Qualifier(value = "redisTemplateWithString")
    private RedisTemplate redisTemplate;

    private static HostInfo hostInfo = new HostInfo();
    private static Random random = new Random(1);

    /**
     * 机器id
     */
    public static Long machineId;

    /**
     * 本地IP, 容器环境下分配的IP
     */
    private static String localIp;

    private static TimeUnit timeUnit = TimeUnit.DAYS;


    /**
     * @PostConstructor 该注解告诉spring
     * @throws Exception
     */
    @PostConstruct
    public void initMachineId() throws Exception{
        localIp = hostInfo.getAddress();
        if(StringUtils.isEmpty(localIp)){
            throw new RuntimeException("get local ip error!");
        }

        long ip = Long.parseLong(localIp.replaceAll("\\.",""));
        // 模运算 这里知道后台机器有32台
        machineId = ip % 32;

        // 创建一个机器ID
    }


    /**
     * 销毁容器前清除注册记录，但是这种方式会存在清除失败的风险
     */
    @PreDestroy
    public void destroyMachineId(){

    }

    public long createMachineId(){
        try{
            // 向redis注册 并设置超时时间
            Boolean registerResult = registerMachineId(machineId);

            // 注册成功
            if(registerResult){

                // 启动一个线程更新超时时间

                // 返回机器ID
                return machineId;
            }

            // 检查是否注册满了，不能注册，就直接返回
            if(!checkIfCanRegist()){
                // 注册满了，加报警
                return machineId;
            }
            // 递归调用, 防止是由于网络抖动导致的注册不成功
            createMachineId();
        }catch (Exception e){

        }

        // 这里还有做容错处理里 随机生成一个机器ID
        getRandomMachineId();
        return machineId;
    }

    @SuppressWarnings("unchecked")
    private boolean checkIfCanRegist() {
        Boolean isCanRegister = null;
        for(int i = 0; i <= 31; i++){
            isCanRegister = redisTemplate.hasKey("snowflake_machine_id_"+i);
            // 如果不存在 则说明可以继续注册
            if(isCanRegister == null || !isCanRegister){
                machineId = (long)i;
                break;
            }
        }
        return isCanRegister != null && !isCanRegister;
    }


//    private void updateExpTimeThread(){
//        Executors.newSingleThreadScheduledExecutor()
//                .scheduleAtFixedRate(new Runnable() {
//                    @Override
//                    public void run() {
//
//                    }
//                })
//    }

    /**
     * 注册
     * @param machineId
     * @return
     */
    private Boolean registerMachineId(Long machineId) {
        return false;
    }


    /**
     * 随机生成一个机器ID 0~31
     */
    public void getRandomMachineId() {
        machineId = (long)random.nextInt(31);
    }

    public void incMachineId(){
        if(machineId >= 31){
            machineId = 0L;
        }else {
            machineId += 1;
        }
    }


}
