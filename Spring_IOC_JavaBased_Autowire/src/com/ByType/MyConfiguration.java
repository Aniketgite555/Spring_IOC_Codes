package com.ByType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean(name = "e")
	public Employee employee() {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Aniket");
		//emp.setCompany(company()); no need to set because of autowired
		return emp;
		
	}
	
	@Bean(name = "c")
	public Company company() {
		Company c=new Company();
		c.setCid(1);
		c.setCname("infosys");
		return c;
	}

}
