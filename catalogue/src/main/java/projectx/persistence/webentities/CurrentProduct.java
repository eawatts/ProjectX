package projectx.persistence.webentities;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.Review;

@SessionScoped
@Named("current_product")
public class CurrentProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	private ProductWithAverageReview product;
	private List<Review> reviews;
	
	public CurrentProduct(){
		
	}
	
	public CurrentProduct(Product product, Integer averageReview, List<Review> reviews){
		this.product = new ProductWithAverageReview(product, averageReview);
		this.reviews = reviews;
	}
	
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
	
	public int getReviewsCount(){
		if(reviews == null){
			return 0;
		}
		return reviews.size();
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
