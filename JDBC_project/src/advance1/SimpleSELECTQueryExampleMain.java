package advance1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class SimpleSELECTQueryExampleMain {

	public static void main(String[] args)throws SQLException {
		Connection dbConnection=null;
		Statement stmt=null;
		ResultSet rs=null;
		  
		try {
			//Load Driver
			String driverClassName="com.mysql.cj.jdbc.Driver";
			Class.forName(driverClassName);
			System.out.println("Driver Loaded");
			//Estsblish Connection
			String URL="jdbc:mysql://localhost:3306/cdac";
			String UID="root";
			String PWD="password";
		    dbConnection=DriverManager.getConnection(URL, UID, PWD);
			DriverManager.getConnection(URL, UID, PWD);
			System.out.println("Connected");
			
			//Obtain some Statement
			 stmt=(Statement) dbConnection.createStatement();			//Execute SQL Query
			 String sqlQuery="select name,address,custid from customer_master";
			 rs=stmt.executeQuery(sqlQuery);
			//perform Navigation
			while(rs.next()) {
				String name= rs.getString(1);
				String address=rs.getString(2);
				int custid=rs.getInt(3);
				System.out.println(" ID : " +custid+ "NAME : " +name+ " Address : " +address);
			}
		} catch (ClassNotFoundException e) {   // TODO Auto-generated catch block
			e.printStackTrace();               //forName() --> throw -->ClassNotFoundException
		} 
		finally {
			//closing all the resourse
			try {
				rs.close();
				stmt.close();
				dbConnection.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
		}
	}
	}
}
