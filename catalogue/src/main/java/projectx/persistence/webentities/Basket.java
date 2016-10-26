package projectx.persistence.webentities;

import java.util.ArrayList;
import java.util.List;

import projectx.persistence.entities.Product;

public class Basket {

	private List<BasketProduct> basketContents;

	public List<BasketProduct> getBasketContents() {
		return basketContents;
	}

	public void setBasketContents(List<BasketProduct> basketContents) {
		this.basketContents = basketContents;
	}

	public void addProductToBasket(Product product, int quantity) {
		if (basketContents == null)
			basketContents = initialiseBasketContents();

		boolean needAddingToBasket = true;

		// Go through the Basket to see if we can just update a quantity.
		for (BasketProduct basketProduct : basketContents) {
			if (basketProduct.getProduct().getId() == product.getId()) {
				needAddingToBasket = false;
				basketProduct.setQuantity(quantity + basketProduct.getQuantity());
				break;
			}
		}
		if (needAddingToBasket) {
			basketContents.add(new BasketProduct(product, quantity));
		}
	}

	public ArrayList<BasketProduct> initialiseBasketContents() {
		if (basketContents == null)
			return new ArrayList<BasketProduct>();
		else
			return null;
	}

	public void removeProduct(int productId) {
		for (BasketProduct basketProduct : basketContents) {
			if (basketProduct.getProduct().getId() == productId) {
				basketContents.remove(basketProduct);
				return;
			}
		}
	}

	public double totalBasketPrice() {
		double totalPrice = 0.00;
		if (basketContents == null) {
			return totalPrice;
		} else {
			for (BasketProduct basketProduct : basketContents) {
				totalPrice = totalPrice + Double.parseDouble(basketProduct.getBasketProductPrice());
			}
			return Math.round(totalPrice * 100.0) / 100.0;
		}
	}
}
