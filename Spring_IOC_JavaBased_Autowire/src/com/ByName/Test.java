package com.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee employee=apc.getBean("e",Employee.class);
		System.out.println(employee);
		System.out.println(employee.hashCode());
	}

}
