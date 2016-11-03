package projectx.persistence.repositories.hibernate.database;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import projectx.persistence.entities.Notification;
import projectx.persistence.entities.Supplier;
import projectx.persistence.entities.User;
import projectx.persistence.util.NotificationType;
import projectx.persistence.util.UserLevel;

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

	// USERS - LOGIN

	public User login(String username, String password) {

		if (username == "" || password == "") {
			return null;
		}

		Session session = null;
		try {
			session = sessionManager.getSession();
			Criteria criteria = session.createCriteria(User.class);
			criteria.add(Restrictions.like("username", username));
			criteria.add(Restrictions.like("password", password));
			criteria.add(Restrictions.like("userLevel", UserLevel.ADMIN));
			return (User) criteria.uniqueResult();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	// USERS
	
	public void persistUser(User user) {
		if (user == null) {
			return;
		}
		Session session = null;
		try {
			session = sessionManager.getSession();
			session.save(user);
			session.beginTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public List<User> getUsers() {
		Session session = null;
		try {
			session = sessionManager.getSession();
			Criteria criteria = session.createCriteria(User.class);
			return criteria.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public User findByUsername(String username) {
		Session session = null;
		try {
			session = sessionManager.getSession();
			Criteria criteria = session.createCriteria(User.class);
			criteria.add(Restrictions.like("username", username));
			return (User) criteria.uniqueResult();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public boolean checkPassword(String username, String password) {
		if (username == "" || password == "") {
			return false;
		}
		User user = null;
		Session session = null;
		try {
			session = sessionManager.getSession();
			Criteria criteria = session.createCriteria(User.class);
			criteria.add(Restrictions.like("username", username));
			criteria.add(Restrictions.like("password", password));
			user = (User) criteria.uniqueResult();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (session != null) {
				session.close();
			}
		}
		// If we got a User back, the password must of been good.
		return user != null ? true : false;
	}

	// NOTIFICATIONS

	public void persistNotification(Notification notification) {
		if (notification == null) {
			return;
		}
		Session session = null;
		try {
			session = sessionManager.getSession();
			session.save(notification);
			session.beginTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public List<Notification> getNotifications() {
		Session session = null;
		try {
			session = sessionManager.getSession();
			Criteria criteria = session.createCriteria(Notification.class);
			return criteria.list();
		} catch (Exception e) {
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

		} catch (Exception e) {
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

		} catch (Exception e) {
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

	// SUPPLIERS
	public List getSuppliers() {
		Session session = null;
		try{
			session = sessionManager.getSession();
			Criteria criteria = session.createCriteria(Supplier.class);
			return criteria.list();
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}finally{
			 if (session != null) {
			        session.close();
			    }
		}
		
	}

	public Supplier findBySupplierId(int id) {
		Session session = null;
		try{
			session = sessionManager.getSession();
			Criteria criteria = session.createCriteria(Supplier.class);
			criteria.add(Restrictions.like("id", id));
			return (Supplier) criteria.uniqueResult();
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}finally{
			 if (session != null) {
			        session.close();
			    }
		}
		
	}

	public Supplier findBySupplierName(String name) {
		Session session = null;
		try{
			session = sessionManager.getSession();
			Criteria criteria = session.createCriteria(Supplier.class);
			criteria.add(Restrictions.like("name", name));
			return (Supplier) criteria.uniqueResult();
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}finally{
			 if (session != null) {
			        session.close();
			    }
		}
	}

	public void addSupplier(Supplier supplier) {
		if (supplier == null) {
			return;
		}
		Session session = sessionManager.getSession();
		session.save(supplier);
		session.beginTransaction().commit();
		
	}


}
