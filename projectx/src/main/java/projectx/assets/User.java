package projectx.assets;

public class User {
	
	private String username;
	private String password;
	private String firstname;
	private String surname;
	private UserLevel userLevel;
	private String emailAddress;
	
	public User() {}
	
	public User(UserLevel userLevel) {
		this.userLevel = userLevel;
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
