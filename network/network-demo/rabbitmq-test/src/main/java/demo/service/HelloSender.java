package demo.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Date;

public class HelloSender implements ApplicationContextAware {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello" + new Date();

        System.out.println("Sender: " + context);

        this.amqpTemplate.convertAndSend("hello",context);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
