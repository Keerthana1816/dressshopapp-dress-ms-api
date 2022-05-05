package com.dressshopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class DressshopappDressMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DressshopappDressMsApiApplication.class, args);
	}

}
