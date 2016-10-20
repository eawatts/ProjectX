package projectx.persistence.repositories.offline;

import java.sql.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.repositories.PurchaseOrderRepository;
import projectx.persistence.util.InitialData;

@Stateless
@Default
public class PurchaceOrderRepositoryOffline implements PurchaseOrderRepository {
	@Inject
	InitialData initialData;
	

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
	public List<PurchaseOrder> getPurchaseOrders() {
		return initialData.getPurchaseOrders();
	}

	@Override
	public void updatePurchaseOrder(PurchaseOrder purchaseOrder) {
		initialData.updatePurchaseOrders(purchaseOrder);
	}

	@Override
	public Object getSupplier(String id) {
		return initialData.getPurchaseOrderBySupplierID(id);
	}

}
