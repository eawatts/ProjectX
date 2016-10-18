package projectx.persistence.webentities;

import javax.enterprise.context.SessionScoped;

import projectx.persistence.entities.Product;

@SessionScoped
public class ProductWithAverageReview {
	
	private Product product;
	
	private Integer averageReview;
	
	public ProductWithAverageReview(Product product, Integer averageReview) {
		this.product = product;
		this.averageReview = averageReview;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public Integer getAverageReview() {
		return this.averageReview;
	}
}
