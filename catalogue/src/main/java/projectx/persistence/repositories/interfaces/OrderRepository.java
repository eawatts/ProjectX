package projectx.persistence.repositories.interfaces;

import java.util.List;

import projectx.persistence.entities.Order;

import java.sql.Date;

public interface OrderRepository {
	public void persistOrder (Order order);
	public void persistOrders (List<Order> orders);
	
	public List<Order> getOrders();
	public List<Order> getOrdersForUser(int userId);
	
	public Order findByOrderType (String orderType);
	public Order findByUser (int userId);
	public Order findByOrderDate (Date orderDate);
}
