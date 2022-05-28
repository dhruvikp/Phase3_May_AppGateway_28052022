package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Phase3MayAppGateway28052022Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase3MayAppGateway28052022Application.class, args);
	}

}
