package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.webentities.CurrentProduct;
import projectx.persistence.webentities.ProductWithAverageReview;
import projectx.services.ProductService;

@Named("products")
@RequestScoped
public class ProductController implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private ProductService productService;
	@Inject
	private CurrentProduct currentProduct;
	
	public String view(int productId){
		currentProduct.setProduct(productService.getProductFromId(3));
		return "catalogue_product";
	}
	
	public List<ProductWithAverageReview> getTopProductsWithAverageReview() {
		return productService.getTopProductsWithAverageReview();
	}
	
	public List<ProductWithAverageReview> getSeasonalProductsWithAverageReview() {
		return productService.getSeasonalProductsWithAverageReview();
	}
	
	public Product getProductFromId(int id) {
		return productService.getProductFromId(id);		
	}
	
	public Integer getAverageReviewForProductId(int productId){
		return productService.getAverageReviewForProductId(productId);
	}
}
