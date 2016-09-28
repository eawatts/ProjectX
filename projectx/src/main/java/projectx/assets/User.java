package projectx.assets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "User")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
		
	@Column(name = "username", length = 30)
	private String username;
	
	@Column(name = "password", length = 256)
	private String password;
	
	@Column(name = "firstname", length = 50)
	private String firstname;
	
	@Column(name = "surname", length = 50)
	private String surname;
	
	@Column(name = "user_level")
	private UserLevel userLevel;
	
	@Email
	@Column(name = "email_address")
	private String emailAddress;
	
	public User() {}
	
	public User(UserLevel userLevel) {
		this.userLevel = userLevel;
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
