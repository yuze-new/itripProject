package cn.ekgc.itrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ItripAuthConsumer {
    public static void main( String[] args ) {
        SpringApplication.run(ItripAuthConsumer.class, args);
    }
}
