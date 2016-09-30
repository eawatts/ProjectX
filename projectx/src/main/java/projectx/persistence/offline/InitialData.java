package projectx.persistence.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

import projectx.persistence.entities.PaymentDetails;
import projectx.persistence.entities.User;
import projectx.persistence.entities.UserLevel;

@Singleton
public class InitialData {
	
	private List<User> users;
	private ArrayList<PaymentDetails> paymentDetails = new ArrayList<PaymentDetails>(); 

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
	}
	
	// USERS
	public List<User> getUsers(){
		return users;
	}
	
	public void addUser(User user){
		this.users.add(user);
	}
	
	public void updateUser(User user){
		//TODO: Implement
	}
	
	public void saveUsers(List<User> users) {
		for(User user : this.users){
			this.users.add(user);
		}
	}
	
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean checkPassword(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
