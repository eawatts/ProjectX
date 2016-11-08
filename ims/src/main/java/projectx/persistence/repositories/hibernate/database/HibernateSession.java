package projectx.persistence.repositories.hibernate.database;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import projectx.persistence.entities.Notification;
import projectx.persistence.entities.Supplier;
import projectx.persistence.entities.User;

/**
 * A Singleton, that manages the sessions to the Database, and will provide an
 * open Session.
 */
public class HibernateSession {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "password";

	private SessionFactory sessionFactory;

	private static HibernateSession instance = null;

	public static HibernateSession getInstance() {
		if (instance == null) {
			instance = new HibernateSession();
		}
		return instance;
	}

	private HibernateSession() {
		buildFactory();
	}

	public Session getSession() {
		if (sessionFactory == null) {
			buildFactory();
		}
		return sessionFactory.openSession();
	}

	private void buildFactory() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/nb_gardens_ims");
		properties.setProperty("hibernate.connection.username", USERNAME);
		properties.setProperty("hibernate.connection.password", PASSWORD);
		properties.setProperty("hibernate.show_sql", "true");
		
		// What will you decide?
		//properties.setProperty("hibernate.hbm2ddl.auto", "create");
		 properties.setProperty("hibernate.hbm2ddl.auto", "update");
		

		Configuration configuration = new Configuration();
		configuration.addProperties(properties);
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Notification.class);
		configuration.addAnnotatedClass(Supplier.class);
		//configuration.addAnnotatedClass(Product.class);
		// TODO: Add an Annotated Class for each class in the Database

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
}
