package projectx.persistence.repositories;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.persistence.entities.Review;


@Stateless
@Default
public interface ReviewRepository {
	public void persistReview(Review r);

	public void persistReviews(List<Review> r);

	public List<Review> findByUserId(int id);

	public List<Review> getReviews();

}
