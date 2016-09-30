package projectx.repository_interfaces;

import java.util.List;
import java.sql.Date;


import projectx.entities.Order;

public interface OrderRepository {
	public void persistOrder (Order o);
	public void persistOrders (List<Order> o);
	
	public Order findByOrderType (String orderType);
	public Order findByUser (String orderType);
	public Order findByOrderDate (Date orderDate);
}
