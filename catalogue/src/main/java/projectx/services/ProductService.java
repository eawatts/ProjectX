package projectx.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.interfaces.ProductRepository;
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
	
	public Integer getAverageReviewForProductId(int productId) {
		return productRepository.getAverageReviewForProductId(productId);
	}
}
