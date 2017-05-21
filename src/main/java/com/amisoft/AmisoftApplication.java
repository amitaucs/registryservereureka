package com.amisoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AmisoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmisoftApplication.class, args);
	}
}
