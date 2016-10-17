package projectx.persistence.entities;

import java.util.List;

import javax.persistence.*;

@NamedQueries (
		{
			@NamedQuery (name = PurchaseOrder.SAVE_PURCHASEORDER, query = ""),
			@NamedQuery (name = PurchaseOrder.SAVE_PURCHASEORDERS, query = ""),
			@NamedQuery (name = PurchaseOrder.GET_PURCHASEORDER, query = ""),
			@NamedQuery (name = PurchaseOrder.GET_PURCHASEORDERS, query = ""),
			@NamedQuery (name = PurchaseOrder.UPDATE_PURCHASEORDER, query = ""),
		}
)

@Entity
@Table(name = "PurchaseOrder")
public class PurchaseOrder{
	public static final String SAVE_PURCHASEORDER = "PurchaseOrder.savePurchaseOrder";
	public static final String SAVE_PURCHASEORDERS = "PurchaseOrder.savePurchaseOrders";
	public static final String GET_PURCHASEORDER = "PurchaseOrder.getPurchaseOrder";
	public static final String GET_PURCHASEORDERS = "PurchaseOrder.getPurchaseOrders";
	public static final String UPDATE_PURCHASEORDER = "PurchaseOrder.updatePurchaseOrder";
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "supplierID", length = 10, nullable = false)
	private Supplier supplier;
	
	@Column(name = "approval", length = 10, nullable = false)
	private boolean approval;
	
	@Column(name = "approvalDate", length = 10, nullable = false)
	private String approvalDate;
	
	@Column(name = "status", length = 10, nullable = false)
	private String status;
	
	@Column(name = "products", length = 10, nullable = false)
	private List<Product> products;

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
		return approval;
	}

	public void setApproval(boolean approval) {
		this.approval = approval;
	}

	public String getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}