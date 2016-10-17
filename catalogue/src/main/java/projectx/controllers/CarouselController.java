package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import projectx.persistence.entities.Products;
 
@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class CarouselController implements Serializable {
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