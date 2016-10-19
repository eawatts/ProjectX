package projectx.controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.services.AddressService;
import projectx.services.BankAccountService;
import projectx.services.UserService;

@Named("products")
@RequestScoped
public class UserController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UserService userService;
	private AddressService addressService;
	private BankAccountService bankService;
	
	private String title;
	private String email;
	private String firstName;
	private String lastName;
	private int age;
	private String bio;
	private int housenumber;
	private String street;
	private String town;
	private char[] postcode;
	private int[] banknumber;
	private int[] banksort;


	public void submit(){
		userService.setTitle(title);
		userService.setEmail(email);
		userService.setFirstName(firstName);
		userService.setLastName(lastName);
		userService.setAge(age);
		userService.setBio(bio);
		//addressService.housenumber=housenumber
	}
	
}