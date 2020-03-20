package com.mjj.io;

import java.io.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/meijunjie/Desktop/Learning/network/network-demo/src/main/resources/file/1-50")));

        Pattern pattern = Pattern.compile("\\d{25,25}");

        HashSet<String> spuNos = new HashSet<>();
        String line = "";
        while ((line = br.readLine()) !=null){
            Matcher matcher = pattern.matcher(line);

            if(matcher.find()){
                spuNos.add(matcher.group());
            }
        }

        for(String spuNo : spuNos){
            System.out.println(spuNo);
        }

    }
}
