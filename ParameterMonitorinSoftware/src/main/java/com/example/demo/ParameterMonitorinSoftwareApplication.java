package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.rms")
@EntityScan("com.rms.model")
@SpringBootApplication
public class ParameterMonitorinSoftwareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParameterMonitorinSoftwareApplication.class, args);
	}
}
