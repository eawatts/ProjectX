package projectx.persistence.controllers;
import projectx.persistence.entities.*;
import projectx.persistence.selected.SelectedPurchaseOrder;
import projectx.persistence.services.*;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.*;



@SuppressWarnings("serial")
@Named("purchaseOrders")
@SessionScoped
public class PurchaseOrderController implements Serializable{
	@Inject 
	private PurchaseOrderSerivce purchaseOrderSerivce;
	@Inject
	private SelectedPurchaseOrder selectedPurchaseOrder;
	private DataModel<PurchaseOrder> purchaseOrderDataModel=null;
	
	public String getPurchaseOrder(String id){
		try{
		selectedPurchaseOrder.setSelectedpurchaseOrder(purchaseOrderSerivce.findProductById(id));
		return "purchaseOrder";
		}
		catch (Exception e){
			return "browse";
		}
	}
	
	public DataModel<PurchaseOrder> getDatamodel() {
		if (purchaseOrderDataModel==null){
			purchaseOrderDataModel= createDataModel();
		}
		return purchaseOrderDataModel;
	}
	
	public DataModel<PurchaseOrder> createDataModel()
	{
		
		return new ListDataModel<PurchaseOrder>(purchaseOrderSerivce.getPurchaseOrder());
	}
	
	

}
