package com.ooad.hungrybellies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

;

@SpringBootApplication
@EnableJpaAuditing
public class FoodDeliveryApplication_1 {
	
	public static void main(String[] args) {
		
		//EmployeeDAO e = new EmployeeDAO();
		//System.out.println(e.findAll());
		SpringApplication.run(FoodDeliveryApplication_1.class, args);
	}

}
