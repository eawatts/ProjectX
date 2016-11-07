package projectx.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

@NamedQueries({
/*	@NamedQuery(name = Review.VIEW_ALL,
				query = "SELECT r FROM Review r"),
	@NamedQuery(name = Review.VEIW_USER_ID,
				query = "SELECT r.user_id FROM Review r"), 
	@NamedQuery(name = Review.FIND_BY_USER_ID,
				query = "SELECT r.user_id FROM Review r WHERE r.user_id = :user_id"),
	@NamedQuery(name = Review.PERSIST_REVIEW,
				query = ""),
	@NamedQuery(name = Review.PERSIST_REVIEWS,
				query = ""),*/
})

@Table(name = "review")
public class Review {
	
	public static final String PERSIST_REVIEW = "Review.persistReview";
	public static final String PERSIST_REVIEWS = "Review.persistReviews";
	public static final String VIEW_ALL = "Review.viewAll";
	public static final String VEIW_USER_ID = "Review.viewUserId";
	public static final String FIND_BY_USER_ID = "Review.findByUserId";

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "rating", nullable = false)
	@NotNull
	private Long rating;

	@Column(name = "comment", length = 512)
	@Size(min = 2, max = 512)
	private String comment;

	@ManyToOne
	@JoinColumn(name = "reviewer", nullable = false)
	@NotNull
	private User reviewer;

	@ManyToOne
	@JoinColumn(name = "product", nullable = false)
	@NotNull
	private Product product;

	public Review() {
	}
	
	public Review(Integer id, Long rating, String comment, User reviewer, Product product) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
		this.reviewer = reviewer;
		this.product = product;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getRating() {
		return rating;
	}

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

	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}	
}
