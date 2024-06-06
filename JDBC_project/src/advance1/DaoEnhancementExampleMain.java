package advance1;

import java.util.Collection;

import example.java.entity.Customer;
import example.jdbc.dao.EnhancedCustomerDao;

public class DaoEnhancementExampleMain {

	public static void main(String[] args) {
		EnhancedCustomerDao enhancedDaoRef= new EnhancedCustomerDao();
		Collection<Customer> customersWithMatchingCity=enhancedDaoRef.retriveAllMatchingCustomerByCityName("pune");
		int size=customersWithMatchingCity.size();
		if(size !=0) {
			for(Customer customerRef:customersWithMatchingCity)
				System.out.println(customerRef);
		}

	}

}
