package projectx.persistence.repositories.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.repositories.PurchaseOrderRepository;
import projectx.persistence.repositories.offline.database.OfflineDB;
import projectx.persistence.webentities.PurchaseOrderProduct;

@Stateless
@Alternative
public class PurchaseOrderRepositoryOffline implements PurchaseOrderRepository {
	@Inject
	OfflineDB initialData;
	

	@Override
	public void persistOrder(PurchaseOrder purchaseOrder) {
		initialData.addPurchaseOrder(purchaseOrder);
	}

	@Override
	public void persistOrders(List<PurchaseOrder> purchaseOrders) {
		for (PurchaseOrder purchaseOrder: purchaseOrders){
			initialData.addPurchaseOrder(purchaseOrder);
		}

	}

	@Override
	public PurchaseOrder findPurchaseOrderBySupplierId(String supplierID) {
		return initialData.getPurchaseOrderBySupplierID(supplierID);
	}

	@Override
	public PurchaseOrder findPurchaseOrderByOrderStatus(String orderStatus) {
		return initialData.getPurchaseOrderByOrderStatus(orderStatus);
	}

	@Override
	public PurchaseOrder findPurchaseOrderById(int id) {
		return initialData.getPurchaseOrderById(id);
	}

	@Override
	public ArrayList<PurchaseOrder> getPurchaseOrders() {
		return initialData.getPurchaseOrders();
	}

	@Override
	public void updatePurchaseOrder(PurchaseOrder purchaseOrder) {
		initialData.updatePurchaseOrders(purchaseOrder);
	}
	
	@Override
	public List<PurchaseOrderProduct> createPurchaseOrderEntry() {
		return null;
		
	}

	@Override
	public ArrayList<ProductsOrdered> getProductsOrdered(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}

