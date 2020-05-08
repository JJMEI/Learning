package com.mjj.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class SLFJLOG4J2Demo {

    private static Logger logger = LoggerFactory.getLogger(SLFJLOG4J2Demo.class);

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            logger.info("now is {}", LocalDateTime.now().toString());
        }
    }
}
