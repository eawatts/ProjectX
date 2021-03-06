package projectx.persistence.webentities;

import java.util.ArrayList;
import java.util.List;

import projectx.persistence.entities.Product;

public class Basket {

	public static final int DAYS_FOR_DELIVERY = 2;
	public static final int DAY_IN_MILLISECONDS = 86400000;

	private List<BasketProduct> basketContents;

	public List<BasketProduct> getBasketContents() {
		return basketContents;
	}

	public void setBasketContents(List<BasketProduct> basketContents) {
		this.basketContents = basketContents;
	}

	public ArrayList<BasketProduct> initialiseBasketContents() {
		if (basketContents == null)
			return new ArrayList<BasketProduct>();
		else
			return null;
	}

	public void addSingleProductToBasket(Product product) {
		addProductToBasket(product, 1);
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

	public List<BasketProduct> getContents() {
		return basketContents;
	}

	public int getCount() {
		if (basketContents == null) {
			return 0;
		}
		return basketContents.size();
	}

	public void removeProduct(int productId) {
		for (BasketProduct basketProduct : basketContents) {
			if (basketProduct.getProduct().getId() == productId) {
				basketContents.remove(basketProduct);
				return;
			}
		}
	}

	public double getTotalPrice() {
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
