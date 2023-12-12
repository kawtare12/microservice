package com.example.EurekaS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSApplication.class, args);
	}

}
