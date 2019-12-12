package cn.ekgc.itrip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@MapperScan("cn.ekgc.itrip.dao")
@SpringBootApplication
public class ItripAuthProvider {
    public static void main( String[] args ) {
        SpringApplication.run(ItripAuthProvider.class, args);
    }
}
