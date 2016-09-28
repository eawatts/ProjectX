package projectx.assets;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="order")

public class Order {
	@Id @GeneratedValue
	@Column(name="id")
	private int orderID;
	
	
	@ManyToOne
	@JoinColumn (name="user_id")
	private int userID;
	
	@ManyToOne
	@JoinColumn(name="order_type_id")
	private int orderTypeID;
	
	@ManyToOne
	@JoinColumn (name="order_state_id")
	private int orderStateID;
	
	@Column(name="notes")
	private String notes;
	
	@Column(name="order_date")
	private Date orderDate;
	
	@Column(name="delivery_date")
	private Date deliveryDate;
	
	//set and get Order Id
	public int getOrderID() {
		return orderID;
	}
	
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	//set and get notes
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	//set and get Order Date
	public Date getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	//set and get Delivery Date
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	//set and get User ID
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	//set and get Order Type ID
	public int getOrderTypeID() {
		return orderTypeID;
	}

	public void setOrderTypeID(int orderTypeID) {
		this.orderTypeID = orderTypeID;
	}

	//set and get Order State Id
	public int getOrderStateID() {
		return orderStateID;
	}

	public void setOrderStateID(int orderStateID) {
		this.orderStateID = orderStateID;
	}
	
	
	
	
	
}
