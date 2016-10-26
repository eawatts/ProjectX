package projectx.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.webentities.CurrentProduct;
import projectx.persistence.webentities.ProductWithAverageReview;
import projectx.services.ProductService;

/**
 * Used to manage the Product processes. Accessed via 'products'.
 */
@Named("products")
@RequestScoped
public class ProductController implements Serializable {

	private static final long serialVersionUID = 1L;
	private static String subcategory;

	@Inject
	private ProductService productService;

	@Inject
	private CurrentProduct currentProduct;

	/**
	 * Will view a Product via the Product Id, via setting the Current Product
	 * to one found.
	 * 
	 * @param productId the Id of the Product to view.
	 * @return the Product page.
	 */
	public String view(int productId) {
		currentProduct.setCurrentProduct(productService.getCurrentProductFromId(productId));
		return "catalogue_product";
	}

	/**
	 * Gets a list of the top Products, and the calculated average review.
	 * 
	 * @return a list of Products with their average review.
	 */
	public List<ProductWithAverageReview> getTopProductsWithAverageReview() {
		return productService.getTopProductsWithAverageReview();
	}

	/**
	 * Gets a list of the current seasonal Products, and the calculated average
	 * review.
	 * 
	 * @return a list of Products with their average review.
	 */
	public List<ProductWithAverageReview> getSeasonalProductsWithAverageReview() {
		return productService.getSeasonalProductsWithAverageReview();
	}

	/**
	 * Gets the Product with the matching Id.
	 * 
	 * @param id the Id of the Product to retrieve.
	 * @return the matching Product.
	 */
	public Product getProductFromId(int id) {
		return productService.getProductFromId(id);
	}

	/**
	 * Gets the average review (the average value of all its review scores) for
	 * a Product
	 * 
	 * @param productId the Id of the Product to find reviews for.
	 * @return null if no reviews are present, the average value if reviews are
	 *         present.
	 */
	public Integer getAverageReviewForProductId(int productId) {
		return productService.getAverageReviewForProductId(productId);
	}

	public ArrayList<Product> getSubcatsProducts() {
		ArrayList<Product> productList = productService.getSubcatsProducts(subcategory);
		return productList;
	}

	public String viewList(String subcat) {
		subcategory = subcat;
		return "catalogue_productlist";
	}

}
