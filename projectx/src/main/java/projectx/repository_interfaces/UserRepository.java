package projectx.repository_interfaces;

import java.util.List;

import projectx.entities.User;

public interface UserRepository {
	
	public void saveUser(User user);
	public void saveUsers(List<User> users);
	
	public User findByUsername(String username);
	public List<User> getUsers();
	
	public void updateUser(User user);
}
