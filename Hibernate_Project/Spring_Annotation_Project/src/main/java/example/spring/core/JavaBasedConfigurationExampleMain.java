package example.spring.core;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationExampleMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		Class<SpringConfig> configClass=SpringConfig.class;
		context.register(configClass);//registering con
		context.refresh();
		
		Object loadedObject= context.getBean("greet");
		GreetingService gs=(GreetingService)loadedObject;
		String reply=gs.sayGreeting();
		System.out.println(reply);
		
		System.out.println("============================");
		

	}

}
