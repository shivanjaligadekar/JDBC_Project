package example.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringExampleMain {

	public static void main(String[] args) {
		Class<SpringConfig2> confgClass=SpringConfig2.class;
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(confgClass);
		Object customerObj=context.getBean("cust");
		System.out.println(customerObj);

	}

}
