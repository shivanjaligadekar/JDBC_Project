package it.education.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

import it.education.entity.Course;

public class CourseDao implements DaoInterface {

	@Override
	public Collection retrievAll() {
		Collection<Course> allCourse=new ArrayList<>();
		String sqlQuery="select course_id,course_name,course_provider,course_duration,course_fees from Course_Master";
		
//		try {
//			Connection dbConnection=JdbcUtils.buildConnection();
//			Statement stmt=dbConnection.createStatement();
//			ResultSet rs=stmt.executeQuery(sqlQuery);
//			
//			while(rs.next()) {
//				int course_id=rs.getInt(1);
//				String course_name= rs.getString(2);
//				String course_provider=rs.getString(3);
//				int course_duration=rs.getInt(4);
//				int course_fees=rs.getInt(5);
//			}
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
//		return allCourse;
//	}

		
		
		return null;
	}

	@Override
	public Object retriveOne(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object t) {
		// TODO Auto-generated method stub
		
	}
}

