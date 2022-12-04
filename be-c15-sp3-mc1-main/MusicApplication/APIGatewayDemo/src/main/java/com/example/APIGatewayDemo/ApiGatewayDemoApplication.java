package com.example.APIGatewayDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayDemoApplication.class, args);
	}

}
