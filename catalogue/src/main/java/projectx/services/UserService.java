package projectx.services;

import java.sql.Date;

import javax.ejb.Stateless;

import projectx.persistence.entities.Address;
import projectx.persistence.entities.BankAccount;
import projectx.persistence.entities.User;
import projectx.persistence.entities.UserLevel;

@Stateless
public class UserService{
	
	public byte[] formatPassword(String password){
		char[] pass = password.toCharArray();
		byte[] hashedpassword = Hash.hashPassword(pass,Hash.getNextSalt(), 2, 256);
		return hashedpassword;
	}
	
	public Date formatAge(String age){
		// TODO: Need to actually get the DOB
		return new Date(565461234);
	}

	public User createNewUser(String title, String email, String password, String firstName, String lastName,
			String age, String bio, BankAccount bankAccount, Address address) {
		return new User(null, title, firstName, lastName, formatAge(age), "email", "username", formatPassword(password), UserLevel.CUSTOMER, bankAccount, address);
	}
}