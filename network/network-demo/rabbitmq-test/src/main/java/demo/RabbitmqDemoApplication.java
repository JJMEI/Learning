package demo;

import com.mjj.rabbitmq.demo.service.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author meijunjie
 */
@SpringBootApplication
public class RabbitmqDemoApplication {

    @Autowired
    private static HelloSender helloSender;


    public static void main(String[] args) {
        SpringApplication.run(RabbitmqDemoApplication.class, args);
        for (;;){
            helloSender.send();
        }

    }

}
