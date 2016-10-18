package projectx.controllers.helpers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Review;
import projectx.services.ReviewService;

@Named("reviews")
@RequestScoped
public class ReviewController implements Serializable{

	private static final long serialVersionUID = 2L;


	@Inject
	private ReviewService reviewService;
	
	public List<Review> getAllReviews(){
		return reviewService.getAllReviews();
	}
	
}
