package projectx.services;

import java.sql.Date;

import javax.ejb.Stateless;

import projectx.persistence.entities.Address;
import projectx.persistence.entities.PaymentDetails;
import projectx.persistence.entities.User;
import projectx.persistence.entities.UserLevel;

@Deprecated
@Stateless
public class UserService{
	
	@Deprecated
	public User createNewUser(String title, String email, String password, String firstName, String lastName,
			String age, String bio, PaymentDetails paymentDetails, Address address) {
		return new User(null, title, firstName, lastName, new Date(46545646), "email", "username", "password", UserLevel.CUSTOMER, paymentDetails, address);
	}
}