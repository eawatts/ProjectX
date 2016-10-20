package projectx.services;

import java.util.regex.Pattern;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Address;
import projectx.persistence.entities.BankAccount;
import projectx.persistence.entities.User;
import projectx.persistence.repositories.interfaces.UserRepository;

@Stateless
public class UserService{
	
	public byte[] formatPassword(String password){
		char[] pass = password.toCharArray();
		byte[] hashedpassword = Hash.hashPassword(pass,Hash.getNextSalt(), 2, 256);
		return hashedpassword;
		
	}
	

	public int formatAge(String age){
		int formatedage = Integer.parseInt(age);
		return formatedage;
	}


	public User createNewUser(String title, String email, String password, String firstName, String lastName,
			String age, String bio, BankAccount bankAccount, Address address) {
		User user = new User(title,email,formatPassword(password), firstName, lastName, bankAccount, address,formatAge(age));
		return user;
	}
}