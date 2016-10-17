package projectx.persistence.services;

import java.util.List;

import javax.ejb.Stateless;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.repositories.interfaces.PurchaseOrderRepository;


@Stateless
public class PurchaseOrderSerivce {
	private PurchaseOrderRepository purchaseOrderManager;
	
	public PurchaseOrder findProductById(String id)
	{
		return purchaseOrderManager.findPurchaseOrderById(id);
	}
	public List<PurchaseOrder> getPurchaseOrder() 
	{
		return purchaseOrderManager.getPurchaseOrders();
	}
	
}
