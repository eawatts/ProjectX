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
	private static final long serialVersionUID = 1L;
	private Supplier supplier;
	
	public Supplier getSupplier(){
		return supplier;
	}
	public void setSupplier(Supplier supplier){
		this.supplier=supplier;
	}
}
