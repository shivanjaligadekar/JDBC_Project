package advance1;
import java.util.Collection;

import example.java.entity.Customer;
import example.jdbc.dao.CustomerDao;
import example.jdbc.dao.DaoInterface;

public class SimpleSELECTQueryExampleMain2
{public static void main(String[] args) {

	DaoInterface<Customer, Integer> daoRef 
	     =new CustomerDao();
	
Collection <Customer>allCustomer =daoRef.retrievAll();
			
	for(Customer cust : allCustomer) 
	{
		System.out.println(cust);
	}
	
}}

