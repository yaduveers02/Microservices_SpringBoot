package com.example.ServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//all microservices are registered here and when any service is down or up is shown here
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}
	
	/*
	 * This project is also a project and and this can also act like a
	 * micreoservice. So to prevent this from happening we need to do configuration
	 * in application.yml file, to make it a service registry
	 */
}
