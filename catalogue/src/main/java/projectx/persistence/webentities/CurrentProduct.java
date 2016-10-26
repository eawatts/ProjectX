package projectx.persistence.webentities;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.Review;

/**
 * A Session based Web Entity to hold information regarding the current Product, used to display a Product when switching between pages. Accessed via 'current_product'.
 * Composed of a ProductWithAverageReview, and a list of Reviews for the Product.
 */
@SessionScoped
@Named("current_product")
public class CurrentProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	private ProductWithAverageReview product;
	private List<Review> reviews;
	
	public CurrentProduct(){}
	
	public CurrentProduct(Product product, Integer averageReview, List<Review> reviews){
		this.product = new ProductWithAverageReview(product, averageReview);
		this.reviews = reviews;
	}
	
	/**
	 * Used to set the Current Product, when selecting another Product to view.
	 * @param currentProduct the Current Product to replace.
	 */
	public void setCurrentProduct(CurrentProduct currentProduct){
		this.product = new ProductWithAverageReview(currentProduct.getProduct(), currentProduct.getAverageReview());
		this.reviews = currentProduct.getReviews();
	}
	
	public Product getProduct() {
		return product.getProduct();
	}

	public void setProduct(Product product){
		this.product.setProduct(product);
	}
	
	public Integer getAverageReview() {
		return product.getAverageReview();
	}

	public void setAverageReview(Integer averageReview){
		this.product.setAverageReview(averageReview);
	}
	
	public List<Review> getReviews() {
		return reviews;
	}
	
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	/**
	 * Get the count of the reviews for the Current Product.
	 * @return
	 */
	public int getReviewsCount(){
		if(reviews == null){
			return 0;
		}
		return reviews.size();
	}
}
