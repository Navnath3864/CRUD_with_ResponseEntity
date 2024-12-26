package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudWithResponseEntityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudWithResponseEntityApplication.class, args);
		System.out.println("Start Spring project");
	}

}
