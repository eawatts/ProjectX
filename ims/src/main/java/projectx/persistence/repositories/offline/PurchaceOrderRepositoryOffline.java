package projectx.persistence.repositories.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.repositories.PurchaseOrderRepository;
import projectx.persistence.repositories.offline.database.OfflineDB;

@Stateless
@Default
public class PurchaceOrderRepositoryOffline implements PurchaseOrderRepository {
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
	public PurchaseOrder findPurchaseOrderById(String id) {
		return initialData.getPurchaseOrderById(id);
	}

	@Override
	public ArrayList<PurchaseOrder> getPurchaseOrders() {
		return (ArrayList<PurchaseOrder>) initialData.getPurchaseOrders();
	}

	@Override
	public void updatePurchaseOrder(PurchaseOrder purchaseOrder) {
		initialData.updatePurchaseOrders(purchaseOrder);
	}
}