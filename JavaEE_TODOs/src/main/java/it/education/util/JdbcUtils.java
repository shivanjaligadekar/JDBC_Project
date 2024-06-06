package it.education.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	//A utility class used for establishing a connection
	public static Connection buildConnection() throws SQLException, ClassNotFoundException {
		//Estsblish Connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		String URL="jdbc:mysql://localhost:3306/cdac";
		String UID="root";
		String PWD="password";
	    Connection dbConnection = DriverManager.getConnection(URL, UID, PWD);
	    return dbConnection;
	}
}
//Connection con=Jdbc
