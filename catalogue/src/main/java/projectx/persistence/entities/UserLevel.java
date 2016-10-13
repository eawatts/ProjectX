package projectx.persistence.entities;

public enum UserLevel {
	
	ADMIN("Admin"),
	CUSTOMER("Customer");

	UserLevel(String displayName) {
		this.displayName = displayName;
	}

	private String displayName;
	
	public String getDisplayName() {
		return displayName;
	}
}
