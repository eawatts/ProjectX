package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;
import projectx.persistence.selected.SelectedPurchaseOrderProduct;
import projectx.persistence.webentities.CurrentSession;
import projectx.persistence.webentities.PurchaseOrderProduct;

@Named("purchase_order")
@RequestScoped
public class PurchaseOrderController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CurrentSession currentsession;

	@Inject
	private SelectedPurchaseOrderProduct selectedPurchaseOrderProduct;

	public String addPendingPurchaseOrder() {

		Product selectedProduct = selectedPurchaseOrderProduct.getProduct();
		int selectedQuantity = selectedPurchaseOrderProduct.getQuantity();
		
		List<PurchaseOrderProduct> purchaseOrderProducts = currentsession.getPendingPurchaseOrder().getContents();

		// See if we need to update the quantity or add a new entry
		for (PurchaseOrderProduct purchaseOrderProduct : purchaseOrderProducts) {
			if (purchaseOrderProduct.getProduct().getId() == selectedProduct.getId()) {
				purchaseOrderProduct.setQuantity(purchaseOrderProduct.getQuantity() + selectedQuantity);
				return null;
			}
		}

		Supplier selectedSupplier = selectedPurchaseOrderProduct.getSupplier();
		currentsession.getPendingPurchaseOrder().addProductToPurchaseOrder(selectedProduct, selectedQuantity, selectedSupplier);

		return null;
	}
}
