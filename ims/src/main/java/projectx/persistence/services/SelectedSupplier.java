package projectx.persistence.services;

import javax.inject.Inject;

import projectx.persistence.repositories.interfaces.*;


public class SelectedSupplier {
	@Inject private PurchaseOrderSerivce purchaseOrderService;
	@Inject private ;
	private PurchaseOrderRepository purchaseOrder;
	private SupplierRespository supplier;
	
	public PurchaseOrderRepository getPurchaseOrder(){
		return purchaseOrder;
	}
	
	public void setSupplier(PurchaseOrderRepository purchaseOrder){
		this.purchaseOrder=purchaseOrder;
		supplier = supplierService.findById(purchaseOrder.getSupplier());
	}
}
