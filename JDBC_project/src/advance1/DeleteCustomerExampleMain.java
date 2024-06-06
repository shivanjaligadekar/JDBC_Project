package advance1;

import example.java.entity.Customer;
import example.jdbc.dao.CustomerDao;
import example.jdbc.dao.DaoInterface;

public class DeleteCustomerExampleMain {

	public static void main(String[] args) {
		DaoInterface<Customer, Integer> daoRef =new CustomerDao();
		daoRef.delete(2);
		

	}

}
