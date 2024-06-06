package advance1;

import example.java.entity.Customer;
import example.jdbc.dao.CustomerDao;
import example.jdbc.dao.DaoInterface;

public class CreateNewCustomerExampleMain {

	public static void main(String[] args) {
		DaoInterface<Customer, Integer> daoRef=new CustomerDao();
		Customer customerObj=new Customer(0, "", "");
		daoRef.create(customerObj);

	}

}
