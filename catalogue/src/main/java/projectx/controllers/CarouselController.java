package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import projectx.persistence.entities.xxx_Products;
 
@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class CarouselController implements Serializable {
     private List<xxx_Products> products;
     private xxx_Products selectedProduct;

	public List<xxx_Products> getProducts() {
		return products;
	}

	public xxx_Products getSelectedProduct() {
		return selectedProduct;
	}

	public void setSelectedProduct(xxx_Products selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
     
     
     
}