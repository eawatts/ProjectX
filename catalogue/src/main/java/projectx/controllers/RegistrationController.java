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

@Named("registration")
@RequestScoped
public class RegistrationController {
	
		@Inject
		private RegistrationService registrationService;
		
		@PostConstruct
		private void initialiseProperties() {
			this.user = new User();
			this.address = new Address();
			this.paymentDetails = new PaymentDetails();
		}
		
		private User user;
		private Address address;
		private PaymentDetails paymentDetails;
		private String error = "";
		
		public String registerUser(){
			user.setDateOfBirth(new Date(456263)); // Leave this for now	
			
			registrationService.registerUser(user, address, paymentDetails);
			return "catalogue_index";
		}
		
		// GETTERS / SETTERS
		
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