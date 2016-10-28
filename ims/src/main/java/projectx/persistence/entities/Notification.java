package projectx.persistence.webentities;

import projectx.persistence.util.NotificationType;

public class Notifications {
	
	public Notifications(){} 
	
	private NotificationType type;
	private String details;
	
	public NotificationType getType() {
		return type;
	}
	public void setType(NotificationType type) {
		this.type = type;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
