package projectx.persistence.repositories.offline;

import java.sql.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.persistence.entities.Order;
import projectx.persistence.repositories.OrderRepository;

/**
 * 
 * @author James
 *
 */
@Stateless
@Default
public class OrderRepositoryOffline implements OrderRepository {

	@Override
	public void persistOrder(Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void persistOrders(List<Order> order) {
		// TODO Auto-generated method stub

	}

	@Override
	public Order findByOrderType(String orderType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findByUser(String orderType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findByOrderDate(Date orderDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
