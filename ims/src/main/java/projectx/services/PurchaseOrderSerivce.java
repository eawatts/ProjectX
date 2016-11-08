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
	private PurchaseOrderRepository purchaseOrderRepopository;
	
	public ArrayList<PurchaseOrder> getPurchaseOrderList() {
		return purchaseOrderRepopository.getPurchaseOrders();
	}

	public PurchaseOrder findPurchaseOrderById(int purchaseOrderId) {
		return purchaseOrderRepopository.findPurchaseOrderById(purchaseOrderId);
	}

	public List<PurchaseOrderProduct> createPurchaseOrderEntry() {
		return purchaseOrderRepopository.createPurchaseOrderEntry();
	}	
}
