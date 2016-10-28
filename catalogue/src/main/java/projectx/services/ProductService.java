package projectx.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.interfaces.ProductRepository;
import projectx.persistence.webentities.CurrentProduct;
import projectx.persistence.webentities.ProductWithAverageReview;

/**
 * Used to pass Product requests to the ProductRepository.
 */
@Stateless
public class ProductService {
	
	@Inject
	private ProductRepository productRepository;
	
	/**
	 * Gets a List of all Products.
	 * @return a list of Products.
	 */
	public List<Product> getAllProducts() {
		return productRepository.getProducts();
	}
	
	/**
	 * Gets a list of the Top ProductWithAverageReviews.
	 * @return the list of ProductWithAverageReviews.
	 */
	public List<ProductWithAverageReview> getTopProductsWithAverageReview() {
		return productRepository.getTopProductsWithAverageReview();
	}
	
	/**
	 * Gets a list of the Seasonal ProductWithAverageReviews.
	 * @return the list of ProductWithAverageReviews.
	 */
	public List<ProductWithAverageReview> getSeasonalProductsWithAverageReview() {
		return productRepository.getSeasonalProductsWithAverageReview();
	}
	
	/**
	 * Gets a Product from the Product's Id.
	 * @param productId the Id of the Product to retrieve.
	 * @return the Product or null.
	 */
	public Product getProductFromId(int productId){
		return productRepository.getProductFromId(productId);	
	}
	
	/**
	 * Gets a CurrentProduct from the Product's Id.
	 * @param productId the ID of the CurrentProduct to retrieve.
	 * @return the CurrentProduct or null.
	 */
	public CurrentProduct getCurrentProductFromId(int productId){
		return productRepository.getCurrentProductFromId(productId);	
	}
	
	/**
	 * Get the average review score for a Product.
	 * @param productId the Product's Id to get reviews for.
	 * @return null if no Reviews exist for the Product, the value if there are reviews.
	 */
	public Integer getAverageReviewForProductId(int productId) {
		return productRepository.getAverageReviewForProductId(productId);
	}

	public ArrayList<Product> getSubcatsProducts(String subcategory) {
		return productRepository.getSubcatsProducts(subcategory);
	}
}
