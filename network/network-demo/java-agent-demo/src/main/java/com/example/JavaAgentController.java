package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaAgentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaAgentController.class);

    @GetMapping("/java/agent")
    public void javaAgentTest() throws InterruptedException {
        LOGGER.info("java agent test");
        Thread.sleep(1999);
    }
}
