package projectx.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.repositories.interfaces.LoginRepository;

@Stateless
public class LoginService {

	@Inject
	private LoginRepository loginrepository;
	
	
	public User login(String user, String pass){
		return loginrepository.login(user, pass);
	}
	
	
}
