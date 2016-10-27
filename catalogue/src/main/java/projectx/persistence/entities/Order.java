package projectx.persistence.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

import projectx.persistence.webentities.BasketProduct;

@Entity
@Table(name = "Order")

@NamedQueries({
		@NamedQuery(name = "Order.findByOrderType", query = "Select o FROM Order o  WHERE o.orderType= :orderType"),
		@NamedQuery(name = "Order.findByUser", query = "Select o FROM Order o Join user u WHERE o.user= :user  "),
		@NamedQuery(name = "Order.findByOrderDate", query = "Select o deliveryDate FROM Order o WHERE o.orderDate= :orderDate"), })

public class Order {

	public static final String findByOrderDate = "Order.findByOrderDate";
	public static final String findByUser = "Order.findByUser";
	public static final String findByOrderType = "Order.findByOrderType";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	@NotNull
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	@NotNull
	private User user;

	@ManyToOne
	@JoinColumn(name = "order_type_id", nullable = false)
	@NotNull
	private OrderType orderType;

	@ManyToOne
	@JoinColumn(name = "order_state_id", nullable = false)
	@NotNull
	private OrderState orderState;

	@Column(name = "notes")
	@Size(max = 100)
	private String notes;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "delivery_date")
	private Date deliveryDate;
	
	private List<BasketProduct> products;
	
	public Order(Integer id, User user, OrderType orderType, OrderState orderState, String notes, Date orderDate,
			Date deliveryDate, List<BasketProduct> products) {
		this.id = id;
		this.user = user;
		this.orderType = orderType;
		this.orderState = orderState;
		this.notes = notes;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.setProducts(products);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public OrderState getOrderState() {
		return orderState;
	}

	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}

	public List<BasketProduct> getProducts() {
		return products;
	}

	public void setProducts(List<BasketProduct> products) {
		this.products = products;
	}
}
