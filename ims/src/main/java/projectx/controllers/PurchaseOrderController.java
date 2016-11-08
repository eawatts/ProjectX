package projectx.controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.webentities.CurrentSession;
import projectx.services.PurchaseOrderSerivce;


@Named("purchase_order")
@RequestScoped
public class PurchaseOrderController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CurrentSession currentsession;
	
	@Inject 
	private PurchaseOrderSerivce purchaseOrderSerivce;
	
	
	
}
