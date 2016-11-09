package projectx.persistence.webentities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.Supplier;
import projectx.persistence.util.OrderState;
import projectx.services.PurchaseOrderService;

public class ProductsOrderedForPurchaseOrders {
	
	//private List<PurchaseOrder> purchaseOrder;
	private Integer id;
	private Supplier supplier;
	private boolean approved;
	private Date approvalDate;
	private OrderState status;
	private List<ProductsOrdered> products;
	
	
	@Inject
	PurchaseOrderService opc;
	
	public ProductsOrderedForPurchaseOrders(Integer id, Supplier supplier, boolean approved, Date approvalDate, OrderState status, ArrayList<ProductsOrdered> products){
		this.id = id;
		this.supplier = supplier;
		this.approved = approved;
		this.approvalDate = approvalDate;
		this.status = status;
		this.products = products;
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

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
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

	public void setStatus(OrderState status) {
		this.status = status;
	}

	public List<ProductsOrdered> getProducts() {
		return products;
	}

	public void setProducts(List<ProductsOrdered> products) {
		this.products = products;
	}
}
