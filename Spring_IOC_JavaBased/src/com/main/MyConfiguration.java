package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {

	@Bean(name = "s")
	@Scope(value = "prototype")
	public Student student() {
		System.out.println("Student bean created");

		// return new Student();//object of Student class

		Student s = new Student();
		s.setBatch(batch());//object  od batch stored 

		return s;
	}

	@Bean(name = "b")
	@Scope(value = "prototype")
	public Batch batch() {
		System.out.println("Batch bean Created");
		return new Batch();
	}

}
