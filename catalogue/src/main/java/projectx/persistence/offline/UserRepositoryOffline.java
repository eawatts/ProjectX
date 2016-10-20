package projectx.persistence.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.offline.database.OfflineDB;
import projectx.persistence.repositories.interfaces.UserRepository;

@Stateless
@Default
public class UserRepositoryOffline implements UserRepository {
	
	@Inject
	private OfflineDB db;
	
	public UserRepositoryOffline(){}

	@Override
	public void persistUser(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public void persistUsers(List<User> users) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<User> getUsers() {
		return db.getUsers();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkPassword(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
