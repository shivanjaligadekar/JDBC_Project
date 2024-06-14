package example.spring.rest.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestSecurityController {
	@GetMapping("/greet")// No security
	public String doGreet() {
		return "Welcome to the world of Spring Security";
	}
	
	@GetMapping("/regular-work") //accessible to regular users as well as administrators
	public String doRegularWork() {
		return " Doing some regular work";
	}
	@GetMapping("/admin-work") //accessible to administration only
	public String doAdminWork() {
		return " Doing some admin work";
	}

}
