package projectx.persistence.repositories.hibernate.database;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.query.Query;

import projectx.persistence.entities.Notification;
import projectx.persistence.util.NotificationType;

@Startup
@Singleton
public class HibernateDatabase {
	
	private HibernateSession sessionManager;

	@PostConstruct
	private void configure() {
		sessionManager = HibernateSession.getInstance();
	}
	
	public void seedDatabase() {
		HibernateDatabaseSeed.seedDatabase(sessionManager.getSession());
	}
	
	private void commitAndCloseSession(Session session) {
		if(session == null) {
			return;
		}
		session.beginTransaction().commit();;
		session.close();
		return;
	}
	
	// NOTIFICATIONS
		
	public void persistNotification(Notification notification) {
		if (notification == null) {	return;	}
		Session session = sessionManager.getSession();
		session.save(notification);
		commitAndCloseSession(session);
	}
	
	public List<Notification> getNotifications() {
		Session session = sessionManager.getSession();
		CriteriaQuery<Notification> query = session.getCriteriaBuilder().createQuery(Notification.class);
		query.from(Notification.class);
		return session.createQuery(query).getResultList();
	}
	
	public List<Notification> getNotificationsForType(NotificationType type) {
		Session session = sessionManager.getSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Notification> query = builder.createQuery(Notification.class);
		query.where(builder.equal(query.from(Notification.class).get("type"), type)).from(Notification.class);
		return session.createQuery(query).getResultList();
	}
	
	public void dismiss(Notification notification) {
		if (notification == null) {	return;	}
		Session session = sessionManager.getSession();
		session.delete(notification);
		commitAndCloseSession(session);
	}
}
