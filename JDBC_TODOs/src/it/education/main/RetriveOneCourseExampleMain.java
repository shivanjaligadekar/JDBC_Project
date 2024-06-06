package it.education.main;
import it.education.dao.CourseDao;
import it.education.dao.DaoInterface;
import it.education.entity.Course;

public class RetriveOneCourseExampleMain {

	public static void main(String[] args) {
		DaoInterface<Course,Integer> daoRef =new CourseDao();
		Course courseRef=daoRef.retriveOne(1);
		if(courseRef != null)
			System.out.println(courseRef);
		else
			System.out.println("Course with given ID does not exist");

	}

}
