package projectx.persistence.webentities;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;

public class PendingPurchaseOrder {

	private List<PurchaseOrderProduct> purchaseOrderContents;
	
	public PendingPurchaseOrder() {
		purchaseOrderContents = new ArrayList<PurchaseOrderProduct>();
	}

	public List<PurchaseOrderProduct> getContents() {
		return purchaseOrderContents;
	}

	public void setPurchaseOrderContents(List<PurchaseOrderProduct> purchaseOrderContents) {
		this.purchaseOrderContents = purchaseOrderContents;
	}

	private void initialisePurchaseOrderContents() {
		if (this.purchaseOrderContents == null) {
			this.purchaseOrderContents = new ArrayList<PurchaseOrderProduct>();
		}
	}

	/**
	 * Checks to see if the Purchase Order Contents is null, will initialise it, then add the new Purchase Order Product
	 */
	public void addProductToPurchaseOrder(Product product, int quantity, Supplier supplier) {
		if (purchaseOrderContents == null) {
			initialisePurchaseOrderContents();
		}

		purchaseOrderContents.add(new PurchaseOrderProduct(product, quantity, supplier));
	}

	public void removeProduct(int productId) {
		for (PurchaseOrderProduct purchaseOrderProduct : purchaseOrderContents) {
			if (purchaseOrderProduct.getProduct().getId() == productId) {
				purchaseOrderContents.remove(purchaseOrderProduct);
				return;
			}
		}
	}

	public String getTotalPrice() {
		double totalPrice = 0.00;
		if (purchaseOrderContents == null) {
			return "";
		} else {
			for (PurchaseOrderProduct purchaseOrderProduct : purchaseOrderContents) {
				totalPrice = totalPrice + purchaseOrderProduct.getPurchaseOrderProductPrice();
			}
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.getDefault());
			return currencyFormatter.format(totalPrice);
		}
	}
}
