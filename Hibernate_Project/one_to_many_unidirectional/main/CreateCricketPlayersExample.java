package one_to_many_unidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_many_unidirectional_entity.CricketPlayer;
import utils.HibernateUtils;

public class CreateCricketPlayersExample {

	public static void main(String[] args) {
		try(
				SessionFactory factory= HibernateUtils.getSessionFactory();
				Session sessionRef=factory.openSession();
				){
			CricketPlayer player1=new CricketPlayer(1, "Rohit", 35);
			CricketPlayer player2=new CricketPlayer(2, "Virat", 36);
			CricketPlayer player3=new CricketPlayer(3, "aditya", 34);
			CricketPlayer player4=new CricketPlayer(4, "Shivam", 35);
			CricketPlayer player5=new CricketPlayer(5, "shubhamn",25);
			CricketPlayer player6=new CricketPlayer(6, "Mahi", 35);
			CricketPlayer player7=new CricketPlayer(7, "Sachin", 45);
			
			
			Transaction tx=sessionRef.beginTransaction();
			sessionRef.persist(player1);
			sessionRef.persist(player2);
			sessionRef.persist(player3);
			sessionRef.persist(player4);
			sessionRef.persist(player5);
			sessionRef.persist(player6);
			sessionRef.persist(player7);	
			tx.commit();
			System.out.println("Record Inserted:");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
