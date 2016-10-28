package projectx.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Notification;
import projectx.persistence.repositories.NotificationRepository;
import projectx.persistence.util.NotificationType;

@Stateless
public class NotificationService {

	@Inject
	private NotificationRepository notificationRepository;

	public List<Notification> getNotifications() {
		return notificationRepository.getNotifications();
	}

	public List<Notification> getNotificationsForType(NotificationType type) {
		return notificationRepository.getNotificationsForType(type);
	}
}