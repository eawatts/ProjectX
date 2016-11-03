package projectx.persistence.repositories.hibernate;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import projectx.persistence.entities.Notification;
import projectx.persistence.repositories.NotificationRepository;
import projectx.persistence.repositories.hibernate.database.HibernateDatabase;
import projectx.persistence.util.NotificationType;

@Stateless
@Alternative // This can be used by changing beans.xml

public class NotificationRepositoryHibernate implements NotificationRepository {
	
	@Inject
	private HibernateDatabase db;

	@Override
	public List<Notification> getNotifications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notification> getNotificationsForType(NotificationType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void persistNotification(Notification notification) {
		db.persistNotification(notification);
	}

	@Override
	public void persistNotifications(List<Notification> notifications) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void dismiss(Notification notification) {
		db.dismiss(notification);
	}
}
