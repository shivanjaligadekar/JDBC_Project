package example.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidater;

@Controller  //This marks the class as a controller
public class SpringMvcController {
	@RequestMapping("/greet") ////This marks the method as a requestMapping
	public String getIndexPage() {
		System.out.println("Request Recived:");
		//This method gets invoked when client requests for the resource with URL:/greet
		return "index";
	}
	
	@RequestMapping("/showLogin")
	public String getLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/doValidate",method = RequestMethod.POST)
	public String doValidateUser(
			@RequestParam("user_name")String uid,
			@RequestParam("user_password") String pwd )
	{
		User userObj=new User(uid, pwd);
		boolean valid=UserValidater.isValid(userObj);
		String resultPage="failure";
		if(valid)
			resultPage="success";
		return resultPage;		
	}
	@RequestMapping(value="/doValidateAgain",method = RequestMethod.POST)
	public String doValidateUserAgain(
			@RequestParam("user_name")String uid,
			@RequestParam("user_password") String pwd )
	{
		User userObj=new User(uid, pwd);
		boolean valid=UserValidater.isValid(userObj);
		String resultPage="failure";
		if(valid)
			resultPage="successAgain";
		return resultPage;		
	}

}
