package com.mjj.demo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        // 从文件中读取个接口
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/meijunjie/Desktop/Learning/network/network-demo/src/main/resources/file/readFile.txt")));
        String testInterface = null;
        Map<String,Long> testResult = new HashMap<>();

        while ((testInterface = bufferedReader.readLine()) != null){

            long startTime = System.currentTimeMillis();

            // 每个接口执行3三次取平均时间
            for(int i=0;i<3;i++){
                try{
                    // 每个接口超时时间
                    String result = HttpsUtil.get(testInterface,null,1000,1000);
                }catch (Exception e){
                    // 如果接口超时则抛出异常记录
                    // 以2000表示该接口超时了
                    testResult.put(testInterface,2000L);
                    break;
                }
            }

            testResult.put(testInterface,(System.currentTimeMillis()-startTime)/3);
        }

        // 查看接口数中的信息
        for(Map.Entry<String,Long> invokeInterfaceTest : testResult.entrySet() ){
            System.out.println("testedInterface: " + invokeInterfaceTest.getKey() + "         spendTime: " + invokeInterfaceTest.getValue() + " ms");
        }
    }
}
