package projectx.persistence.offline;

import java.util.List;

import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.repositories.interfaces.UserRepository;

public class UserRepositoryOffline implements UserRepository {
	
	@Inject
	private InitialData db;

	@Override
	public void persistUser(User user) {
		db.persistUser(user);
	}

	@Override
	public void persistUsers(List<User> users) {
		db.persistUsers(users);
		
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

	@Override
	public String getId(String username)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
