package projectx.persistence.webentities;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;

public class PurchaseOrderProduct {

	private int quantity = 1;
	private Product product;
	private Supplier supplier;

	public PurchaseOrderProduct(Product product, int quantity, Supplier supplier) {
		this.quantity = quantity;
		this.product = product;
		this.supplier = supplier;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getPurchaseOrderProductPrice() {
		return this.product.getPrice() * quantity;
	}
}
