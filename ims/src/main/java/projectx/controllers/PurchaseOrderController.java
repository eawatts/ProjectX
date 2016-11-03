package projectx.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.Supplier;
import projectx.persistence.util.OrderState;
import projectx.persistence.webentities.CurrentSession;
import projectx.persistence.webentities.PurchaseOrderProduct;
import projectx.services.ProductService;
import projectx.services.PurchaseOrderSerivce;
import projectx.services.SupplierService;



@SessionScoped
@Named("purchaseOrders")
public class PurchaseOrderController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject 
	private PurchaseOrderSerivce purchaseOrderService;
	@Inject
	private SearchController searchController;
	@Inject
	CurrentSession current_session;
	@Inject
	private ProductService productService;
	@Inject
	private SupplierService supplierService;
	private int id;
	private Supplier supplier;
	private boolean approved;
	private Date approvalDate;
	private OrderState status;
	private List<ProductsOrdered> productsOrdered;
	private int productid;
	private int supplierid;
	private int quantity;


	public List getPurchaseOrderList(){	
		if(searchController.getSearchResults() != null && searchController.getSearchResults().size() > 0 && searchController.getSearchResults().get(0) instanceof PurchaseOrder)
		{
			return searchController.getSearchResults();
		}
		else
		{
			return purchaseOrderService.getPurchaseOrderList();
		}
	}
	public PurchaseOrder findPOById(int id){
		return purchaseOrderService.findPOById(id);
	} 
	
	public void viewPO(int id){
		this.id=id;
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


	public List<ProductsOrdered> getProductsOrdered() {
		return productsOrdered;
	}


	public void setProductsOrdered(List<ProductsOrdered> productsOrdered) {
		this.productsOrdered = productsOrdered;
	}

	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String addLineItem()
	{
		current_session.addLineItem(productService.findProductById(productid),supplierService.findSupplierById(supplierid),quantity);
		return null;
		
	}
	
	
	
	
	
}
