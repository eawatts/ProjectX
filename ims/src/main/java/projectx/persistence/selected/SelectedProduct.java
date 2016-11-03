package projectx.persistence.selected;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.Product;

@SessionScoped
@Named("selected_product")
public class SelectedProduct implements Serializable
{
	private static final long serialVersionUID = 7762864582284913362L;
	
	private Product selectedProduct;

	public Product getSelectedProduct()
	{
		return selectedProduct;
	}

	public void setSelectedProduct(Product selectedProduct)
	{
		this.selectedProduct = selectedProduct;
	}
}
