package projectx.persistence.repositories.hibernate;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import projectx.persistence.entities.User;
import projectx.persistence.repositories.LoginRepository;
import projectx.persistence.repositories.UserRepository;
import projectx.persistence.repositories.hibernate.database.HibernateDatabase;

@Stateless
@Alternative // This can be used by changing beans.xml

public class UserRepositoryHibernate implements UserRepository {

	@Inject
	private HibernateDatabase db;

	@Override
	public void persistUser(User user) {
		db.persistUser(user);
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
		return db.findByUsername(username);
	}

	@Override
	public boolean checkPassword(String username, String password) {
		return db.checkPassword(username, password);
	}

	@Override
	public String getId(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
