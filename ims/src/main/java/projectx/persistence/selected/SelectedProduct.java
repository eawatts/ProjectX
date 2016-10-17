package projectx.persistence.selected;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.services.ProductService;
@SessionScoped
@Named("selected")
public class SelectedProduct implements Serializable
{
	@Inject private ProductService proServ;
	private Product selectedProduct;
	/**
	 * @return the selectedProduct
	 */
	public Product getSelectedProduct()
	{
		return selectedProduct;
	}
	/**
	 * @param selectedProduct the selectedProduct to set
	 */
	public void setSelectedProduct(Product selectedProduct)
	{
		this.selectedProduct = selectedProduct;
	}
	
	
}
