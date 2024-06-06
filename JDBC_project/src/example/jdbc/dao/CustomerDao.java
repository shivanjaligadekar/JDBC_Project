package example.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import example.java.entity.Customer;
import example.jdbc.utils.JdbcUtils;

public class CustomerDao implements DaoInterface<Customer,Integer>{

	@Override
	public Collection<Customer> retrievAll() { 
		//Creating an empty collection of customer
		Collection<Customer> allCustomers=new ArrayList<>();
		//
		//
		String sqlQuery="select name,address,custid from customer_master";
		try {
			Connection dbConnection=JdbcUtils.buildConnection();
			Statement stmt=dbConnection.createStatement();
			ResultSet rs=stmt.executeQuery(sqlQuery);
		
					
			while(rs.next()) {
						String name= rs.getString(1);
						String address=rs.getString(2);
						int custid=rs.getInt(3);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return allCustomers;
	}
//	@Override
//	public Co retriveOne(Integer id) {
//		// fetching single customer against ID and returning it
//		Customer foundCustomer=null;
//		String sqlQuery="select dname,loc,deptno from dept where deptno ?";
//		try {
//			Connection dbConnection=JdbcUtils.buildConnection();
//			PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
//			{
//				pstmt.setInt(1,id);
//				ResultSet
//				
//				if(rs.next()) {
//					String name= rs.getString(1);
//					String dept=rs.getString(2);
//					int id=rs.getInt(3);
//					foundCustomer =new Customer(cust_id,name,address)
//				}
//				
//			}
//		}catch (Exception ex) {
//			// TODO: handle exception
//			ex.printStackTrace();
//		}
//	
//		return foundCustomer;
//	}

	@Override
	public Customer retriveOne(Integer id) {
// fetching single customer against ID and returning it
		Customer foundCustomer=null;
		String sqlQuery="select name,address,custid from customer_master where deptno ?";
		try {
			Connection dbConnection=JdbcUtils.buildConnection();
			PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
			{
				pstmt.setInt(1,id);
				ResultSet rs= pstmt.executeQuery();
				
				
				if(rs.next()) {
					String name= rs.getString(1);
					String address=rs.getString(2);
					int custid=rs.getInt(3);
					foundCustomer =new Customer(custid,name,address);
				}
				
			}
		}catch (Exception ex) {
//			// TODO: handle exception
		ex.printStackTrace();
		}
		return null;
	}
//		return foundCustomer;
//	}

	@Override
	public void create(Customer customerRef) {
		String sqlQuery = "insert into customer_master values(?,?,?)";
		try {
			Connection dbConnection=JdbcUtils.buildConnection();
			PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
			{
				int custId=customerRef.getCustomerid();
				String custName=customerRef.getName();
				String custAddress=customerRef.getAddress();
				
				pstmt.setInt(1, custId);
				pstmt.setString(2, custName);
				pstmt.setString(3, custAddress);
				
				int updateCount=pstmt.executeUpdate();
				System.out.println(updateCount+"record inserted");
			}
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}
	}

	@Override
	public void delete(Integer id) {
		String sqlQuery="delete from customer_master where custid=?";
		try {
			Connection dbConnection=JdbcUtils.buildConnection();
			PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
			
			{
				pstmt.setInt(1, id);
				int updateCount=pstmt.executeUpdate();
				System.out.println(updateCount+"record deleted");
			}
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}
		
		
	}

	@Override
	public void update(Customer modifiedCustomer) {
		String sqlQuery="update customer_master set name=?,address=? where custid=?";
		int id=modifiedCustomer.getCustomerid();
		String newName=modifiedCustomer.getName();
		String newAddress=modifiedCustomer.getAddress();
		try {
			Connection dbConnection=JdbcUtils.buildConnection();
			PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery);
			
			{
				pstmt.setString(1, newName);
				pstmt.setString(2, newAddress);
				pstmt.setInt(3, id);
				
				int updateCount=pstmt.executeUpdate();
				System.out.println(updateCount+"record updated");
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
