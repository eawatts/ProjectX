package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.webentities.BasketProduct;
import projectx.persistence.webentities.CurrentProduct;
import projectx.services.BasketService;

@Named("basket")
@SessionScoped
public class BasketController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private BasketService basketService;
	@Inject 
	private CurrentProduct currentProduct;
	private int quantity = 1;

	public String addCurrentProduct()
	{
		basketService.addProductToBasket(currentProduct.getProduct(), quantity );
		quantity = 1;
		return "Added to Basket";
	}
	public String addProduct(Product product)
	{
		basketService.addProductToBasket(product, quantity );
		quantity = 1;
		return "Added to Basket";
	}
	
	public void removeProduct(int productId)
	{
		basketService.removeProduct(productId);
	}
	
	public String view()
	{
		return "catalogue_basket";
	}
	
	public List<BasketProduct> getBasket()
	{
		return basketService.getBasketContents();
	}
	
	public int getBasketCount()
	{
		if (basketService.getBasketContents() == null){
			return 0;
		}
		return basketService.getBasketContents().size();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotalBasketPrice(){
		return basketService.totalBasketPrice();
	}
	
	
}
