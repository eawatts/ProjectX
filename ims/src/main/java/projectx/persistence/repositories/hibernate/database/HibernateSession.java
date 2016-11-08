package projectx.persistence.repositories.hibernate.database;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import projectx.persistence.entities.Notification;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.Supplier;
import projectx.persistence.entities.User;

/**
 * A Singleton, that manages the sessions to the Database, and will provide an
 * open Session.
 */
@Singleton
@Startup
public class HibernateSession {
	private final String USERNAME = "root";
	private final String PASSWORD = "1234";

	private EntityManager entityManager = null;

	public EntityManager getSession() {
		if (entityManager == null)
			entityManager = Persistence.createEntityManagerFactory("nb_gardens_ims_PU").createEntityManager();
		return entityManager;
	}

	private void buildFactory() {
		Properties properties = new Properties();
		//MOVED TO PERSISTENCE.XML

		//properties.setProperty("hibernate.hbm2ddl.auto", "update");
		

		Configuration configuration = new Configuration();
		configuration.addProperties(properties);
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Notification.class);
		configuration.addAnnotatedClass(Supplier.class);
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(ProductsOrdered.class);
		configuration.addAnnotatedClass(PurchaseOrder.class);
		
		// TODO: Add an Annotated Class for each class in the Database

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		
		 
	}
}
