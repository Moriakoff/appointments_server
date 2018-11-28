package com.appointments.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.appointments.controller","com.appointments.model"})
@EnableJpaRepositories(basePackages = {"com.appointments"})
public class AppointmentsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentsServerApplication.class, args);
	}
}
