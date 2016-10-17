package projectx;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
 
@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class CarouselView implements Serializable {
     private List<Products> products;
     private Products selectedProduct;

	public List<Products> getProducts() {
		return products;
	}

	public Products getSelectedProduct() {
		return selectedProduct;
	}

	public void setSelectedProduct(Products selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
     
     
     
}