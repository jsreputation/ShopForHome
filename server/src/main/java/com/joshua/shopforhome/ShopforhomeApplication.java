package com.joshua.shopforhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShopforhomeApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShopforhomeApplication.class, args);
	}
}
