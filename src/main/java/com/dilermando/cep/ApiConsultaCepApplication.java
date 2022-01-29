package com.dilermando.cep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiConsultaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiConsultaCepApplication.class, args);
	}

}