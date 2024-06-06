package it.education.main;

import it.education.dao.CourseDao;
import it.education.dao.DaoInterface;
import it.education.entity.Course;

public class DeleteCourseExampleMain {

	public static void main(String[] args) {
		DaoInterface<Course, Integer> daoRef=new CourseDao();
		daoRef.delete(2);

	}

}
