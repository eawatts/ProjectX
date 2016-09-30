package projectx.persistence.offline;

import java.util.List;

import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.repositories.interfaces.UserRepository;

public class UserRepositoryOffline implements UserRepository {
	
	@Inject
	private InitialData db;

	@Override
	public void saveUser(User user) {
		db.addUser(user);
	}

	@Override
	public void saveUsers(List<User> users) {
		db.saveUsers(users);
		
	}

	@Override
	public List<User> getUsers() {
		return db.getUsers();
	}

	@Override
	public void updateUser(User user) {
		db.updateUser(user);
	}

	@Override
	public User findByUsername(String username) {
		return db.findByUsername(username);
	}

	@Override
	public boolean checkPassword(String username, String password) {
		return db.checkPassword(username, password);
	}
}
