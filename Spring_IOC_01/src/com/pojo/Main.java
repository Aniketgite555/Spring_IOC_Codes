package com.pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {

		org.springframework.core.io.Resource resource = new ClassPathResource("NewFile.xml");
		//lazy loading 
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Student student=beanFactory.getBean("s",Student.class);
		System.out.println(student);
		
		Employee  employee=beanFactory.getBean("e",Employee.class);
		System.out.println(employee);
		
		
		System.out.println("===================================================================");
		//Eager loading
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile1.xml");//

	}

}
