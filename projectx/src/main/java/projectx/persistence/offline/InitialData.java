package projectx.persistence.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

import projectx.persistence.entities.PaymentDetails;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.User;
import projectx.persistence.entities.UserLevel;

@Singleton
public class InitialData {
	
	private List<User> users;
	private ArrayList<PaymentDetails> paymentDetails = new ArrayList<PaymentDetails>(); 
	private List<Product> products;
	
	public InitialData() {
		populateData();
		paymentDetails.add(new PaymentDetails(1,new User(1,"hello","password","firstname","lastname",UserLevel.CUSTOMER,"username@email.com"),"89012345","123456"));
	}
	
	/**
	 * Will populate the offline data, with valid data and expose methods to access it.
	 */
	private void populateData() {
		users = new ArrayList<User>();
		users.add(new User());
		products = new ArrayList<Product>();
		products.add(new Product());
	}
	
	// USERS
	
	/**
	 * Get the offline Users.
	 * @return an ArrayList of Users.
	 */
	public List<User> getUsers(){
		return new ArrayList<User>(this.users);
	}
	
	/**
	 * Add a User to the collection.
	 * @param user the User to add.
	 */
	public void persistUser(User user){
		this.users.add(user);
	}
	
	/**
	 * Update the User in the collection.
	 * @param user the User to update.
	 */
	public void updateUser(User user){
		int indexOfUser = this.users.indexOf(user);
		if (indexOfUser != -1){
			this.users.remove(indexOfUser); // Easier just to remove them, then individually update them.
		}
		this.users.add(user);		
	}
	
	/**
	 * Add multiple Users to the collection.
	 * @param users the List of Users to add.
	 */
	public void persistUsers(List<User> users) {
		for(User user : this.users){
			this.users.add(user);
		}
	}
	
	/**
	 * Find a specific User by their username.
	 * @param username the username to query.
	 * @return the User if found, null if not.
	 */
	public User findByUsername(String username) {
		for (User user : this.users){
			if (user.getUsername().equals(username)){
				return user;
			}
		}
		return null;
	}

	/**
	 * See if the password matches the User with the username.
	 * @param username the username to find the User.
	 * @param password the password to check against the User's password.
	 * @return boolean value if there is a match.
	 */
	public boolean checkPassword(String username, String password) {
		User matchingUser = null;
		for (User user : this.users){
			if (user.getUsername().equals(username)){
				matchingUser = user;
				break;
			}
		}
		if (matchingUser == null){
			return false;
		}
		return matchingUser.getPassword().equals(password);
	}
}
