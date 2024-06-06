package it.education.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleSELECTQueryExampleMain {

	public static void main(String[] args) throws SQLException {
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
			 String sqlQuery="select course_id,course_name,course_provider,course_duration,course_fees from Course_Master";
			 rs=stmt.executeQuery(sqlQuery);
			//perform Navigation
			while(rs.next()) {
				int course_id=rs.getInt(1);
				String course_name= rs.getString(2);
				String course_provider=rs.getString(3);
				int course_duration=rs.getInt(4);
				int course_fees=rs.getInt(5);
				System.out.println(" ID : " +course_id+ "NAME : " +course_name+ " course_provider : " +course_provider+ " course_duration: "+course_duration+ "course_fees:"+course_fees);
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