package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.repositories.PurchaseOrderRepository;

@Stateless
@Default
public class PurchaceOrderRepositoryOffline implements PurchaseOrderRepository {

	@Override
	public void persistOrder(PurchaseOrder purchaseOrder) {
		// TODO Auto-generated method stub

	}

	@Override
	public void persistOrders(List<PurchaseOrder> purchaseOrder) {
		// TODO Auto-generated method stub

	}

	@Override
	public PurchaseOrder findPurchaseOrderBySupplierID(String supplierID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrder findPurchaseOrderByOrderStatus(String orderStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrder findPurchaseOrderById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseOrder> getPurchaseOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePurchaseOrder(PurchaseOrder purchaseOrder) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getSupplier() {
		// TODO Auto-generated method stub
		return null;
	}

}
