package com;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");
		DemoBooks books = apc.getBean("d", DemoBooks.class);
		List<Book> b1 = books.getBook();
		System.out.println(books);

		for (Book book : b1) {
			System.out.println(book);

		}
	}

}
