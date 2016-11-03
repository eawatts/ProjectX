package projectx.persistence.repositories.hibernate.database;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.hibernate.Session;


import projectx.persistence.entities.Notification;
import projectx.persistence.util.NotificationType;

@Startup
@Singleton
public class HibernateDatabase {
	
	private HibernateSession hibernateSession;

	@PostConstruct
	private void configure() {
		hibernateSession = HibernateSession.getInstance();
	}
		
	public void addNotification() {
		
		System.out.println("*******************************************2222**********************************");
		System.out.println("Hibernate Database: adding Notification?");
		Notification notification = new Notification(null, NotificationType.SAVE_ERROR, "Testing the database.");
		Session session = hibernateSession.getSession();
		session.save(notification);
		session.beginTransaction().commit();
		session.close();	
	}


}
