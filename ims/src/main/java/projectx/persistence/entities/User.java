package projectx.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

import projectx.persistence.util.UserLevel;

@NamedQueries (
	{
/*		@NamedQuery (name = User.SAVE_USER, query = ""),
		@NamedQuery (name = User.SAVE_USERS, query = ""),
		@NamedQuery (name = User.GET_USERS, query = ""),
		@NamedQuery (name = User.UPDATE_USER, query = ""),
		@NamedQuery (name = User.FIND_BY_USERNAME, query = "SELECT u FROM User u WHERE u.username = :username"),
		@NamedQuery (name = User.CHECK_PASSWORD, query = "")*/	
	}
)

@Entity
@Table(name = "user")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String SAVE_USER = "User.saveUser";
	public static final String SAVE_USERS = "User.saveUsers";
	public static final String GET_USERS = "User.getUsers";
	public static final String UPDATE_USER = "User.updateUser";
	public static final String FIND_BY_USERNAME = "User.findByUsername";
	public static final String CHECK_PASSWORD = "User.checkPassword";
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "username", length = 30, nullable = false)
	private String username;
	
	@Column(name = "password", length = 256, nullable = false)
	private String password;
	
	@Column(name = "firstname", length = 50, nullable = false)
	private String firstname;
	
	@Column(name = "surname", length = 50, nullable = false)
	private String surname;
	
	@Column(name = "user_level", nullable = false)
	private UserLevel userLevel;
	
	@Email
	@Column(name = "email_address", nullable = false)
	private String emailAddress;
	
	public User() {}
	
	public User(Integer id, String username, String password, String firstname, String surname, UserLevel userLevel, String emailAddress) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.surname = surname;
		this.userLevel = userLevel;
		this.emailAddress = emailAddress;
	}

	public Integer getId(){
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