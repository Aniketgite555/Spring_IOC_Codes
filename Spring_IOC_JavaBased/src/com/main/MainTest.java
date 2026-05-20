package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
		ApplicationContext apc=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Student student=apc.getBean("s",Student.class);
		student.setRollno(11);
		student.setSid(1);
		student.setSname("Aniket");
		student.getBatch().setBid(69);
		student.getBatch().setBname("Java");
		System.out.println(student);
	
	
	}

}
