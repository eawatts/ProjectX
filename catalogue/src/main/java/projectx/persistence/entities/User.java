package projectx.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@NamedQueries (
	{
		@NamedQuery (name = User.SAVE_USER, query = ""),
		@NamedQuery (name = User.SAVE_USERS, query = ""),
		@NamedQuery (name = User.GET_USERS, query = ""),
		@NamedQuery (name = User.UPDATE_USER, query = ""),
		@NamedQuery (name = User.FIND_BY_USERNAME, query = "SELECT u FROM User u WHERE u.username = :username"),
		@NamedQuery (name = User.CHECK_PASSWORD, query = "")
	}
)

@Entity
@Table(name = "User")
public class User {
	
	public static final String SAVE_USER = "User.saveUser";
	public static final String SAVE_USERS = "User.saveUsers";
	public static final String GET_USERS = "User.getUsers";
	public static final String UPDATE_USER = "User.updateUser";
	public static final String FIND_BY_USERNAME = "User.findByUsername";
	public static final String CHECK_PASSWORD = "User.checkPassword";
	
/*	ID will be implemented when a proper database is hooked up
 * @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	*/	
	
	@Column(name="title", length =6, nullable = false)
	private String title;


	@Column(name = "username", length = 30, nullable = false)
	private String username;
	
	@Column(name = "password", length = 256, nullable = false)
	private byte[] password;
	
	@Column(name = "firstname", length = 50, nullable = false)
	private String firstname;
	
	@Column(name = "surname", length = 50, nullable = false)
	private String surname;
	
	@Column(name = "age", nullable = false)
	private int age;
	

	/* Implemented on merge
	@ManyToOne
	@MapsId
	@JoinColumn(name = "")
	@Column(name = "user_level", nullable = false)
	private UserLevel userLevel;
	*/
	@Email
	@Column(name = "email_address", nullable = false)
	private String emailAddress;
	private Address address;
	public User() {}
	
	public User(/*int id,*/String title, String emailAddress, byte[] password, String firstname, String surname, /*UserLevel userLevel,*/BankAccount bankaccount,Address address,int age) {
		//this.id = id;
		this.title=title;
		this.password = password;
		this.firstname = firstname;
		this.surname = surname;
		//this.userLevel = userLevel;
		this.emailAddress = emailAddress;
		this.bankaccount=bankaccount;
		this.address=address;
	}

//	public int getId(){
//		return this.id;
//	}
		
//	public String getUsername() {
//		return username;
//	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public byte[] getPassword() {
		return password;
	}
	
	public void setPassword(byte[] password) {
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
	
	private BankAccount bankaccount;
	public BankAccount getBankaccount() {
		return bankaccount;
	}

	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//	public UserLevel getUserLevel() {
//		return userLevel;
//	}
}
