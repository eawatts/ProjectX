package projectx.assets;

import javax.persistence.Entity;

@Entity
public class Review {

		
		private Long id;
		private Long rating;
		private String comment;
		private User reviewer;
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
		
}
