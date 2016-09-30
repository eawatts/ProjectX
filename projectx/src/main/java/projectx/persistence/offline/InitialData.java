package projectx.persistence.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

import projectx.persistence.entities.Review;
import projectx.persistence.entities.User;

@Singleton
public class InitialData {

	private List<User> users;
	private List<Review> reviews;

	public InitialData() {
		populateData();
	}

	private void populateData() {
		users = new ArrayList<User>();
		users.add(new User());
	}

	public List<User> getUsers() {
		return users;
	}

	public void addUser(User user) {
		this.users.add(user);
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void addReview(Review review) {
		this.reviews.add(review);

	}

	public void persistReviews(List<Review> reviews) {
		this.reviews = reviews;

	}

	public List<Review> getReviews() {
		return reviews;
	}

	public List<Review> findReviewByUserId(int id) {
		List<Review> userReviews = new ArrayList<Review>();
		for (Review review : this.reviews) {
			if (review.getId() == id) {
				userReviews.add(review);
			}

		}
		return userReviews;
	}

}
