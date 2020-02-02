package com.amit.energy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.amit.energy")
public class EnergyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnergyApplication.class, args);
	}

}
