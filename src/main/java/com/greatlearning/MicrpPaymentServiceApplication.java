package com.greatlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicrpPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrpPaymentServiceApplication.class, args);
	}

}
