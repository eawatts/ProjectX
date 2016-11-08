package projectx.persistence.selected;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;

@SessionScoped
@Named("selected_purchase_order_product")

public class SelectedPurchaseOrderProduct implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Product product;
	private int quantity;
	private Supplier supplier;
	
	@PostConstruct
	private void initialise() {
		this.product = new Product();
		this.quantity = 1;
		this.supplier = new Supplier();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
}