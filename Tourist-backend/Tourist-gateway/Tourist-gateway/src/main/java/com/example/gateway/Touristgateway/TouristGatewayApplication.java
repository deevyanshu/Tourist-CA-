package com.example.gateway.Touristgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TouristGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristGatewayApplication.class, args);
	}

}
