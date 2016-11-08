package projectx.persistence.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import projectx.persistence.util.OrderState;

@NamedQueries({
	
		@NamedQuery(name = PurchaseOrder.SEARCH_PO, query = "SELECT * FROM supplier WHERE name LIKE '%:param%'")
		/*
		 * @NamedQuery(name = PurchaseOrder.INSERT_PURCHASEORDER, query =
		 * "INSERT INTO purchaseOrder p (id, supplier,approved,approvalDate,satus,products) VALUES(:id, :supplier, :approved, :approvalDate, :satus, :products) "
		 * ),
		 * 
		 * @NamedQuery(name = PurchaseOrder.FIND_ALL, query =
		 * "SELECT * FROM purchaseOrder p "),
		 * 
		 * @NamedQuery(name = PurchaseOrder.FIND_BY_APPROVALDATE, query =
		 * "SELECT * from purchaseOrder p where p.approvalDate =:approvalDate"),
		 * 
		 * @NamedQuery(name = PurchaseOrder.FIND_BY_APPROVED, query =
		 * "SELECT * from purchaseOrder p where p.approved =:approved"),
		 * 
		 * @NamedQuery(name = PurchaseOrder.FIND_BY_STATUS, query =
		 * "SELECT * from purchaseOrder p where p.status =:status"),
		 * 
		 * @NamedQuery(name = PurchaseOrder.UPDATE_PURCHASEORDER, query =
		 * "UPDATE purchaseOrder p SET p.supplier=:newSupplier, p.approved=:newApproved, p.approvalDate=:newApprovalDate, p.status=:newStatus, p.productsOrdered=:newProductsOrdered WHERE p.id =:id"
		 * )
		 */
})

@Entity
@Table(name = "purchase_order")
public class PurchaseOrder {
	public static final String INSERT_PURCHASEORDER = "PurchaseOrder.savePurchaseOrder";
	public static final String FIND_ALL = "PurchaseOrder.findAll";
	public static final String FIND_BY_APPROVALDATE = "PurchaseOrder.findByAprovalDate";
	public static final String FIND_BY_APPROVED = "PurchaseOrder.findByAproved";
	public static final String FIND_BY_STATUS = "PurchaseOrder.status";
	public static final String UPDATE_PURCHASEORDER = "PurchaseOrder.updatePurchaseOrder";
	public static final String SEARCH_PO = "PurchaseOrder.searchPO";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier", nullable = false, updatable = false)
	private Supplier supplier;

	@Column(name = "approved", length = 10, nullable = false)
	private boolean approved;

	@Column(name = "approval_date", length = 10, nullable = false)
	private Date approvalDate;

	@Column(name = "status", length = 10, nullable = false)
	private OrderState status;

	private ArrayList<ProductsOrdered> productsOrdered;

	public PurchaseOrder() {
	}

	public PurchaseOrder(Integer id, Supplier supplier, boolean approved, Date approvalDate, OrderState status,
			ArrayList<ProductsOrdered> productsOrdered) {
		super();
		this.id = id;
		this.supplier = supplier;
		this.approved = approved;
		this.approvalDate = approvalDate;
		this.status = status;
		this.productsOrdered = productsOrdered;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public void setProducts(ArrayList<ProductsOrdered> purchasedProducts) {
		this.productsOrdered = purchasedProducts;
	}

	public void addOrderedProducts(ProductsOrdered orderedProducts) {
		if (productsOrdered == null) {
			productsOrdered = new ArrayList<>();
		}
		productsOrdered.add(orderedProducts);
		if (orderedProducts.getPurchaseOrder() != this) {
			orderedProducts.setPurchaseOrder(this);
		}
	}
}