package projectx.persistence.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.repositories.LoginRepository;

@Stateless
public class LoginService {
	
	@Inject
	private LoginRepository loginrepository;
	
	/**
	 * Will forward on a Login request to the LoginRepository.
	 * @param username the User's username.
	 * @param password the User's password.
	 * @return a User if the Login attempt was successful, null if not.
	 */
	public User login(String username, String password){
		return loginrepository.login(username, password);
	}
}
