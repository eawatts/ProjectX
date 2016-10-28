package projectx.persistence.repositories;

import java.util.List;

import projectx.persistence.entities.Notification;
import projectx.persistence.util.NotificationType;

public interface NotificationRepository {

	public List<Notification> getNotifications();
	public List<Notification> getNotificationsForType(NotificationType type);
	
	public void persistNotification(Notification notification);
	public void persistNotifications(List<Notification> notifications);
}
