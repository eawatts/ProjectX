package projectx.persistence.webentities;

import java.math.BigDecimal;
import java.math.RoundingMode;

import projectx.persistence.entities.Product;

public class BasketProduct {
	
	private int quantity;
	private Product product;
	
	public BasketProduct(Product product, int quantity) {
		this.quantity = quantity;
		this.product = product;
	}

	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quantity)
	{
			this.quantity = quantity;
	}
	
	public Product getProduct()
	{
		return product;
	}
	
	public void setProduct(Product product)
	{
		this.product = product;
	}
	
	public String getBasketProductPrice()
	{
		return (this.product.getPrice().multiply(new BigDecimal(quantity)).setScale(2, RoundingMode.CEILING).toString());
	}
}
