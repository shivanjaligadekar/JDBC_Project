package advance1;

import example.java.entity.Customer;
import example.jdbc.dao.CustomerDao;
import example.jdbc.dao.DaoInterface;

public class UpdateCustomerExampleMain {

	public static void main(String[] args) {
		DaoInterface<Customer, Integer> daoRef=new CustomerDao();
		Customer customerRef=daoRef.retriveOne(3);
		customerRef.setName("Ankita");
		customerRef.setAddress("Amravati");
		daoRef.update(customerRef);
		

	}

}
