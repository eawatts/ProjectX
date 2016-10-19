package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import projectx.persistence.entities.Review;

@Named("review")
@RequestScoped
public class ReviewController implements Serializable {

	/**
	 * what is this?
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Review> getSomeReviews(){
		int number = 3;
		List<Review>=
		return null;
		
	}
}