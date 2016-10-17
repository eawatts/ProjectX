package projectx.persistence.repositories.interfaces;


import java.util.List;

import projectx.persistence.entities.PurchaseOrder;

public interface PurchaseOrderRepository {
	public void persistOrder (PurchaseOrder purchaseOrder);
	public void persistOrders (List<PurchaseOrder> purchaseOrder);
	
	public PurchaseOrder findBySupplierID(String supplierID);
	public PurchaseOrder findByOrderStatus(String orderStatus);
	public PurchaseOrder findByPurchaseOrderID(String id);
	public List<PurchaseOrder> getPurchaseOrders();
	public void updatePurchaseOrder (PurchaseOrder purchaseOrder);
}
	