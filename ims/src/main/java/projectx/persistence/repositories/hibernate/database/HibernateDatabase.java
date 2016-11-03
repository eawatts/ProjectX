package projectx.persistence.repositories.hibernate.database;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import projectx.persistence.entities.Notification;
import projectx.persistence.util.NotificationType;

@Startup
@Singleton
@SuppressWarnings({ "unchecked", "deprecation" })
public class HibernateDatabase {

	private HibernateSession sessionManager;

	@PostConstruct
	private void configure() {
		sessionManager = HibernateSession.getInstance();
	}

	public void seedDatabase() {
		HibernateDatabaseSeed.seedDatabase(sessionManager.getSession());
	}

	/*
	 * private void commitAndCloseSession(Session session) { if(session == null)
	 * { return; } session.beginTransaction().commit();; session.close();
	 * return; }
	 */

	// NOTIFICATIONS

	public void persistNotification(Notification notification) {
		if (notification == null) {
			return;
		}
		Session session = sessionManager.getSession();
		session.save(notification);
		session.beginTransaction().commit();
	}

	public List<Notification> getNotifications() {
		Session session = null;
		try {
		    session = sessionManager.getSession();
			Criteria criteria = session.createCriteria(Notification.class);
			return criteria.list();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		} finally {
		    if (session != null) {
		        session.close();
		    }
		}
	}

	public List<Notification> getNotificationsForType(NotificationType type) {
		Session session = null;
		try {
		    session = sessionManager.getSession();
		    Criteria criteria = session.createCriteria(Notification.class);
			criteria.add(Restrictions.like("type", type));
			return criteria.list();
		    
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		} finally {
		    if (session != null) {
		        session.close();
		    }
		}
	}

	public void dismiss(Notification notification) {
		if (notification == null) {
			return;
		}
		Session session = null;
		Transaction transaction = null;
		try {
		    session = sessionManager.getSession();
		    transaction = session.beginTransaction();
		    session.delete(notification);
		    transaction.commit();
		    
		} catch(Exception e) {
			System.out.println(e.getMessage());
		    if (transaction != null) {
		        transaction.rollback();
		    }
		} finally {
		    if (session != null) {
		        session.close();
		    }
		}
	}
}
