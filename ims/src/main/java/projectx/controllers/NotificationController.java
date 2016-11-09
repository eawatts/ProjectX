package projectx.controllers;

import static projectx.persistence.util.NotificationType.CASH_ERROR;
import static projectx.persistence.util.NotificationType.DELIVERY_ERROR;
import static projectx.persistence.util.NotificationType.PURCHASE_ORDER_APPROVED;
import static projectx.persistence.util.NotificationType.PURCHASE_ORDER_ISSUE;
import static projectx.persistence.util.NotificationType.PURCHASE_ORDER_PENDING;
import static projectx.persistence.util.NotificationType.SAVE_ERROR;
import static projectx.persistence.util.NotificationType.WAREHOUSE;
import static projectx.persistence.util.NotificationType.WAREHOUSE_IDLE;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Notification;
import projectx.services.NotificationService;

@Named("notifications")
@RequestScoped
public class NotificationController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	NotificationService notificationService;
	
	public void dismiss(Notification notification) {
		notificationService.dismiss(notification);
	}
	
	public List<Notification> getPurchaseOrderPendingNotifications() {
		return notificationService.getNotificationsForType(PURCHASE_ORDER_PENDING);
	}
	
	public List<Notification> getPurchaseOrderApprovedNotifications() {
		return notificationService.getNotificationsForType(PURCHASE_ORDER_APPROVED);
	}
	
	public List<Notification> getPurchaseOrderIssueNotifications() {
		return notificationService.getNotificationsForType(PURCHASE_ORDER_ISSUE);
	}
	
	public List<Notification> getWarehouseNotifications() {
		return notificationService.getNotificationsForType(WAREHOUSE);
	}
	
	public List<Notification> getWarehouseIdleNotifications() {
		return notificationService.getNotificationsForType(WAREHOUSE_IDLE);
	}
	
	public List<Notification> getDeliveryErrorNotifications() {
		return notificationService.getNotificationsForType(DELIVERY_ERROR);
	}
	
	public List<Notification> getSaveErrorNotifications() {
		return notificationService.getNotificationsForType(SAVE_ERROR);
	}
	
	public List<Notification> getCashErrorNotifications() {
		return notificationService.getNotificationsForType(CASH_ERROR);
	}
}
