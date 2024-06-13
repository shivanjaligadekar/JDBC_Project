package example.spring.rest;

import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Marks this class as a REST Controller
public class SpringRestController {
	@RequestMapping("/doGreet")
	public String sayGreeting() {
		return "Hello All,Spring REST WEL you!!";
	}
	@RequestMapping("/one-person")
	public Person getOnePerson() {
		Person personObj=new Person("raj", "kumar", 40, "Actor");
		return personObj;
	}
	@RequestMapping("/all-person")
    public Collection<Person> getAllPerson(){
    	Person personObj1=
    			new Person("ram", "kumar", 40, "Actor");
		Person personObj2=
				new Person("raj", "kumar", 43, "Actor");
		Person personObj3=
				new Person("Akshay", "kumar", 44, "Actor");
		List<Person> allPerson=List.of(personObj1, personObj2, personObj3);
		return allPerson;
    }
}
