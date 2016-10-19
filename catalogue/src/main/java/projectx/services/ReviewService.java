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
	
	public List<Review> getAllReviews(){
		return reviewRepository.getReviews();
	}
	public List<Review> getSomeReviews(int n, int itemID){
		return reviewRepository.getSomeReviews(n, itemID);
	}
	
//	public User getReviewerAuthor() {
//		return reviewRepository.getReviewerAuthor();
//	}
}
