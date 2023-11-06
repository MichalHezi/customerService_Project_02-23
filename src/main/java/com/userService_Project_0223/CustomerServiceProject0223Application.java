package com.userService_Project_0223;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CustomerServiceProject0223Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceProject0223Application.class, args);
	}

}
