package projectx.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Order;
import projectx.persistence.entities.OrderState;
import projectx.persistence.entities.OrderType;
import projectx.persistence.webentities.Basket;
import projectx.persistence.webentities.BasketProduct;
import projectx.persistence.webentities.CurrentSession;
import projectx.services.OrderService;

/**
 * Used to manage the Order processes. Accessed via 'orders'.
 */
@Named("orders")
@RequestScoped
public class OrderController {

	@Inject
	private CurrentSession currentSession;
	
	@Inject
	private OrderService orderService;
	
	public List<Order> getOrdersForUser(int userId) {	
		return orderService.getOrdersForUser(userId);
	}
	
	public String completeBasketOrder() {

		long todayInMilliseconds = Calendar.getInstance().getTimeInMillis();
		Order order = new Order(null, currentSession.getUser(), OrderType.CUSTOMER, OrderState.CREATED, "", new Date(todayInMilliseconds),
				new Date(todayInMilliseconds + (Basket.DAYS_FOR_DELIVERY * Basket.DAY_IN_MILLISECONDS)), currentSession.getBasket().getBasketContents());
		
		orderService.completeOrder(order);		
		
		currentSession.getBasket().setBasketContents(new ArrayList<BasketProduct>());
		return "checkout_complete";
	}
}