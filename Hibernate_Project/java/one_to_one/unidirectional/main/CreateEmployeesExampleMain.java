package one_to_one.unidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_one.unidirectional.entity.Employee;
import utils.HibernateUtils;

public class CreateEmployeesExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionRef=factory.openSession();
				
				){
			Employee e1=new Employee(123, "shivanjali", 100000, null);
			Employee e2=new Employee(223, "anjali", 140000, null);
			Employee e3=new Employee(323, "raj", 120000, null);
			
			Transaction tx=sessionRef.beginTransaction();
			sessionRef.persist(e1);
			sessionRef.persist(e2);
			sessionRef.persist(e3);
			tx.commit();
			System.out.println("Employee created");	
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		}

	}


