package projectx.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.repositories.interfaces.UserRepository;

@Stateless
public class UserService{
	
	@Inject
	private UserRepository userRepository;
	
	
}