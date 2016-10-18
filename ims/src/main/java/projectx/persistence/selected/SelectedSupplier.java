package projectx.persistence.selected;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.PurchaseOrderRepository;
import projectx.persistence.services.SupplierService;

@SessionScoped
public class SelectedSupplier implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1810508961661962235L;
	@Inject 
	private PurchaseOrderRepository purchaseOrder;
	@Inject
	private SupplierService supplierService;
	private Supplier supplier;
	
	public PurchaseOrderRepository getPurchaseOrder(){
		return purchaseOrder;
	}
	
	public void setSupplier(PurchaseOrderRepository purchaseOrder){
		this.purchaseOrder=purchaseOrder;
		supplier = supplierService.findById(purchaseOrder.getSupplier());
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
}
