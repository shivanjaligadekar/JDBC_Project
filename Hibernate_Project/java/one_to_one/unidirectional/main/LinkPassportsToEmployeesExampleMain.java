package one_to_one.unidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_one.unidirectional.entity.Employee;
import one_to_one.unidirectional.entity.Passport;
import utils.HibernateUtils;

public class LinkPassportsToEmployeesExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionRef=factory.openSession();
				
			){
			Class<Passport>PassportType=Passport.class;
			Class<Employee>EmployeeType=Employee.class;
			Passport p1=sessionRef.find(PassportType, "P123");
			Passport p2=sessionRef.find(PassportType, "P423");
			Employee e1=sessionRef.find(EmployeeType, 123);
			Employee e2=sessionRef.find(EmployeeType, 223);
			Transaction tr =sessionRef.beginTransaction();
			e1.setPassportRef(p1);
			e2.setPassportRef(p2);
			
			tr.commit();
			System.out.println("passport linkead");
		         }
		catch (Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
