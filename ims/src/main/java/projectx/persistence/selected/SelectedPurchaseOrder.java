package projectx.persistence.selected;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.PurchaseOrder;

@SessionScoped
@Named("selected_purchase_order")
public class SelectedPurchaseOrder implements Serializable{

	private static final long serialVersionUID = 1L;
	private PurchaseOrder selectedpurchaseOrder;

	public PurchaseOrder getSelectedpurchaseOrder() {
		return selectedpurchaseOrder;
	}

	public void setSelectedpurchaseOrder(PurchaseOrder selectedpurchaseOrder) {
		this.selectedpurchaseOrder = selectedpurchaseOrder;
	}
	
	
}
