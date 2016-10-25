package projectx.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Address;
import projectx.persistence.entities.PaymentDetails;
import projectx.persistence.entities.User;
import projectx.persistence.repositories.interfaces.UserRepository;

@Stateless
public class RegistrationService {
	
	@Inject
	private UserRepository userRepository;
	
	public void registerUser(User user, Address address, PaymentDetails paymentDetails){
		
		// TODO: Check is any are null.
		user.addAddress(address);
		user.setPaymentDetails(paymentDetails);
		userRepository.persistUser(user);
	}
}