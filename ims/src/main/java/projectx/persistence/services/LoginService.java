package projectx.persistence.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.repositories.interfaces.UserRepository;


@Stateless
public class LoginService {
	@Inject UserRepository userRepo;
	
	public boolean validateDetails(String user, String pass){
		User user =userRepo.checkPassword(user.toLowerCase(), pass);
		if(user !=null)
			return true;
		else return false;		
		}
	public long getUserID(String username){
		return userRepo. 
	}

}
