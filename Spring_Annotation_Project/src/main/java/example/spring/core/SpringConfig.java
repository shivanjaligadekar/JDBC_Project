package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration //Marks this class as a Configuration unit
public class SpringConfig {  //this class is equivalent to spring-config.xml  
	@Bean  //Marks this method as a bean registration method
	//The default id is the method name: getHelloBean
	public GreetingService getHelloBean() {
		GreetingService gs=new HelloService();
		return gs;
	}
	@Bean("greet")//Overwrites the default ID and asigns a new
	public GreetingService getWelcomeBean() {
		GreetingService gs=new WelcomeService();
		return gs;
	}
	@Bean
	@Lazy //Marks this bean as lasy
	public GreetingService matchResult() {
		CricketMatchResult result=new CricketMatchResult();
		result.setWinningTeam("India");
		result.setLoseingTeam("Pakistan");
		result.setWinningMargin(6);
		result.setWinningType("Runs");
		return result;	
	}
	@Bean
	@Scope
	public GreetingService matchResult2() {
		//This is equivalent to constructor injection
		GreetingService gs=new CricketMatchResult(8, "India", "Ireland","wicket");
		return gs;
	}
}
