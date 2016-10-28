package projectx.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Review;
import projectx.persistence.entities.User;
import projectx.persistence.repositories.interfaces.ReviewRepository;

@Stateless
public class ReviewService {

	@Inject
	private ReviewRepository reviewRepository;

	public List<Review> getAllReviews() {
		return reviewRepository.getReviews();
	}

	/**
	 * Returns a specific number of Reviews for a specific Product.
	 * 
	 * @param numberOfReviewsToRetrieve the number of reviews to retrieve for a Product.
	 * @param productId the Product's Id to get the reviews for.
	 * @return a list of Reviews for a Product.
	 */
	public List<Review> getSomeReviews(int numberOfReviewsToRetrieve, int productId) {
		return reviewRepository.getSomeReviews(numberOfReviewsToRetrieve, productId);
	}
}
