package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.Notification;
import projectx.persistence.repositories.NotificationRepository;
import projectx.persistence.repositories.offline.database.OfflineDB;
import projectx.persistence.util.NotificationType;

@Stateless
@Default
public class NotificationRepositoryOffline implements NotificationRepository{

	@Inject
	private OfflineDB db;
		
	@Override
	public List<Notification> getNotifications() {
		return db.getNotifications();
	}

	@Override
	public List<Notification> getNotificationsForType(NotificationType type) {
		return db.getNotificationsForType(type);
	}

	@Override
	public void persistNotification(Notification notification) {
		// TODO Auto-generated method stub
	}

	@Override
	public void persistNotifications(List<Notification> notifications) {
		// TODO Auto-generated method stub
	}

	@Override
	public void dismiss(Notification notification) {
		db.dismissNotification(notification);
	}
}
