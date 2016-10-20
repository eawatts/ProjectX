package projectx.persistence.repositories.offline;

import java.sql.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.repositories.PurchaseOrderRepository;

@Stateless
@Default
public class PurchaceOrderRepositoryOffline implements PurchaseOrderRepository {
	@Inject
	private database database;
	
	private String orderStatus;
	private String supplierID;
	private Date dateOrdered;
	@Override
	public void persistOrder(PurchaseOrder purchaseOrder) {
		database.addPurchaseOrder(purchaseOrder);
	}

	@Override
	public void persistOrders(List<PurchaseOrder> purchaseOrders) {
		for (PurchaseOrder purchaseOrder: purchaseOrders){
			persistOrder(purchaseOrder);
		}

	}

	@Override
	public PurchaseOrder findPurchaseOrderBySupplierID(String supplierID) {
		for (PurchaseOrder.FIND_ALL ){
			where 
		}
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
		return database.getPurchaseOrders();
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
