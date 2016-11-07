package projectx.persistence.selected;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.PurchaseOrder;

@SuppressWarnings("serial")
@SessionScoped
@Named("selected")
public class SelectedPurchaseOrder implements Serializable{
	private PurchaseOrder selectedpurchaseOrder;

	public PurchaseOrder getSelectedpurchaseOrder() {
		return selectedpurchaseOrder;
	}

	public void setSelectedpurchaseOrder(PurchaseOrder selectedpurchaseOrder) {
		this.selectedpurchaseOrder = selectedpurchaseOrder;
	}
	
	
}
