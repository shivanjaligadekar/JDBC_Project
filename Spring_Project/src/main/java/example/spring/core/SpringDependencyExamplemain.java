package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDependencyExamplemain {

	public static void main(String[] args) {
		ApplicationContext context;
		String configPath="./src/main/resources/spring-config.xml";
		context=new FileSystemXmlApplicationContext(configPath);
		Object loadedObject=context.getBean("greet4");
		GreetingService gs=(GreetingService)loadedObject;
		String reply=gs.sayGreeting();
		System.out.println(reply);	
		
		System.out.println("------------------------------------");
		 loadedObject=context.getBean("greet6");
		 gs=(GreetingService)loadedObject;
		 reply=gs.sayGreeting();
		  System.out.println(reply);	
		
		
	}

}
