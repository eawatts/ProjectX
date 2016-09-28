package projectx.assets;

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

@Entity
@Table(name = "Review")
public class Review {
		
		@Id
		@Column(name = "id", nullable = false)
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "rating", nullable = false)
		@NotNull
		private Long rating;
		
		@Column(name = "comment", length = 512)
		@Size (min = 2, max = 512)
		private String comment;	
		
		@ManyToOne
		@JoinColumn(name = "user_id", nullable = false)
		@NotNull
		private User reviewer;
		
		@ManyToOne
		@JoinColumn(name = "product_id", nullable = false)
		@NotNull
		private Product product;
		
		public Long getId() {
			return id;
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
		public Product getProduct() {
			return product;
		}
		
		//TODO Named Queries
//		@NamedQueries ({
//			@NamedQuery(name = "", query = "")
//		})
}
