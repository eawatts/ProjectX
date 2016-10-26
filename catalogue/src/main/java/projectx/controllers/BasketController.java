package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.webentities.BasketProduct;
import projectx.persistence.webentities.CurrentProduct;
import projectx.persistence.webentities.CurrentSession;

@Named("basket")
@RequestScoped
public class BasketController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CurrentSession currentSession;

	@Inject
	private CurrentProduct currentProduct;

	public String view() {
		return "basket";
	}

	public void addCurrentProduct() {
		currentSession.getBasket().addProductToBasket(currentProduct.getProduct(), currentProduct.getQuantity());
		currentProduct.setQuantity(1);
	}

	public void addProduct(Product product) {
		currentSession.getBasket().addProductToBasket(product, currentProduct.getQuantity());
		currentProduct.setQuantity(1);
	}

	public void removeProduct(int productId) {
		currentSession.getBasket().removeProduct(productId);
	}

	public List<BasketProduct> getBasket() {
		return currentSession.getBasket().getBasketContents();
	}

	public int getBasketCount() {
		if (currentSession.getBasket().getBasketContents() == null) {
			return 0;
		}
		return currentSession.getBasket().getBasketContents().size();
	}

	public int getQuantity() {
		return currentProduct.getQuantity();
	}

	public void setQuantity(int quantity) {
		currentProduct.setQuantity(quantity);
	}

	public double getTotalBasketPrice() {
		return currentSession.getBasket().totalBasketPrice();
	}
}
