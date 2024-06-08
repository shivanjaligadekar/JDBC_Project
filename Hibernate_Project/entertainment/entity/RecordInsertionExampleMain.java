package entertainment.entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RecordInsertionExampleMain {

	public static void main(String[] args) {
		//step1
		Configuration hibernateConfig=new Configuration();
		hibernateConfig=hibernateConfig.configure();

		//step2
		SessionFactory hibernateFactory=hibernateConfig.buildSessionFactory();
	
		//step3
		Session hibernateSession=hibernateFactory.openSession();
		
		//step4
		Movie movieObj=new Movie(103, "swag", "comedy", 2015
				);
		
		//step 5
		Transaction hibernateTransaction=hibernateSession.beginTransaction();
		
		//step6
		hibernateSession.persist(movieObj);
		
		//step7
		hibernateTransaction.commit();
		
		//step8
		hibernateSession.close();
		
		//step9
		hibernateFactory.close();
		System.out.println("record inserted:");
	}

}
