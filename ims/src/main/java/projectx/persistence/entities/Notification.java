package projectx.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import projectx.persistence.util.NotificationType;

@Entity
@Table(name = "notification")

@NamedQueries ({
})

public class Notification {

	public Notification() {
	}
	
	public Notification(Integer id, NotificationType type, String details) {
		super();
		this.id = id;
		this.type = type;
		this.details = details;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	@NotNull
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "type", nullable = false)
	@NotNull
	private NotificationType type;
	
	@Column(name = "details")
	@Size(max = 250)
	private String details;
	
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
