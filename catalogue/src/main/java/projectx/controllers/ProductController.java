package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.services.ProductService;

@Named("products")
@RequestScoped
public class ProductController implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private ProductService productService;
	
	public List<Product> getTopProducts() {
		return productService.getAllProducts();
	}
	
	public List<Product> getSeasonalProducts() {
		return productService.getAllProducts();
	}
	
	public Product getProductFromId(int id) {
		return productService.getProductFromId(id);		
	}
}
