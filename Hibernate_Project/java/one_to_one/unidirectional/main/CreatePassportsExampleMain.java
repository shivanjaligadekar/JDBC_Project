package one_to_one.unidirectional.main;

import java.time.LocalDate;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_one.unidirectional.entity.Passport;
import utils.HibernateUtils;


public class CreatePassportsExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionRef=factory.openSession();
				
				){
			Passport P1=new Passport("P123", "shivanjali gadekar", LocalDate.of(2030, 6, 12));
			Passport P2=new Passport("P423", "Nikeeta gadekar", LocalDate.of(2028, 6, 11));
			
			Transaction tx=sessionRef.beginTransaction();
			sessionRef.persist(P1);
			sessionRef.persist(P2);
			tx.commit();
			System.out.println("passport created");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
