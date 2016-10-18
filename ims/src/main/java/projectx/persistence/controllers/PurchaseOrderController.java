package projectx.persistence.controllers;
import projectx.persistence.entities.*;
import projectx.persistence.services.*;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.inject.*;



@SuppressWarnings("serial")
@Named("purchaseOrders")
@SessionScoped
public class PurchaseOrderController implements Serializable{
	@Inject 
	private PurchaseOrderSerivce purchaseOrderSerivce;
	private DataModel<PurchaseOrder> datamodel=null;
	public DataModel<PurchaseOrder> getDatamodel() {
		return datamodel;
	}
	public void setDatamodel(DataModel<PurchaseOrder> datamodel) {
		this.datamodel = datamodel;
	}
	public PurchaseOrderSerivce getPurchaseOrderSerivce() {
		return purchaseOrderSerivce;
	}
	public void setPurchaseOrderSerivce(PurchaseOrderSerivce purchaseOrderSerivce) {
		this.purchaseOrderSerivce = purchaseOrderSerivce;
	}
}
