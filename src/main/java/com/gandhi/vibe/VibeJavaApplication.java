package com.gandhi.vibe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VibeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VibeJavaApplication.class, args);
	}

}
