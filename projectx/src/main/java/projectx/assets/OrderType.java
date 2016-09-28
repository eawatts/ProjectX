package projectx.assets;

public enum OrderType {
	
	CUSTOMER("Customer"),
	PURCHASE("Purchase"),
	RETURNS("Return");

	OrderType(String displayName) {
		this.displayName = displayName;
	}

	private String displayName;
	
	public String getDisplayName() {
		return displayName;
	}
}
