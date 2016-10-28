package projectx.services;

import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.repositories.PurchaseOrderRepository;


@Stateless
public class PurchaseOrderSerivce {
	@Inject
	private PurchaseOrderRepository purchaseOrderRepo;
	
	public PurchaseOrder findProductById(String id)
	{
		return purchaseOrderRepo.findPurchaseOrderById(id);
	}
	
	public ArrayList<PurchaseOrder> getPurchaseOrderList() {
		return purchaseOrderRepo.getPurchaseOrders();
	}
	
}
