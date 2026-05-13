package com.customer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @springBootApplication
 * is a combination of below three annotations
 *
 * @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan
 */

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
