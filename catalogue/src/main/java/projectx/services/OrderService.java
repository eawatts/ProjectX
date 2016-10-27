package projectx.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Order;
import projectx.persistence.repositories.interfaces.OrderRepository;

@Stateless
public class OrderService {
	
	@Inject
	private OrderRepository orderRepository;

	public void completeOrder(Order order) {
		orderRepository.persistOrder(order);
	}
	
	public List<Order> getOrdersForUser(int userId) {
		return orderRepository.getOrdersForUser(userId);
	}
}