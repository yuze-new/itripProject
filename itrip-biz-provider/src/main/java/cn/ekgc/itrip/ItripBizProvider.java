package cn.ekgc.itrip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@MapperScan("cn.ekgc.itrip.dao")
@EnableEurekaClient
@SpringBootApplication
public class ItripBizProvider {
    public static void main( String[] args ) {
        SpringApplication.run(ItripBizProvider.class, args);
    }
}
