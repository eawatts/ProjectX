package projectx.controllers;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.Supplier;
import projectx.persistence.selected.SelectedPurchaseOrder;
import projectx.persistence.util.OrderState;
import projectx.services.PurchaseOrderSerivce;



@Named("purchaseOrders")
@SessionScoped
public class PurchaseOrderController implements Serializable{
	@Inject 
	private PurchaseOrderSerivce purchaseOrderSerivce;
	@Inject
	private SelectedPurchaseOrder selectedPurchaseOrder;
	private DataModel<PurchaseOrder> purchaseOrderDataModel=null;
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private Supplier supplier;
	private boolean approved;
	private Date approvalDate;
	private OrderState status;
	private ProductsOrdered productsOrdered;
	
	public void selected(int sId, Supplier sSupplier, boolean sApproved, Date sApprovalDate, OrderState sStatus, ProductsOrdered sProductsOrdered){
		this.id=sId;
		this.supplier=sSupplier;
		this.approved=sApproved;
		this.approvalDate=sApprovalDate;
		this.status=sStatus;
		this.productsOrdered=sProductsOrdered;
	}

	public ArrayList<PurchaseOrder> getPurchaseOrderList(){	
		return purchaseOrderSerivce.getPurchaseOrder();
	}
	
	
	
	
}
