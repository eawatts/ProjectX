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
	
	/**
	 * Will register/create a new User, requires a full User, including Address and PaymentDetails.
	 * @param user the User to add.
	 * @param address the Address to add to the User.
	 * @param paymentDetails the PaymentDetails to add to the User.
	 */
	public void registerUser(User user, Address address, PaymentDetails paymentDetails){
		user.addAddress(address);
		user.setPaymentDetails(paymentDetails);
		userRepository.persistUser(user);
	}
}