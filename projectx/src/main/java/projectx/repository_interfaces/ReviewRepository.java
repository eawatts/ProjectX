package projectx.repository_interfaces;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.entities.Review;

@Stateless
@Default
public interface ReviewRepository {
	public void persistReview(Review r);

	public void persistReviews(List<Review> r);

	public Review findByUserId(int id);

	public List<Review> getReviews();

}
