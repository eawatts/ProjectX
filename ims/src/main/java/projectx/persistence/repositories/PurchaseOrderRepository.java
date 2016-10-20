package projectx.persistence.repositories;


import java.util.List;

import projectx.persistence.entities.PurchaseOrder;

public interface PurchaseOrderRepository {
	public void persistOrder (PurchaseOrder purchaseOrder);
	public void persistOrders (List<PurchaseOrder> purchaseOrder);
	
	public PurchaseOrder findPurchaseOrderBySupplierId(String supplierID);
	public PurchaseOrder findPurchaseOrderByOrderStatus(String orderStatus);
	public PurchaseOrder findPurchaseOrderById(String id);
	public List<PurchaseOrder> getPurchaseOrders();
	public void updatePurchaseOrder (PurchaseOrder purchaseOrder);
	public Object getSupplier();
	PurchaseOrder findPurchaseOrderBySupplierID(String supplierID);
}
	