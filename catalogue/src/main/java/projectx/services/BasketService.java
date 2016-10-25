package projectx.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

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
	
	public void addProductToBasket(CurrentProduct currentProduct, int quantity)
	{
		if(basketContents == null)
			basketContents = initBasketContents();
		boolean flag = true;
		for(BasketProduct bProduct: basketContents)
		{
			if(bProduct.getProduct().equals(currentProduct.getProduct())) 
			{
				flag = false;
				bProduct.setQuantity(quantity + bProduct.getQuantity());
				break;
			}
		}
		if(flag) 
		{
			basketContents.add(new BasketProduct(currentProduct, quantity));
		}
		
	}
	
	public ArrayList<BasketProduct> initBasketContents()
	{
		if(basketContents == null) 
			return new ArrayList<BasketProduct>();
		else
			return null;
	}

	public void removeProduct(int productId)
	{
		for(BasketProduct basketProduct: basketContents){
			if(basketProduct.getProduct().getId() == productId){
				basketContents.remove(basketProduct);
				return;
			}
		}
	}

	public double totalBasketPrice() {
		double totalPrice = 0.00;
		if(basketContents == null){
			return totalPrice;
		}
		else{
		for(BasketProduct basketProduct: basketContents){
				totalPrice = totalPrice + Double.parseDouble(basketProduct.getBasketProductPrice());
			}
		return Math.round(totalPrice*100.0)/100.0;
		}
	}

}
