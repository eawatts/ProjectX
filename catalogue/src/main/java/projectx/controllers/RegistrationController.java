package projectx.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.services.RegistrationService;

@Named("registration")
@RequestScoped
public class RegistrationController {
		@Inject
		private RegistrationService registrationService;
		
		private String title;
		private String email;
		private String password;
		private String firstName;
		private String lastName;
		private String age;
		private String bio;
		private String housenumber;
		private String street;
		private String town;
		private String postcode;
		private String banknumber;
		private String sortcode;


		/**
		 * 
		 */
		public void setUserInfo(){
			registrationService.createNewUser(title, email, password, firstName, lastName, age, bio, housenumber, street, town, postcode, banknumber, sortcode);
		}

		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getAge() {
			return age;
		}


		public void setAge(String age) {
			this.age = age;
		}


		public String getBio() {
			return bio;
		}


		public void setBio(String bio) {
			this.bio = bio;
		}


		public String getHousenumber() {
			return housenumber;
		}


		public void setHousenumber(String housenumber) {
			this.housenumber = housenumber;
		}


		public String getStreet() {
			return street;
		}


		public void setStreet(String street) {
			this.street = street;
		}


		public String getTown() {
			return town;
		}


		public void setTown(String town) {
			this.town = town;
		}


		public String getPostcode() {
			return postcode;
		}


		public void setPostcode(String postcode) {
			this.postcode = postcode;
		}


		public String getBanknumber() {
			return banknumber;
		}


		public void setBanknumber(String banknumber) {
			this.banknumber = banknumber;
		}


		public String getSortcode() {
			return sortcode;
		}


		public void setSortcode(String sortcode) {
			this.sortcode = sortcode;
		}
}