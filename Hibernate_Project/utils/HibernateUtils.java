package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entertainment.entity.annotations.Movie;
import one_to_many_unidirectional_entity.CricketPlayer;
import one_to_many_unidirectional_entity.CricketTeam;
import one_to_one.unidirectional.entity.Employee;
import one_to_one.unidirectional.entity.Passport;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/cdac");
		hibernateProperties.put("hibernate.connection.username", "root");
		hibernateProperties.put("hibernate.connection.password", "password");
		hibernateProperties.put("hibernate.show_sql", "true");
		hibernateProperties.put("hibernate.hbm2ddl.auto", "update");

		Configuration hibernateConfig = new Configuration();
		hibernateConfig.setProperties(hibernateProperties);

//		Class<Movie> entityType = Movie.class;
//		hibernateConfig.addAnnotatedClass(entityType);
		
		Class<Movie> entityType =Movie.class;
		Class<Passport> entityType2=Passport.class;
		Class<Employee> entityType3=Employee.class;
		Class<CricketPlayer> entityType4=CricketPlayer.class;
		Class<CricketTeam> entityType5=CricketTeam.class;
		
		hibernateConfig.addAnnotatedClass(entityType);
		hibernateConfig.addAnnotatedClass(entityType2);
		hibernateConfig.addAnnotatedClass(entityType3);
		hibernateConfig.addAnnotatedClass(entityType4);
		hibernateConfig.addAnnotatedClass(entityType5);

		SessionFactory factory = hibernateConfig.buildSessionFactory();
		return factory;
	}
}
