package com.cognizant.fse3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Fse3Application {

	public static void main(String[] args) {
		SpringApplication.run(Fse3Application.class, args);
	}

}
