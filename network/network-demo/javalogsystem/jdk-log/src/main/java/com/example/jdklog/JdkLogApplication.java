package com.example.jdklog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

/**
 * @author meijunjie
 */
@SpringBootApplication
public class JdkLogApplication {
    private static final Logger LOGGER = Logger.getLogger("JdkLogApplication");

    public static void main(String[] args) {

        LOGGER.info("hello");
        SpringApplication.run(JdkLogApplication.class, args);
    }

}
