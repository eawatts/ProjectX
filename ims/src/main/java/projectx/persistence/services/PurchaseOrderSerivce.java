package projectx.persistence.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.repositories.PurchaseOrderRepository;


@Stateless
public class PurchaseOrderSerivce {
	@Inject
	private PurchaseOrderRepository purchaseOrderManager;
	
	public PurchaseOrder findProductById(String id)
	{
		return purchaseOrderManager.findPurchaseOrderById(id);
	}
	public ArrayList<PurchaseOrder> getPurchaseOrder() 
	{
		return purchaseOrderManager.getPurchaseOrders();
	}
	
}
