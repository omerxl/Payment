package com.omer.iyzico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.omer.iyzico" })
@EnableJpaRepositories(basePackages = { "com.omer.iyzico" })
@EntityScan(basePackages = { "com.omer.iyzico" })
public class TicketPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketPaymentApplication.class, args);

	}
}