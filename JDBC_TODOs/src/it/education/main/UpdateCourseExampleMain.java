package it.education.main;

import it.education.dao.CourseDao;
import it.education.dao.DaoInterface;
import it.education.entity.Course;

public class UpdateCourseExampleMain {

	public static void main(String[] args) {
		DaoInterface<Course, Integer> daoRef=new CourseDao();
		Course courseRef=daoRef.retriveOne(3);
		courseRef.setCourseId(50);
		courseRef.setName("cdac");
		courseRef.setProvider("MET IIT");
		courseRef.setDuration(6);
		courseRef.setFees(150000);
	}

}
