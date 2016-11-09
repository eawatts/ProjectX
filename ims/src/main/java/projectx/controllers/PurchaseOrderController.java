package projectx.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;
import projectx.persistence.selected.SelectedPurchaseOrderProduct;
import projectx.persistence.webentities.CurrentSession;
import projectx.persistence.webentities.PurchaseOrderProduct;
import projectx.services.PurchaseOrderService;
import projectx.services.ProductService;


@Named("purchase_order")
@RequestScoped
public class PurchaseOrderController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	PurchaseOrderService purchaseOrderService;
	
	@Inject
	private CurrentSession currentsession;

	@Inject
	private ProductService productServce;
	
	@Inject
	private SupplierController supplierController;

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

		List<Product> lowStockProducts = productServce.getTop25LowStockProducts();

		List<PurchaseOrderProduct> purchaseOrderProducts = currentsession.getPendingPurchaseOrder().getContents();

		for (Product product : lowStockProducts) {
			int supplierId = new Random().nextInt(3) + 1; // TODO: Sort this out, this is a disaster.
			purchaseOrderProducts.add(new PurchaseOrderProduct(product, ((3 * product.getLowLimit()) - product.getCurrentStock()), supplierController.getSupplierActualById(supplierId)));
		}

		currentsession.getPendingPurchaseOrder().setPurchaseOrderContents(purchaseOrderProducts);
		return null;
	}

	public String completePurchaseOrder() {
		
		List<PurchaseOrderProduct> purchaseOrderProducts = currentsession.getPendingPurchaseOrder().getContents();
		ArrayList<PurchaseOrderProduct> gnomes = new ArrayList<PurchaseOrderProduct>();
		ArrayList<PurchaseOrderProduct> rakes = new ArrayList<PurchaseOrderProduct>();
		ArrayList<PurchaseOrderProduct> weSell = new ArrayList<PurchaseOrderProduct>();
		ArrayList<PurchaseOrderProduct> gnomesRUs = new ArrayList<PurchaseOrderProduct>();
		for(PurchaseOrderProduct purchaseOrderProduct : purchaseOrderProducts){
			String supplier = purchaseOrderProduct.getSupplier().getName();
			switch(supplier){
			case "Gnomes gnomes gnomes": gnomes.add(purchaseOrderProduct);
											break;
			case "Rakes and Hoes Emporium":rakes.add(purchaseOrderProduct);
											break;
			case "We Sell Stuff":weSell.add(purchaseOrderProduct);
									break;
			case "Gnomes R Us":gnomesRUs.add(purchaseOrderProduct);
								break;
			default: System.out.println("FAILED TO ADD TO PO" + purchaseOrderProduct.getProduct().getName()); break;
			
			}
		}
		List<ArrayList<PurchaseOrderProduct>> suppliers = new ArrayList<ArrayList<PurchaseOrderProduct>>();
		suppliers.add(gnomes);
		suppliers.add(rakes);
		suppliers.add(weSell);
		suppliers.add(gnomesRUs);
		
		for(ArrayList<PurchaseOrderProduct> supplier : suppliers){
			if(supplier.size() > 0){
				purchaseOrderService.addPurchaseOrder(supplier.get(0).getSupplier());
			}
			else{
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			}
		}
		
		clearAllPendingPurchaseOrderProducts();
		return "index";
	}
}
