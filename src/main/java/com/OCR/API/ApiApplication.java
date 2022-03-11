package com.OCR.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ApiApplication.class, args);
		
		/*
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(ApiApplication.class, args);	
		
		EmployeeRepository employeeRepository = 
		configurableApplicationContext.getBean(EmployeeRepository.class);
		
		Employee myEmployee = new Employee("Laurent","GINA","laurentgina@mail.com","Laurent");
		employeeRepository.save(myEmployee);
		*/
	}

}
