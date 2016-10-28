package projectx.persistence.util;

public enum NotificationType {
	
	PURCHASE_ORDER_PENDING("Purchase Order Pending"),
	PURCHASE_ORDER_APPROVED("Purchase Order Approved"),
	PURCHASE_ORDER_ISSUE("Purchase Order Issue"),
	WAREHOUSE("Warehouse"),
	WAREHOUSE_IDLE("Warehouse Idle"),
	DELIVERY_ERROR("Deliver Error"),
	SAVE_ERROR("Save Error"),
	CASH_ERROR("Cash Error");

	NotificationType(String displayName) {
		this.displayName = displayName;
	}

	private String displayName;
	
	public String getDisplayName() {
		return displayName;
	}
}
