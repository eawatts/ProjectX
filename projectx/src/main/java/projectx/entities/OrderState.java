package projectx.entities;

public enum OrderState {
	
	UNKNOWN("Unknown"),
	CREATED("Created"),
	CONFIRMED("Confirmed"),
	PENDING_PAYMENT("Pending Payment"),
	PARTIALLY_PAID("Partially Paid"),
	FULLY_PAID("Fully Paid"),
	PICKED("Picked"),
	PACKED("Packed"),
	IN_GDZ("In GDZ"),
	OUT_FOR_DELIVERY("Out for Delivery"),
	DELIVERED("Delivered"),
	PENDING_RETURN("Pending Return"),
	RETURNED("Returned"),
	CANCELLED("Cancelled"),
	PENDING_PICKING("Pending Picking"),
	PICKING("Picking"),
	PACKING("Packing");

	OrderState(String displayName) {
		this.displayName = displayName;
	}

	private String displayName;
	
	/**
	 * Gets the display name equivalent for the Order State.
	 * @return the display name.
	 */
	public String getDisplayName() {
		return displayName;
	}
}
