package projectx.persistence.offline.database;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import projectx.persistence.entities.Category;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.Review;
import projectx.persistence.entities.SubCategory;
import projectx.persistence.entities.User;
import projectx.persistence.entities.UserLevel;


@Singleton
public class OfflineDB 
{
	private List<Product> products;
	private List<User> users;
	private List<Review> reviews;
	private List<Category> categories;
	private List<SubCategory> subcategories;
	
	public OfflineDB() {}
	
	@PostConstruct
	private void setupData() {
		setupProducts();
		setupUsers();
		setupReviews();
		setupCategories();
		setupSubCategories();
	}
	
	private void setupProducts() {
		products = new ArrayList<Product>();
		products.add(new Product(1,"Red Gnome 1", "This gnome is lovely", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(2, "Red Gnome 2", "Very generic gnome", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(3, "Red Gnome 3", "Bogstandard", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(4, "Red Gnome 4", "This is a stubbstandard gnome", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(5, "Red Gnome 5", "Red-hatted gnome", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(6, "Red Gnome 6", "Classic Gnome", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(7, "Red Gnome 7", "Usual red gnome with hat", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(8, "Red Gnome 8", "Classic red hat gnome", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(9, "Red Gnome 9", "The gnome of gnomes", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(10, "Red Gnome 10", "The one true gnome", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(11, "Red Gnome 11", "Large red hat gnome", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(12, "Red Gnome 12", "Your dream gnome", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product(13, "Red Gnome 13", "Classic gnome - medium size", 100, new BigDecimal(19.99), 10, 100, 1));	
	}
	
	private void setupUsers() {
		users = new ArrayList<User>();
		users.add(new User(1, "JSmithy", "password", "John", "Smith", UserLevel.ADMIN, "john.smith@email.com"));
		users.add(new User(2, "Bazza", "password", "Barry", "Smith", UserLevel.CUSTOMER, "barry.smith@email.com"));
		users.add(new User(3, "JaneMane", "password", "Jane", "Smith", UserLevel.CUSTOMER, "jane.smith@email.com"));
		users.add(new User(4, "Sallysaurus", "password", "Sally", "Smith", UserLevel.CUSTOMER, "sally.smith@email.com"));
		users.add(new User(5, "Stevie", "password", "Steve", "Smith", UserLevel.CUSTOMER, "steve.smith@email.com"));
	}
	
	private void setupReviews() {
		reviews = new ArrayList<Review>();
		reviews.add(new Review(1, 4.5f, "Pretty dank.", users.get(2), products.get(2)));
		reviews.add(new Review(2, 3.1f, "Pretty good.", users.get(3), products.get(3)));
		reviews.add(new Review(3, 2.0f, "Broke first night.", users.get(2), products.get(4)));
		reviews.add(new Review(4, 4.9f, "Pretty good.", users.get(4), products.get(8)));
		reviews.add(new Review(5, 5f, "Best. Purchase Ever!.", users.get(2), products.get(8)));
		reviews.add(new Review(6, 3.8f, "Pretty good.", users.get(3), products.get(8)));
		reviews.add(new Review(7, 4.2f, "Pretty good.", users.get(3), products.get(7)));
	}
	

	private void setupCategories(){
		categories = new ArrayList<Category>();
		categories.add(new Category(1, "Gnomes"));
		categories.add(new Category(2, "Electrical"));
		categories.add(new Category(3, "Oranaments"));
		categories.add(new Category(4, "Rakes and Hoes"));
		categories.add(new Category(5, "Water Features"));
		categories.add(new Category(6, "Furniture"));
		categories.add(new Category(7, "Maintenance"));
	}
	
	private void setupSubCategories(){
		subcategories = new ArrayList<SubCategory>();
		subcategories.add(new SubCategory(1, "Themed", 1));
		subcategories.add(new SubCategory(2, "Novelty", 1));
		subcategories.add(new SubCategory(3, "Classic", 1));
		subcategories.add(new SubCategory(4, "Gnome Care", 1));
		
		subcategories.add(new SubCategory(5, "Lighting", 2));
		subcategories.add(new SubCategory(6, "Heaters", 2));
		subcategories.add(new SubCategory(7, "Hot Tubs", 2));
		subcategories.add(new SubCategory(8, "BBQs", 2));
		subcategories.add(new SubCategory(9, "Misc", 2));
		
		subcategories.add(new SubCategory(10, "Animal", 3));
		subcategories.add(new SubCategory(11, "Wind Chimes", 3));
		subcategories.add(new SubCategory(12, "Weather Vanes", 3));
		subcategories.add(new SubCategory(13, "Pots", 3));
		
		subcategories.add(new SubCategory(14, "Rakes", 4));
		subcategories.add(new SubCategory(15, "Hoes", 4));
		subcategories.add(new SubCategory(16, "Spades and Forks", 4));
		subcategories.add(new SubCategory(17, "Trowels", 4));
		
		subcategories.add(new SubCategory(18, "Pumps", 5));
		subcategories.add(new SubCategory(19, "Ponds", 5));
		subcategories.add(new SubCategory(19, "Pipes", 5));
		subcategories.add(new SubCategory(19, "Fountains", 5));
		
		subcategories.add(new SubCategory(20, "Tables and Chairs", 6));
		subcategories.add(new SubCategory(21, "Benches", 6));
		subcategories.add(new SubCategory(22, "Hammocks", 6));
		subcategories.add(new SubCategory(23, "Swinging", 6));
		subcategories.add(new SubCategory(24, "Bird Houses", 6));
		
		subcategories.add(new SubCategory(25, "Mowers", 7));
		subcategories.add(new SubCategory(26, "Strimmers", 7));
		subcategories.add(new SubCategory(27, "Feed and Weed", 7));
		subcategories.add(new SubCategory(28, "Secateurs", 7));
	}

	// ----- PRODUCTS -----
	/**
	 * Returns a copy of the Products.
	 * @return copy of the Products ArrayList.
	 */
	public List<Product> getProducts(){
		return new ArrayList<Product>(products);
	}
	
	
	public Product getProductFromId(int productId){
		
		for (Product product : products){
			if(product.getId() == productId){
				return product;
			}
		}	
		return null;
	}
	
	// ----- END PRODUCTS -----
	
	// ----- REVIEWS -----
	
	/**
	 * Will return the average rating of a Product.
	 * @param productId the Product Id to check.
	 * @return null if no Reviews exist, the average score if present.
	 */
	public Integer getAverageReviewForProductId(int productId){
		
		// See if the Product actually exists.
		Product product = getProductFromId(productId);
		if(product == null){
			return null;
		}
			
		int reviewTotal = 0;
		int numberOfReviews = 0;
		
		for(Review review : reviews){
			if (review.getProduct().getId() == productId){
				numberOfReviews++;
				reviewTotal += review.getRating();
			}
		}
		
		if(numberOfReviews == 0){ // Also helps prevent divide by zero.
			return null;
		}
		
		return reviewTotal / numberOfReviews;
	}
	
	public List<Review> getSomeReviews(int n,int itemID){
		List<Review> reviewList = new ArrayList<Review>();
		for(int i = 0;i<reviews.size();i++){
			if(reviews.get(i).getProduct().getId()==itemID){
			reviewList.add(reviews.get(i));
			if(reviewList.size()==n){break;}
		}else{
			continue;
		}
		}
		
		return reviewList;
	}
	
//	public User getReviewerAuthor() {
//		return Review.getUser().getName();
//	}
	
	public List<Review> getReviews(){
		return new ArrayList<Review>(reviews);
	}
	
	// ----- END REVIEWS -----
	
	// ----- USERS -----
	
	/**
	 * Returns a copy of the Users.
	 * @return copy of the Users ArrayList.
	 */
	public List<User> getUsers(){
		return new ArrayList<User>(users);
	}
	
	/**
	 * Returns a Users name
	 * @return copy of the Users ArrayList.
	 */
//	public String getName(){
//		return User.getFirstname();
//	}

	

	
	
	// ----- END USERS -----
}
