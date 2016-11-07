package projectx.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.PurchaseOrder;
import projectx.services.PurchaseOrderSerivce;

@Named("newPurchaseOrder")
@RequestScoped
public class AddPurchaseOrder{
	@Inject
	private PurchaseOrderSerivce poservice;
	
	private SupplierController supplierController;
	private ProductController productController;
	
	private PurchaseOrder purchaseOrder;
	
	private String error="";

	
	
	@PostConstruct
	private void intialiseProperties(){
		this.purchaseOrder=new PurchaseOrder();
	}
	
	public PurchaseOrder getPOrder(){
		return purchaseOrder;	
	}

	public void setPOrder(PurchaseOrder purchaseOrder){
		this.purchaseOrder= purchaseOrder;
	}
	
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	public String addPurchaseOrder(){
		poservice.adddPurchaseOrder(purchaseOrder);
		return "purchaseOrder";
	}
	
}