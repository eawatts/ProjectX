package projectx.persistence.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.repositories.UserRepository;


@Stateless
public class LoginService {
	@Inject
	private UserRepository userRepo;
	
	public boolean validateDetails(String username, String pass)
	{

		if(username==null || pass ==null) return false;
		
		if(userRepo.checkPassword(username, pass)) return true;
		else return false;
		
		}
	public String getUserID(String username){
		return userRepo.getId(username.toLowerCase());
	}

}
