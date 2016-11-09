package projectx.persistence.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import projectx.persistence.util.OrderState;
import projectx.persistence.util.OrderType;

@Entity
@Table(name = "order")

@NamedQueries({
/*		@NamedQuery(name = "Order.findByOrderType", query = "Select o FROM Order o  WHERE o.orderType= :orderType"),
		@NamedQuery(name = "Order.findByUser", query = "Select o FROM Order o Join user u WHERE o.user= :user  "),
		@NamedQuery(name = "Order.findByOrderDate", query = "Select o deliveryDate FROM Order o WHERE o.orderDate= :orderDate"),*/
})

public class Order {

	public static final String findByOrderDate = "Order.findByOrderDate";
	public static final String findByUser = "Order.findByUser";
	public static final String findByOrderType = "Order.findByOrderType";

	@Id
	@GeneratedValue()
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne
	@NotNull
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@NotNull
	@JoinColumn(name = "order_type", nullable = false)
	private OrderType orderType;

	@NotNull
	@JoinColumn(name = "order_state", nullable = false)
	private OrderState orderState;

	@Column(name = "notes")
	@Size(max = 100)
	private String notes;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "delivery_date")
	private Date deliveryDate;

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
}
