package com;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");
		Example E = apc.getBean("id", Example.class);
		System.out.println(E);
		System.out.println("=============================================================");

		List<String> lst = E.getMovies();
		Iterator<String> iterator = lst.iterator();
		while (iterator.hasNext()) {
			String op = iterator.next();

			System.out.println("movie " + op);

		}

		System.out.println("===================================================");

		Set<String> set = E.getElectronics();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String e = itr.next();
			System.out.println(e);

		}
		System.out.println("=======================================================");

		Map<String, String> map = E.getNumbers();
		for (Map.Entry<String, String> entry : map.entrySet()) {

			String key=entry.getKey();
			String value=entry.getValue();
			
			System.out.println(key+"       " +value);

		}
	}

}
