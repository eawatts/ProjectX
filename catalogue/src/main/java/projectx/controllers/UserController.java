package projectx.controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.services.AddressService;
import projectx.services.BankAccountService;
import projectx.services.UserService;

@Named("users")
@RequestScoped
public class UserController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private UserService userService;
	private AddressService addressService;
	private BankAccountService bankService;
	
	private String title;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String age;
	private String bio;
	private String housenumber;
	private String street;
	private String town;
	private String postcode;
	private String banknumber;
	private String sortcode;


	/**
	 * 
	 */
	public void submitUserInfo(){
		userService.createNewUser(title, email, password, firstName, lastName, age, bio, housenumber, street, town, postcode, banknumber, sortcode);
	}


	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public BankAccountService getBankService() {
		return bankService;
	}


	public void setBankService(BankAccountService bankService) {
		this.bankService = bankService;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getBio() {
		return bio;
	}


	public void setBio(String bio) {
		this.bio = bio;
	}


	public String getHousenumber() {
		return housenumber;
	}


	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getTown() {
		return town;
	}


	public void setTown(String town) {
		this.town = town;
	}


	public String getPostcode() {
		return postcode;
	}


	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	public String getBanknumber() {
		return banknumber;
	}


	public void setBanknumber(String banknumber) {
		this.banknumber = banknumber;
	}


	public String getSortcode() {
		return sortcode;
	}


	public void setSortcode(String sortcode) {
		this.sortcode = sortcode;
	}
}