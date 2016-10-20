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
	
	@Inject
	private UserRepository userRepository;
	
	public void setTitle(String title){
		
	}
	
	public void setEmail(String email){
		
	}
	
	public void setPassword(String password){
		char[] pass = password.toCharArray();
		byte[] hashedpassword = Hash.hashPassword(pass,Hash.getNextSalt(), 2, 256);
		
		
	}
	
	public void setFirstName(String firstname){
		
	}
	
	public void setLastName(String lastname){
		
	}
	
	public void setAge(String age){
		
	}
	public void setBio(String bio){
		
	}

	public User createNewUser(String title, String email, String password, String firstName, String lastName,
			String age, String bio, BankAccount createNewBankAccout, Address createNewAddress) {
		// TODO Auto-generated method stub
		return null;
	}
}