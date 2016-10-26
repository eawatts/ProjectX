package projectx.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

import projectx.persistence.entities.Product;
import projectx.persistence.webentities.BasketProduct;
import projectx.persistence.webentities.CurrentProduct;

@Stateful
public class BasketService {

	private List<BasketProduct> basketContents;

	public List<BasketProduct> getBasketContents() {
		return basketContents;
	}

	public void setBasketContents(List<BasketProduct> basketContents) {
		this.basketContents = basketContents;
	}

	public void addProductToBasket(Product product, int quantity) {
		if (basketContents == null)
			basketContents = initBasketContents();
		boolean flag = true;
		for (BasketProduct basketProduct : basketContents) {
			if (basketProduct.getProduct().equals(product)) {
				flag = false;
				basketProduct.setQuantity(quantity + basketProduct.getQuantity());
				break;
			}
		}
		if (flag) {
			basketContents.add(new BasketProduct(product, quantity));
		}
	}

	public ArrayList<BasketProduct> initBasketContents() {
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
