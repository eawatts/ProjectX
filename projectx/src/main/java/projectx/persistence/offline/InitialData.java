package projectx.persistence.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

import projectx.persistence.entities.User;

@Singleton
public class InitialData {
	
	private List<User> users;

	public InitialData() {
		populateData();
	}
	
	private void populateData() {
		users = new ArrayList<User>();
		users.add(new User());
	}
	
	public List<User> getUsers(){
		return users;
	}
	
	public void addUser(User user){
		this.users.add(user);
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
