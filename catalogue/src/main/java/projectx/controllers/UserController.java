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
		userService.setTitle(title);
		userService.setEmail(email);
		userService.setPassword(password);
		userService.setFirstName(firstName);
		userService.setLastName(lastName);
		userService.setAge(age);
		userService.setBio(bio);
		addressService.setHouseNumber(housenumber);
		addressService.setStreetName(street);
		addressService.setTownName(town);
		addressService.setPostCode(postcode);
		bankService.setBankNumber(banknumber);
		bankService.setSortCode(sortcode);
	}
	
}