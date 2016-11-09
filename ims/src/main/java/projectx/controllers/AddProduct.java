package projectx.controllers;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.services.ProductService;

@Named("newproduct")
@RequestScoped
public class AddProduct{
	@Inject
	private ProductService productService;
	
	private Product product;
	private String error = "";

	@PostConstruct // To prevent any NullPointerExceptions, as the properties have to be instantiated.
	private void initialiseProperties() {
		this.product= new Product();
	}
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String addProduct(){
		productService.addProduct(product);
		return "products";
	}
	

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
	
	
}
