package projectx.controllers;

import java.sql.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Address;
import projectx.persistence.entities.PaymentDetails;
import projectx.persistence.entities.User;
import projectx.services.RegistrationService;

/**
 * Used to manage the User Registration process. Accessed via 'registration'.
 */
@Named("registration")
@RequestScoped
public class RegistrationController {
	
		@Inject
		private RegistrationService registrationService;
		
		@PostConstruct // To prevent any NullPointerExceptions, as the properties have to be instantiated.
		private void initialiseProperties() {
			this.user = new User();
			this.address = new Address();
			this.paymentDetails = new PaymentDetails();
		}
		
		private User user;
		private Address address;
		private PaymentDetails paymentDetails;
		private String error = ""; // If a custom error occurs, this will be displayed to the User, if not null.
		
		/**
		 * Will attempt to Register a new User.
		 * @return a redirect to the Index page.
		 */
		public String registerUser(){
			user.setDateOfBirth(new Date(456263)); // This is a temporary fix as we do not have a DatePicker on the site.
			
			registrationService.registerUser(user, address, paymentDetails);
			return "catalogue_index";
		}
				
		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public PaymentDetails getPaymentDetails() {
			return paymentDetails;
		}

		public void setPaymentDetails(PaymentDetails paymentDetails) {
			this.paymentDetails = paymentDetails;
		}
		
		public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}
}