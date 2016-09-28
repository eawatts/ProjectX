package projectx.assets;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "order")

public class Order {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int orderID;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private int userID;

	@ManyToOne
	@JoinColumn(name = "order_type_id")
	private OrderType orderType;

	@ManyToOne
	@JoinColumn(name = "order_state_id")
	private OrderState orderState;

	@Column(name = "notes")
	private String notes;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "delivery_date")
	private Date deliveryDate;

	// set and get Order Id
	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	// set and get notes
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	// set and get Order Date
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	// set and get Delivery Date
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	// get and set foreign keys
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
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
