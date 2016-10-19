package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Review;
import projectx.persistence.entities.User;
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
	/**
	 * in getSomeReviews the first int is the number of returned reviews 
	 * second int is the productID
	 * @return
	 */
	public List<Review> getSomeReviews(){
		return reviewService.getSomeReviews(1, 8);
	}
}
	