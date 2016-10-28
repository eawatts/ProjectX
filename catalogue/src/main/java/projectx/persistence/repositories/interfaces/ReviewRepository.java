package projectx.persistence.repositories.interfaces;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.persistence.entities.Review;
import projectx.persistence.entities.User;

public interface ReviewRepository {
	
	public void persistReview(Review r);
	public void persistReviews(List<Review> r);
	public List<Review> findByUserId(int id);
	public List<Review> getReviews();
	public List<Review> getSomeReviews(int n, int itemID);
//	public User getReviewerAuthor();
}
