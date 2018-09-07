package com.soa.sever1consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Sever1consumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sever1consumerApplication.class, args);
	}
}
