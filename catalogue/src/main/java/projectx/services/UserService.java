package projectx.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

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
				
	}
	
	public void setFirstName(String firstname){
		
	}
	
	public void setLastName(String lastname){
		
	}
	
	public void setAge(int age){
		
	}
	public void setBio(String bio){
		
	}
}