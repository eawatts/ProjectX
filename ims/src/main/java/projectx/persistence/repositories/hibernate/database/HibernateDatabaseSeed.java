package projectx.persistence.repositories.hibernate.database;

import java.util.ArrayList;

import org.hibernate.Session;

import projectx.persistence.entities.Notification;
import projectx.persistence.entities.User;
import projectx.persistence.util.NotificationType;
import projectx.persistence.util.UserLevel;

public class HibernateDatabaseSeed {
	
	public static void seedDatabase(Session session) {
		seedUsers(session);
		seedNotifications(session);
		session.close();
	}
	
	private static void seedUsers(Session session) {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User(1, "hello", "password", "firstname", "lastname", UserLevel.CUSTOMER, "username@email.com"));
		users.add(new User(2, "alstock", "password", "Al", "Stock", UserLevel.ADMIN, "alstock@al.co.uk"));
		users.add(new User(2, "adam", "test", "Adam", "Dev", UserLevel.ADMIN, "email@me.com"));
		
		for (User user : users)	session.save(user);
		
		session.beginTransaction().commit();
	}
	
	private static void seedNotifications(Session session) {
		ArrayList<Notification> notifications = new ArrayList<Notification>();
		notifications.add(new Notification(null, NotificationType.PURCHASE_ORDER_ISSUE, "It seems a bit costly."));
		notifications.add(new Notification(null, NotificationType.PURCHASE_ORDER_ISSUE, "It's cheaper at the first place."));
		notifications.add(new Notification(null, NotificationType.PURCHASE_ORDER_ISSUE, "We are planning to stop selling these."));
		notifications.add(new Notification(null, NotificationType.PURCHASE_ORDER_ISSUE, "Double the about out Product 34."));
		notifications.add(new Notification(null, NotificationType.PURCHASE_ORDER_ISSUE, "Just resubmit this one Monday."));
		notifications.add(new Notification(null, NotificationType.WAREHOUSE_IDLE, "Half of the team are not doing anything."));
		notifications.add(new Notification(null, NotificationType.WAREHOUSE_IDLE, "Baz hasn't done any work all day."));
		notifications.add(new Notification(null, NotificationType.SAVE_ERROR, "Is the server down?"));
		notifications.add(new Notification(null, NotificationType.SAVE_ERROR, "Can't save the Purchase Order!"));
		notifications.add(new Notification(null, NotificationType.SAVE_ERROR, "Not sure what happened."));
		notifications.add(new Notification(null, NotificationType.DELIVERY_ERROR, "The eagle has landed!"));
		
		for (Notification notification : notifications)	session.save(notification);
		
		session.beginTransaction().commit();
	}	
}
