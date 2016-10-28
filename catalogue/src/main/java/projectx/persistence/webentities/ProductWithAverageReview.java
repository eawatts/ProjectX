package projectx.persistence.webentities;

import javax.enterprise.context.SessionScoped;

import projectx.persistence.entities.Product;

/**
 * A Session based Web Entity to hold information regarding a Product, and the average review score for the Product (calculated at request-time.)
 */
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

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getAverageReview() {
		return this.averageReview;
	}

	public void setAverageReview(Integer averageReview) {
		this.averageReview = averageReview;
	}
}
