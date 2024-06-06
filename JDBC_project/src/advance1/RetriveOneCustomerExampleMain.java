package advance1;

import example.java.entity.Customer;
import example.jdbc.dao.CustomerDao;
import example.jdbc.dao.DaoInterface;

public class RetriveOneCustomerExampleMain {

	public static void main(String[] args) {
		DaoInterface<Customer,Integer> daoRef =new CustomerDao();
		Customer customerRef =daoRef.retriveOne(1);
		if(customerRef != null)
			System.out.println(customerRef);
		else
			System.out.println("Customer with given ID does not exist");
	}

}

