package com.quiz.microservice_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRegistryApplication.class, args);
	}

}
