package com.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("File.xml");
		Car car=context.getBean("c",Car.class);
		System.out.println(car.getCarname());
		System.out.println(car.getCarmodel());
		System.out.println(car.getEngine().getEngid());
		System.out.println(car.getEngine().getEngtype());
		
		System.out.println(car.hashCode());
		System.out.println(car.getEngine().hashCode());
		
		System.out.println("=========================================================");

		Car car1=context.getBean("c",Car.class);
		System.out.println(car1.getCarname());
		System.out.println(car1.getCarmodel());
		System.out.println(car1.getEngine().getEngid());
		System.out.println(car1.getEngine().getEngtype());
		
		System.out.println(car1.hashCode());
		System.out.println(car1.getEngine().hashCode());
		
		//when scope of both beans in xml is singleton then hashcode is same
		//when scope of both beans in xml is protype then hashcode is Different
		//when scope of Car beans in xml is singleton and scope of engine is prototype then hashcode is same
		

	}

}
