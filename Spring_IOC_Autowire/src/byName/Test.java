package byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("byName/ByName.xml");
		A a1=context.getBean("a1",A.class);
		System.out.println(a1);
	}

}
