package projectx.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.repositories.PurchaseOrderRepository;
import projectx.persistence.webentities.PurchaseOrderProduct;


@Stateless
public class PurchaseOrderSerivce {
	@Inject
	private PurchaseOrderRepository purchaseOrderRepo;
	
//	public PurchaseOrder findPOById(int id)
//	{
//		return purchaseOrderRepo.findPurchaseOrderById(id);
//	}
	
	public ArrayList<PurchaseOrder> getPurchaseOrderList() {
		return purchaseOrderRepo.getPurchaseOrders();
	}

	public PurchaseOrder findPOById(int id) {
		return purchaseOrderRepo.findPurchaseOrderById(id);
	}

	public void addProductToPurchaseOrder() {
		
		
	}

	public List<PurchaseOrderProduct> createPurchaseOrderEntry() {
		return purchaseOrderRepo.createPurchaseOrderEntry();
	}
	
	
	
}
