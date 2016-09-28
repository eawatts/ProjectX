package projectx.assets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "User")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
		
	@Column(name = "username", length = 30, nullable = false)
	private String username;
	
	@Column(name = "password", length = 256, nullable = false)
	private String password;
	
	@Column(name = "firstname", length = 50, nullable = false)
	private String firstname;
	
	@Column(name = "surname", length = 50, nullable = false)
	private String surname;
	
	@ManyToOne
	@MapsId
	@JoinColumn(name = "")
	@Column(name = "user_level", nullable = false)
	private UserLevel userLevel;
	
	@Email
	@Column(name = "email_address", nullable = false)
	private String emailAddress;
	
	public User() {}
	
	public User(Long id, String username, String password, String firstname, String surname, UserLevel userLevel, String emailAddress) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.surname = surname;
		this.userLevel = userLevel;
		this.emailAddress = emailAddress;
	}

	public Long getId(){
		return this.id;
	}
		
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public UserLevel getUserLevel() {
		return userLevel;
	}
}
