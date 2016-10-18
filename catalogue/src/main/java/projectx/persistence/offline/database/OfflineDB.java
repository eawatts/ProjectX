package projectx.persistence.offline.database;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Review;
import projectx.persistence.entities.User;
import projectx.persistence.entities.UserLevel;


@Singleton
public class OfflineDB 
{
	private List<Product> products;
	private List<User> users;
	private List<Review> reviews;
	
	public OfflineDB() {}
	
	@PostConstruct
	private void setupData() {
		setupProducts();
		setupUsers();
		setupReviews();
	}
	
	private void setupProducts() {
		products = new ArrayList<Product>();
		products.add(new Product("Red Gnome 1", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 2", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 3", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 4", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 5", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 6", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 7", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 8", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 9", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 10", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 11", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 12", 100, new BigDecimal(19.99), 10, 100, 1));
		products.add(new Product("Red Gnome 13", 100, new BigDecimal(19.99), 10, 100, 1));	
	}
	
	private void setupUsers() {
		users = new ArrayList<User>();
		users.add(new User(1, "username", "password", "John", "Smith", UserLevel.ADMIN, "john.smith@email.com"));
		users.add(new User(2, "username", "password", "Barry", "Smith", UserLevel.CUSTOMER, "barry.smith@email.com"));
		users.add(new User(3, "username", "password", "Jane", "Smith", UserLevel.CUSTOMER, "jane.smith@email.com"));
		users.add(new User(4, "username", "password", "Sally", "Smith", UserLevel.CUSTOMER, "sally.smith@email.com"));
		users.add(new User(5, "username", "password", "Steve", "Smith", UserLevel.CUSTOMER, "steve.smith@email.com"));
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
	
	/**
	 * Returns a copy of the Products.
	 * @return copy of the Products ArrayList.
	 */
	public List<Product> getProducts(){
		return new ArrayList<Product>(products);
	}
	
	/**
	 * Returns a copy of the Users.
	 * @return copy of the Users ArrayList.
	 */
	public List<User> getUsers(){
		return new ArrayList<User>(users);
	}
	
	/**
	 * Returns a copy of the Users.
	 * @return copy of the Users ArrayList.
	 */
	public List<Review> getReviews(){
		return new ArrayList<Review>(reviews);
	}
}
