package projectx.persistence.offline;

import java.sql.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.Order;
import projectx.persistence.offline.database.OfflineDB;
import projectx.persistence.repositories.interfaces.OrderRepository;

@Stateless
@Default
public class OrderRepositoryOffline implements OrderRepository{

	@Inject
	private OfflineDB db;

	@Override
	public void persistOrder(Order order) {
		db.addOrder(order);
	}
	
	@Override
	public List<Order> getOrders() {
		return db.getOrders();
	}
	
	@Override
	public List<Order> getOrdersForUser(int userId) {
		return db.getOrdersForUser(userId);
	}
	
	// UNIMPLEMENTED
	
	@Override
	public Order findByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void persistOrders(List<Order> orders) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public Order findByOrderDate(Date orderDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findByOrderType(String orderType) {
		// TODO Auto-generated method stub
		return null;
	}
}