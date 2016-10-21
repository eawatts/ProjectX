package projectx.persistence.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import projectx.persistence.util.OrderState;

@NamedQueries({
			@NamedQuery (name = PurchaseOrder.INSERT_PURCHASEORDER, query = "INSERT INTO purchaseOrder p (id, supplier,approved,approvalDate,satus,products) VALUES(:id, :supplier, :approved, :approvalDate, :satus, :products) "),
			@NamedQuery (name = PurchaseOrder.FIND_ALL, query = "SELECT * FROM purchaseOrder p "),
			@NamedQuery (name = PurchaseOrder.FIND_BY_APPROVALDATE, query = "SELECT * from purchaseOrder p where p.approvalDate =:approvalDate"),
			@NamedQuery (name = PurchaseOrder.FIND_BY_APPROVED, query = "SELECT * from purchaseOrder p where p.approved =:approved"),
			@NamedQuery (name = PurchaseOrder.FIND_BY_STATUS, query = "SELECT * from purchaseOrder p where p.status =:status"),
			@NamedQuery (name = PurchaseOrder.UPDATE_PURCHASEORDER, query = "UPDATE purchaseOrder p SET p.supplier=:newSupplier, p.approved=:newApproved, p.approvalDate=:newApprovalDate, p.status=:newStatus, p.productsOrdered=:newProductsOrdered WHERE p.id =:id"),
})

@Entity
@Table(name = "PurchaseOrder")
public class PurchaseOrder{
	public static final String INSERT_PURCHASEORDER = "PurchaseOrder.savePurchaseOrder";
	public static final String FIND_ALL = "PurchaseOrder.findAll";
	public static final String FIND_BY_APPROVALDATE="PurchaseOrder.findByAprovalDate";
	public static final String FIND_BY_APPROVED="PurchaseOrder.findByAproved";
	public static final String FIND_BY_STATUS="PurchaseOrder.status";
	public static final String UPDATE_PURCHASEORDER = "PurchaseOrder.updatePurchaseOrder";
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn (name = "supplierid", nullable=false, updatable=false)
	private  Supplier supplier;
	
	@Column(name = "approved", length = 10, nullable = false)
	private boolean approved;
	
	@Column(name = "approvalDate", length = 10, nullable = false)
	private Date approvalDate;
	
	@Column(name = "status", length = 10, nullable = false)
	private OrderState status;
	
	@OneToMany (mappedBy="PurchaseOrder")
	private  List<ProductsOrdered> productsOrdered;
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param nSupplier
	 * @param nApproved
	 * @param nApprovalDate
	 * @param nStatus
	 * @param nProductsOrdered
	 */
	

	public PurchaseOrder(int id, Supplier nSupplier, boolean nApproved, Date nApprovalDate, OrderState nStatus,List<ProductsOrdered> nproductsOrdered) {
		setId(id);
		setSupplier(nSupplier);
		setApprovalDate(nApprovalDate);
		setStatus(nStatus);
		setProducts(nproductsOrdered);
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public boolean isApproval() {
		return approved;
	}

	public void setApproval(boolean approval) {
		this.approved = approval;
	}

	public Date getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}
	public OrderState getStatus() {
		return status;
	}

	public void setStatus(OrderState nStatus) {
		this.status = nStatus;
	}

	public List<ProductsOrdered> getPurchasedProducts() {
		return productsOrdered;
	}

	public void setProducts(List<ProductsOrdered> purchasedProducts) {
		this.productsOrdered = purchasedProducts;
	}



	public void addOrderedProducts (ProductsOrdered orderedProducts) {
		if(productsOrdered==null){
			productsOrdered = new ArrayList<>();
		}
		productsOrdered.add(orderedProducts);
		if(orderedProducts.getPurchaseOrderId()!= this)
			orderedProducts.setPurchaseOrderId(this);
		
	}

	
	
}