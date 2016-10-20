package projectx.persistence.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import junit.framework.Test;

@Entity
@NamedQueries(
	{
		@NamedQuery(name = Review.VIEW_ALL,	query = "SELECT r FROM Review r"),
		@NamedQuery(name = Review.VEIW_USER_ID,	query = "SELECT r.user_id FROM Review r"), 
		@NamedQuery(name = Review.FIND_BY_USER_ID, query = "SELECT r.user_id FROM Review r WHERE r.user_id = :user_id"),
		@NamedQuery(name = Review.PERSIST_REVIEW, query = ""),
		@NamedQuery(name = Review.PERSIST_REVIEWS, query = ""),
	}
)

@Table(name = "Review")
public class Review {
	
	public static final String PERSIST_REVIEW = "Review.persistReview";
	public static final String PERSIST_REVIEWS = "Review.persistReviews";
	public static final String VIEW_ALL = "Review.viewAll";
	public static final String VEIW_USER_ID = "Review.viewUserId";
	public static final String FIND_BY_USER_ID = "Review.findByUserId";

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "rating", nullable = false)
	@NotNull
	private float rating;

	@Column(name = "comment", length = 512)
	@Size(min = 2, max = 512)
	private String comment;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	@NotNull
	private User reviewer;

	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false)
	@NotNull
	private Product product;

	/**
	 * Review constructor
	 * 
	 * @param id
	 * @param rating
	 * @param comment
	 * @param reviewer
	 * @param product
	 */
	public Review(int id, float rating, String comment, User reviewer, Product product) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
		this.reviewer = reviewer;
		this.product = product;
	}

	/**
	 * returns user id 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * returns a rating value
	 * @return
	 */
	public float getRating() {
		return rating;
	}

	/**
	 * sets a rating value
	 * @param rating
	 */
	public void setRating(Long rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public User getReviewer() {
		return reviewer;
	}

	public Product getProduct() {
		return product;
	}

}
