package projectx.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.Supplier;
import projectx.persistence.util.OrderState;
import projectx.services.PurchaseOrderSerivce;




@Named("purchaseOrders")
@SessionScoped
public class PurchaseOrderController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject 
	private PurchaseOrderSerivce purchaseOrderSerivce;

	private int id;
	private Supplier supplier;
	private boolean approved;
	private Date approvalDate;
	private OrderState status;
	private List<ProductsOrdered> productsOrdered;


	public ArrayList<PurchaseOrder> getPurchaseOrderList(){	
		return purchaseOrderSerivce.getPurchaseOrderList();
	}
	public PurchaseOrder findPOById(int id){
		System.out.println("!!!!!!!!!!!!!!!!");
		return purchaseOrderSerivce.findPOById(id);
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
	
	
	
	
}
