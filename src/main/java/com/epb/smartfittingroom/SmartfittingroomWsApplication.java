package com.epb.smartfittingroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SmartfittingroomWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartfittingroomWsApplication.class, args);
	}
}
