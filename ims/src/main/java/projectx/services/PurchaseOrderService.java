package projectx.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.PurchaseOrderRepository;
import projectx.persistence.webentities.PurchaseOrderProduct;


@Stateless
public class PurchaseOrderService {
	
	@Inject
	private PurchaseOrderRepository purchaseOrderRepository;
	
	public ArrayList<PurchaseOrder> getPurchaseOrderList() {
		return purchaseOrderRepository.getPurchaseOrders();
	}

	public PurchaseOrder findPurchaseOrderById(int purchaseOrderId) {
		return purchaseOrderRepository.findPurchaseOrderById(purchaseOrderId);
	}

	public List<PurchaseOrderProduct> createPurchaseOrderEntry() {
		return purchaseOrderRepository.createPurchaseOrderEntry();
	}	
	
	public List<ProductsOrdered> getProductsOrdered(Integer id){
		return purchaseOrderRepository.getProductsOrdered(id);
	}
	
	public void addPurchaseOrder(Supplier supplier){
		purchaseOrderRepository.addPurchaseOrder(supplier);
	}
}
