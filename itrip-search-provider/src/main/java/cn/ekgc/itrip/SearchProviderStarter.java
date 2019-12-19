package cn.ekgc.itrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SearchProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(SearchProviderStarter.class, args);
	}
}
