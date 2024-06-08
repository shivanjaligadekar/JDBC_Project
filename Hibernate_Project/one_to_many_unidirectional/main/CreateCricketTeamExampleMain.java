package one_to_many_unidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_many_unidirectional_entity.CricketTeam;
import utils.HibernateUtils;

public class CreateCricketTeamExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory= HibernateUtils.getSessionFactory();
				Session sessionRef=factory.openSession();
				){
				CricketTeam teamIndia=new CricketTeam("IND", "India", null);
				CricketTeam teamAustrelia=new CricketTeam("AUS", "Austrelia", null);
				
				Transaction tx=sessionRef.beginTransaction();
				sessionRef.persist(teamIndia);
				sessionRef.persist(teamAustrelia);
				tx.commit();
				System.out.println("Team Created:");	
			}
		catch (Exception e) {
			// TODO: handle exception
		}
	
		}
	
	}
