package it.education.main;

import it.education.dao.CourseDao;
import it.education.dao.DaoInterface;
import it.education.entity.Course;

public class CreateNewCourseExampleMain {

	public static void main(String[] args) {
		DaoInterface<Course, Integer> daoRef=new CourseDao();
		Course courseObj=new Course(60, "WPD", "qstack", 6, 40000);
		daoRef.create(courseObj);

	}

}
