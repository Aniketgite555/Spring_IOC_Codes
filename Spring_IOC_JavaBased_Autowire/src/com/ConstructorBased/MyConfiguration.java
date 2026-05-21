package com.ConstructorBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean(name = "e")
	public Employee employee() {
		return new Employee(1, "aniket", null);//even if i write null till automatically injected company
		}
	
	@Bean(name = "c")
	public Company company() {
		return new Company(1, "infosys");
	}

}
