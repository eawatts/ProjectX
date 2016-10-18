package projectx.persistence.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.Review;
import projectx.persistence.offline.database.OfflineDB;
import projectx.persistence.repositories.interfaces.ReviewRepository;

@Stateless
@Default
public class ReviewRepositoryOffline implements ReviewRepository {
	
	@Inject
	private OfflineDB db;

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
		return db.getReviews();
	}
}
