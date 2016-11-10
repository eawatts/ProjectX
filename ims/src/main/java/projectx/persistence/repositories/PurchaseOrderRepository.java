package projectx.persistence.repositories;


import java.util.ArrayList;
import java.util.List;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.Supplier;
import projectx.persistence.webentities.PurchaseOrderProduct;

public interface PurchaseOrderRepository {
	public void persistOrder (PurchaseOrder purchaseOrder);
	public void persistOrders (List<PurchaseOrder> purchaseOrder);
	
	public PurchaseOrder findPurchaseOrderBySupplierId(String supplierID);
	public PurchaseOrder findPurchaseOrderByOrderStatus(String orderStatus);
	public PurchaseOrder findPurchaseOrderById(int id);
	public ArrayList<PurchaseOrder> getPurchaseOrders();
	public void updatePurchaseOrder (PurchaseOrder purchaseOrder);
	List<PurchaseOrderProduct> createPurchaseOrderEntry();
	public ArrayList<ProductsOrdered> getProductsOrdered(Integer id);
	public PurchaseOrder addPurchaseOrder(Supplier supplier);
	public void addPurchaseOrder(Product product, int quantity, PurchaseOrder purchaseOrder);
}
	