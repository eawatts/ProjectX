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
	@Inject PurchaseOrderSerivce purchaseOrderSerivce;
	private DataModel<PurchaseOrder> datamodel=null;
}
