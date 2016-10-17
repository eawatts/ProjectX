package projectx.persistence.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.repositories.interfaces.UserRepository;


@Stateless
public class LoginService {
	@Inject UserRepository userRepo;
	
	public boolean validateDetails(String username, String pass){
		User user = userRepo.checkPassword(username.toLowerCase(), pass);
		if(user !=null)
			return true;
		return false;		
		}
	public long getUserID(String username){
		return userRepo.getId(username.toLowerCase());
	}

}
