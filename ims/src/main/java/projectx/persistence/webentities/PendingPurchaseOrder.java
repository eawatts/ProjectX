package projectx.persistence.webentities;


import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;


public class PendingPurchaseOrder{
	

	private List<PurchaseOrderProduct> purchaseOrderContents;

	public List<PurchaseOrderProduct> getPurchaseOrderContents() {
		return purchaseOrderContents;
	}

	public void setPurchaseOrderContents(List<PurchaseOrderProduct> purchaseOrderContents) {
		this.purchaseOrderContents = purchaseOrderContents;
	}
	
	public ArrayList<PurchaseOrderProduct> initialisePurchaseOrderContents() {
		if (purchaseOrderContents == null)
			return new ArrayList<PurchaseOrderProduct>();
		else
			return null;
	}
	
	public void addProductToPurchaseOrder(Product product, int quantity, Supplier supplier) {
		if (purchaseOrderContents == null)
			purchaseOrderContents = initialisePurchaseOrderContents();

		boolean needAddingToPurchaseOrder = true;

		if (needAddingToPurchaseOrder) {
			purchaseOrderContents.add(new PurchaseOrderProduct(product, quantity, supplier));
		}
	}
	public void removeProduct(int productId) {
		for (PurchaseOrderProduct purchaseOrderProduct : purchaseOrderContents) {
			if (purchaseOrderProduct.getProduct().getId() == productId) {
				purchaseOrderContents.remove(purchaseOrderProduct);
				return;
			}
		}
	}
	
	public double getTotalPrice() {
		double totalPrice = 0.00;
		if (purchaseOrderContents == null) {
			return totalPrice;
		} else {
			for (PurchaseOrderProduct purchaseOrderProduct : purchaseOrderContents) {
				totalPrice = totalPrice + purchaseOrderProduct.getPurchaseOrderProductPrice();
			}
			return Math.round(totalPrice * 100.0) / 100.0;
		}
	}
	
	public void newRowToPurchaseOrder(){	
		addProductToPurchaseOrder(new Product(), 0, new Supplier());
	}
	

}
