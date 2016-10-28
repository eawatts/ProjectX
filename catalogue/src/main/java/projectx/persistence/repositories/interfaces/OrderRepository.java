package projectx.persistence.repositories.interfaces;

import java.util.List;

import projectx.persistence.entities.Order;

import java.sql.Date;

public interface OrderRepository {
	public void persistOrder (Order order);
	public void persistOrders (List<Order> order);
	
	public Order findByOrderType (String orderType);
	public Order findByUser (String orderType);
	public Order findByOrderDate (Date orderDate);
}
