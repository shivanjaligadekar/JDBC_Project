package example.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration //Marks this class as a Configuration unit
public class SpringConfig2 {  //this class is equivalent to spring-config.xml  
	@Bean("addr")
	public Address tempAddress() {
		Address myAddress=new Address("Pune", 412306);
		return myAddress;
	}
//	@Primary
	@Bean("addr2")
	public Address tempAddress2() {
		Address myAddress=new Address("Mumbai", 422307);
		return myAddress;
	}
	//Declaring a bean of type Customer
	@Bean("cust")
	public Customer getCustomer() {
		//not setting permanentAddress.
		Customer customerRef=new Customer();
		customerRef.setCustomerId("C001");
		customerRef.setName("Shivanjali gadekar");
		customerRef.setAge(24);
		return customerRef;
	}
	
		
}
	

