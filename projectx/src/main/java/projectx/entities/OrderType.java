
package projectx.entities;

public enum OrderType {
	
	CUSTOMER("Customer"),
	PURCHASE("Purchase"),
	RETURNS("Return");

	OrderType(String displayName) {
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
