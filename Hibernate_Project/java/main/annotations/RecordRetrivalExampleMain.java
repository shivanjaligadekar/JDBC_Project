package main.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entertainment.entity.annotations.Movie;
import utils.HibernateUtils;

public class RecordRetrivalExampleMain {

	public static void main(String[] args) {
		try (SessionFactory sf = HibernateUtils.getSessionFactory();
				Session sessionRef = sf.openSession();) 
		{
			Class<Movie> entityType = Movie.class;
			Object identity=102;//identity=new Integer(101);
			Movie foundMovie=
			sessionRef.find(entityType, identity);
			//select * from movie_master_details where movie_id=?;
			//?-->101;
			if(foundMovie !=null) {
			System.out.println(foundMovie);
			System.out.println("Movie Title:" +foundMovie.getTitle());
			}
			else
				System.out.println("Movie with givwn id does not exits");

//			System.out.println("Record inserted...");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
