package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.persistence.entities.Review;
import projectx.persistence.repositories.ReviewRepository;

@Stateless
@Default
public class ReviewRepositoryOffline implements ReviewRepository {

	@Override
	public void persistReview(Review r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void persistReviews(List<Review> r) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Review> findByUserId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> getReviews() {
		// TODO Auto-generated method stub
		return null;
	}

}
