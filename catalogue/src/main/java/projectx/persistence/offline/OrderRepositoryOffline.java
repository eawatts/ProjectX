package projectx.persistence.offline;

import java.util.List;

import javax.inject.Inject;

import projectx.persistence.entities.Order;
import projectx.persistence.repositories.interfaces.OrderRepository;

public class OrderRepositoryOffline {
	
	@Inject
	private InitialData db;

<<<<<<< HEAD
<<<<<<< HEAD
	public void persistOrder(Order order) {
		db.addUser(user);
=======
	@Override
	public void persistOrder(Order order) {
		db.addOrder(order);
>>>>>>> catalogue
=======
	public void persistOrder(Order order) {
		db.addUser(user);
>>>>>>> a4d9d31e4056cc67be05e8d750d55499280e3f53
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
<<<<<<< HEAD
<<<<<<< HEAD
	public boolean checkPassword(String username, String password) {
		return db.checkPassword(username, password);
	}
}
=======
	public Order findByOrderType(String orderType) {
		// TODO Auto-generated method stub
		return null;
	}
}
>>>>>>> catalogue
=======
	public boolean checkPassword(String username, String password) {
		return db.checkPassword(username, password);
	}
}
>>>>>>> a4d9d31e4056cc67be05e8d750d55499280e3f53
