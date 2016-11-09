package projectx.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;
import projectx.persistence.selected.SelectedPurchaseOrderProduct;
import projectx.persistence.webentities.CurrentSession;
import projectx.persistence.webentities.PurchaseOrderProduct;
import projectx.services.ProductService;

@Named("purchase_order")
@RequestScoped
public class PurchaseOrderController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CurrentSession currentsession;

	@Inject
	private ProductService productServce;

	@Inject
	private SelectedPurchaseOrderProduct selectedPurchaseOrderProduct;

	public String addPendingPurchaseOrderProduct() {

		Product selectedProduct = selectedPurchaseOrderProduct.getProduct();
		int selectedQuantity = selectedPurchaseOrderProduct.getQuantity();
		Supplier selectedSupplier = selectedPurchaseOrderProduct.getSupplier();

		List<PurchaseOrderProduct> purchaseOrderProducts = currentsession.getPendingPurchaseOrder().getContents();

		// See if we just need to update the quantity if it is the same product.
		for (PurchaseOrderProduct purchaseOrderProduct : purchaseOrderProducts) {
			if ((purchaseOrderProduct.getProduct().getId() == selectedProduct.getId())
					&& (purchaseOrderProduct.getSupplier().getId() == selectedSupplier.getId())) {
				purchaseOrderProduct.setQuantity(purchaseOrderProduct.getQuantity() + selectedQuantity);
				return null;
			}
		}

		currentsession.getPendingPurchaseOrder().addProductToPurchaseOrder(selectedProduct, selectedQuantity,
				selectedSupplier);

		return null;
	}

	public String clearAllPendingPurchaseOrderProducts() {
		currentsession.getPendingPurchaseOrder().setPurchaseOrderContents(new ArrayList<PurchaseOrderProduct>());
		return null;
	}

	public String removePendingPurchaseOrderProduct(int productId, int supplierId) {

		List<PurchaseOrderProduct> purchaseOrderProducts = currentsession.getPendingPurchaseOrder().getContents();
		for (PurchaseOrderProduct purchaseOrderProduct : purchaseOrderProducts) {
			if ((purchaseOrderProduct.getProduct().getId() == productId)
					&& (purchaseOrderProduct.getSupplier().getId() == supplierId)) {
				purchaseOrderProducts.remove(purchaseOrderProduct);
				return null;
			}
		}

		return null;
	}

	public String generatePurchaseOrder() {

		// Get the standard Products
		List<Product> lowStockProducts = productServce.getTop25LowStockProducts();

		List<PurchaseOrderProduct> purchaseOrderProducts = currentsession.getPendingPurchaseOrder().getContents();

		for (Product product : lowStockProducts) {
			purchaseOrderProducts.add(new PurchaseOrderProduct(product, 5, new Supplier()));
		}

		currentsession.getPendingPurchaseOrder().setPurchaseOrderContents(purchaseOrderProducts);
		return null;
	}

	public String completePurchaseOrder() {
		// List<PurchaseOrderProduct> purchaseOrderProducts =
		// currentsession.getPendingPurchaseOrder().getContents();
		clearAllPendingPurchaseOrderProducts();
		return "index";
	}
}
