package projectx.persistence.repositories.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.repositories.PurchaseOrderRepository;
import projectx.persistence.repositories.hibernate.database.HibernateDatabase;
import projectx.persistence.webentities.PurchaseOrderProduct;

@Stateless
@Alternative

public class PurchaseOrderRepositoryHibernate implements PurchaseOrderRepository{

	@Inject 
	private HibernateDatabase db;
	
	@Override
	public void persistOrder(PurchaseOrder purchaseOrder) {
		db.persistPurchaseOrder(purchaseOrder);
		
	}

	@Override
	public void persistOrders(List<PurchaseOrder> purchaseOrder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PurchaseOrder findPurchaseOrderBySupplierId(String supplierID) {
		// TODO Auto-generated method stub
		return db.findPurchaseOrderBySupplierId(supplierID);
	}

	@Override
	public PurchaseOrder findPurchaseOrderByOrderStatus(String orderStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseOrder findPurchaseOrderById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PurchaseOrder> getPurchaseOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePurchaseOrder(PurchaseOrder purchaseOrder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PurchaseOrderProduct> createPurchaseOrderEntry() {
		// TODO Auto-generated method stub
		return null;
	}

}
