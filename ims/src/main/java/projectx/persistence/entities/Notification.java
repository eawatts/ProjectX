package projectx.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import projectx.persistence.util.NotificationType;

@Entity
@Table(name = "notification")

@NamedQueries({
	@NamedQuery(name = Notification.FIND_NOTIFICATIONS_BY_TYPE, query = "SELECT n FROM Notification n WHERE n.type = :type")
})

public class Notification {
	
	public static final String FIND_NOTIFICATIONS_BY_TYPE = "Supplier.findNotificationsByType";

	@Id
	@GeneratedValue()
	@Column(name = "id", nullable = false)
	private Integer id;

	@NotNull
	@Column(name = "type", nullable = false)
	private NotificationType type;

	@Column(name = "details")
	@Size(max = 250)
	private String details;
	
	public Notification() {
	}

	public Notification(Integer id, NotificationType type, String details) {
		super();
		this.id = id;
		this.type = type;
		this.details = details;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
