package projectx.persistence.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.repositories.interfaces.UserRepository;


@Stateless
public class LoginService {
	@Inject UserRepository userRepo;
	
	public boolean validateDetails(String user, String pass){
		User user=userRepo.
	}

}
