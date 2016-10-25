package projectx.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.interfaces.ProductRepository;
import projectx.persistence.webentities.CurrentProduct;
import projectx.persistence.webentities.ProductWithAverageReview;

@Stateless
public class ProductService {
	
	@Inject
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.getProducts();
	}
	
	public List<ProductWithAverageReview> getTopProductsWithAverageReview() {
		return productRepository.getTopProductsWithAverageReview();
	}
	
	public List<ProductWithAverageReview> getSeasonalProductsWithAverageReview() {
		return productRepository.getSeasonalProductsWithAverageReview();
	}
	
	public Product getProductFromId(int id){
		return productRepository.getProductFromId(id);	
	}
	
	public CurrentProduct getCurrentProductFromId(int id){
		return productRepository.getCurrentProductFromId(id);	
	}
	
	public Integer getAverageReviewForProductId(int productId) {
		return productRepository.getAverageReviewForProductId(productId);
	}

	public ArrayList<Product> getSubcatsProducts(String subcategory) {
		return productRepository.getSubcatsProducts(subcategory);
	}
}
