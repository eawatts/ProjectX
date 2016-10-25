package projectx.persistence.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@NamedQueries({ @NamedQuery(name = User.SAVE_USER, query = ""), @NamedQuery(name = User.SAVE_USERS, query = ""),
		@NamedQuery(name = User.GET_USERS, query = ""), @NamedQuery(name = User.UPDATE_USER, query = ""),
		@NamedQuery(name = User.FIND_BY_USERNAME, query = "SELECT u FROM User u WHERE u.username = :username"),
		@NamedQuery(name = User.CHECK_PASSWORD, query = "") })

@Entity
@Table(name = "User")
public class User {

	public static final String SAVE_USER = "User.saveUser";
	public static final String SAVE_USERS = "User.saveUsers";
	public static final String GET_USERS = "User.getUsers";
	public static final String UPDATE_USER = "User.updateUser";
	public static final String FIND_BY_USERNAME = "User.findByUsername";
	public static final String CHECK_PASSWORD = "User.checkPassword";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "title", length = 6, nullable = false)
	private String title;

	@Column(name = "username", length = 30, nullable = false)
	@Size(min = 5, max = 45, message = "Username has to be between 5 and 45 in length.")
	private String username;

	@Column(name = "password", length = 256, nullable = false)
	@Size(min = 5, max = 45, message = "Password has to be between 5 and 45 in length.")
	private String password;

	@Column(name = "firstname", length = 50, nullable = false)
	@Size(min = 1, max = 45, message = "Firstname has to be between 1 and 45 in length.")
	private String firstname;

	@Column(name = "surname", length = 50, nullable = false)
	@Size(min = 1, max = 45, message = "Surname has to be between 1 and 45 in length.")
	private String surname;

	@Column(name = "date_of_birth", nullable = false)
	private Date dateOfBirth;

	@MapsId
	@JoinColumn(name = "")
	@Column(name = "user_level", nullable = false)
	private UserLevel userLevel;

	@Email(message = "Must be a valid email address.")
	@Column(name = "email_address", nullable = false)
	private String emailAddress;

	private List<Address> addresses;
	private PaymentDetails paymentDetails;

	public User() {
		addresses = new ArrayList<Address>();
	}

	public User(Integer id, String title, String firstname, String surname, Date dateOfbirth, String emailAddress,
			String username, String password, UserLevel userLevel, PaymentDetails bankaccount, Address address) {
		this();
		this.id = id;
		this.title = title;
		this.firstname = firstname;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.dateOfBirth = dateOfbirth;
		this.emailAddress = emailAddress;
		this.userLevel = userLevel;
		this.paymentDetails = bankaccount;
		this.addresses.add(address);
	}

	public Integer getId() {
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

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date age) {
		this.dateOfBirth = age;
	}

	public UserLevel getUserLevel() {
		return userLevel;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void addAddress(Address address) {
		this.addresses.add(address);
	}
}
