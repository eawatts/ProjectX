package projectx.persistence.entities;

import java.sql.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "order")


@NamedQueries ({
	@NamedQuery(name ="Order.findByOrderType" , query = "Select o FROM Order o  WHERE o.orderType= :orderType"),
	@NamedQuery(name="Order.findByUser", query ="Select o FROM Order o Join user u WHERE o.user= :user  "),
	@NamedQuery(name="Order.findByOrderDate", query ="Select o deliveryDate FROM Order o WHERE o.orderDate= :orderDate"),

})






public class Order {

	public static final String findByOrderDate="Order.findByOrderDate";
	public static final String findByUser="Order.findByUser";
	public static final String findByOrderType="Order.findByOrderType";
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable=false)
	@NotNull
	private int orderID;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable=false)
	@NotNull
	private User user;

	@ManyToOne
	@JoinColumn(name = "order_type_id", nullable=false)
	@NotNull
	private OrderType orderType;

	@ManyToOne
	@JoinColumn(name = "order_state_id", nullable=false)
	@NotNull
	private OrderState orderState;

	@Column(name = "notes")
	@Size (max=100)
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
	public User getUserID() {
		return user;
	}

	public void setUserID(User user) {
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
