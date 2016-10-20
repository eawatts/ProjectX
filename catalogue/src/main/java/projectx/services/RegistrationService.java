package projectx.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.repositories.interfaces.UserRepository;

@Stateless
public class RegistrationService {
	@Inject
	private AddressService addressService;
	@Inject
	private BankAccountService accountService;
	@Inject
	private UserService userService;
	@Inject
	private UserRepository userRepository;
	
	public void createNewUser(String title, String email, String password, String firstName, String lastName, String age, String bio, String housenumber, String street, String town, String postcode, String banknumber, String sortcode) {
		userRepository.persistUser(userService.createNewUser(title, email, password, firstName, lastName, age, bio, accountService.createNewBankAccout(banknumber, sortcode), addressService.createNewAddress(housenumber, street, town, postcode)));
	}
}