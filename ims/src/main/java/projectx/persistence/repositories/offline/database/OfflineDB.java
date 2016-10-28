package projectx.persistence.repositories.offline.database;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import projectx.persistence.entities.Category;
import projectx.persistence.entities.PaymentDetails;
import projectx.persistence.entities.Review;
import projectx.persistence.entities.Supplier;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.User;
import projectx.persistence.util.OrderState;
import projectx.persistence.util.UserLevel;

@Startup
@Singleton
public class OfflineDB {

	private List<User> users;
	private List<Review> reviews;
	private List<PaymentDetails> paymentDetails;
	private List<Category> categories;
	private List<Product> products;
	private ArrayList<Supplier> suppliers;
	private ArrayList<PurchaseOrder> purchaseOrders;
	private List<ProductsOrdered> productsOrdered;
	private ArrayList<String> p1imgs;

	@PostConstruct
	private void populateData() {
		users = new ArrayList<User>();
		users.add(new User(1, "hello", "password", "firstname", "lastname", UserLevel.CUSTOMER, "username@email.com"));
		users.add(new User(2, "alstock", "password", "Al", "Stock", UserLevel.ADMIN, "alstock@al.co.uk"));
		users.add(new User(2, "adam", "test", "Adam", "Dev", UserLevel.ADMIN, "email@me.com"));

		suppliers = new ArrayList<Supplier>();
		suppliers.add(new Supplier(1, "Gnomes gnomes gnomes", "1 Road Street", "The Town", "M56YH", "07463772819"));
		suppliers.add(
				new Supplier(2, "Rakes and Hoes Emporium", "33 Garden Street", "Cheshire", "SG147YH", "04463776419"));
		suppliers.add(new Supplier(3, "We Sell Stuff", "2 Made Up Street", "Barca", "BE39UI", "01320739921"));
		suppliers.add(new Supplier(4, "Gnomes R Us", "123 Fake Street", "MAdeUp Land", "TU59PI", "01193812204"));

		p1imgs = new ArrayList<String>();
		p1imgs.add("asd");
		p1imgs.add("asd");
		p1imgs.add("asd");
		p1imgs.add("asd");

		products = new ArrayList<Product>();

		products.add(new Product(1, "Product", 100, 5.00, 20, "a very shiny product", suppliers, p1imgs));
		products.add(new Product(2, "Another product", 150, 3.00, 20, "another very shiny product", suppliers, p1imgs));
		products.add(new Product(3, "Gnome", 200, 3.00, 20, "a Gnome", suppliers, p1imgs));
		products.add(new Product(4, "Another Gnome", 250, 3.00, 20, "another Gnome", suppliers, p1imgs));
		products.add(new Product(5, "Help", 300, 3.00, 20, "shiny product", suppliers, p1imgs));
		products.add(new Product(6, "Help Me", 350, 3.00, 20, "another shiny product", suppliers, p1imgs));

		paymentDetails = new ArrayList<PaymentDetails>();
		paymentDetails.add(new PaymentDetails(1,new User(1,"hello","password","firstname","lastname",UserLevel.CUSTOMER,"username@email.com"),"89012345","123456"));
		
		
		
		purchaseOrders= new ArrayList<PurchaseOrder>();
		purchaseOrders.add(new PurchaseOrder(1, suppliers.get(1), true, Date.valueOf("2016-09-13"), OrderState.ORDER_CLOSED, productsOrdered));
		
		PurchaseOrder purchaseOrder1=new PurchaseOrder(1, suppliers.get(1), true, Date.valueOf("2016-09-13"), OrderState.ORDER_CLOSED, productsOrdered);
		purchaseOrder1.addOrderedProducts(new ProductsOrdered(1,products.get(1),20,purchaseOrder1));
		purchaseOrder1.addOrderedProducts(new ProductsOrdered(2,products.get(2),10,purchaseOrder1));
		PurchaseOrder purchaseOrder2=new PurchaseOrder(2, suppliers.get(1), false, Date.valueOf("2016-02-16"), OrderState.PENDING_CONFIRMATION, productsOrdered);
		purchaseOrder2.addOrderedProducts(new ProductsOrdered(3,products.get(1),20,purchaseOrder2));
		purchaseOrder2.addOrderedProducts(new ProductsOrdered(4,products.get(5),10,purchaseOrder2));
		PurchaseOrder purchaseOrder3=new PurchaseOrder(3, suppliers.get(3), true, Date.valueOf("2016-10-15"), OrderState.PENDING_DELIVERY, productsOrdered);
		purchaseOrder3.addOrderedProducts(new ProductsOrdered(5,products.get(3),20,purchaseOrder3));
		purchaseOrder3.addOrderedProducts(new ProductsOrdered(6,products.get(5),10,purchaseOrder3));
		PurchaseOrder purchaseOrder4=new PurchaseOrder(4, suppliers.get(3), true, Date.valueOf("2016-08-16"), OrderState.DELIVERED, productsOrdered);
		purchaseOrder4.addOrderedProducts(new ProductsOrdered(7,products.get(4),20,purchaseOrder4));
		purchaseOrder4.addOrderedProducts(new ProductsOrdered(8,products.get(5),10,purchaseOrder4));
		paymentDetails.add(new PaymentDetails(1,
				new User(1, "hello", "password", "firstname", "lastname", UserLevel.CUSTOMER, "username@email.com"),
				"89012345", "123456"));

		purchaseOrders = new ArrayList<PurchaseOrder>();
		PurchaseOrder purchaseOrder1 = new PurchaseOrder(1, suppliers.get(1), true, Date.valueOf("2016-09-13"),
				OrderState.ORDER_CLOSED, productsOrdered);
		purchaseOrder1.addOrderedProducts(new ProductsOrdered(1, products.get(1), 20, purchaseOrder1));
		purchaseOrder1.addOrderedProducts(new ProductsOrdered(2, products.get(2), 10, purchaseOrder1));
		PurchaseOrder purchaseOrder2 = new PurchaseOrder(2, suppliers.get(1), false, Date.valueOf("2016-02-16"),
				OrderState.PENDING_CONFIRMATION, productsOrdered);
		purchaseOrder2.addOrderedProducts(new ProductsOrdered(3, products.get(1), 20, purchaseOrder2));
		purchaseOrder2.addOrderedProducts(new ProductsOrdered(4, products.get(5), 10, purchaseOrder2));
		PurchaseOrder purchaseOrder3 = new PurchaseOrder(3, suppliers.get(3), true, Date.valueOf("2016-10-15"),
				OrderState.PENDING_DELIVERY, productsOrdered);
		purchaseOrder3.addOrderedProducts(new ProductsOrdered(5, products.get(3), 20, purchaseOrder3));
		purchaseOrder3.addOrderedProducts(new ProductsOrdered(6, products.get(5), 10, purchaseOrder3));
		PurchaseOrder purchaseOrder4 = new PurchaseOrder(4, suppliers.get(3), true, Date.valueOf("2016-08-16"),
				OrderState.DELIVERED, productsOrdered);
		purchaseOrder4.addOrderedProducts(new ProductsOrdered(7, products.get(4), 20, purchaseOrder4));
		purchaseOrder4.addOrderedProducts(new ProductsOrdered(8, products.get(5), 10, purchaseOrder4));


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
	// LOGIN

	/**
	 * Will check with the Users to see if there is a match for a Username and
	 * Password.
	 * 
	 * @param username
	 *            the Username to check.
	 * @param password
	 *            the Password to check.
	 * @return null if no User is found, the User is there is a match.
	 */
	public User login(String username, String password) {
		for (User user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)
					&& user.getUserLevel().equals(UserLevel.ADMIN)) {
				return user;
			}
		}
		return null;
	}

	// CATEGORY

	public void addCategory(Category category) {
		categories.add(category);
	}

	public void updateCategory(Category category) {
		categories.remove(category);
		categories.add(category);
	}

	public Category findCategoryByName(String name) {
		for (Category c : categories) {
			if (c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}

	public Category findCategoryById(long id) {
		// TODO: Implement!!
		return null;
	}

	public List<Category> getCategories() {
		// TODO: Implement!!
		return null;
	}

	// USERS

	/**
	 * Get the offline Users.
	 * 
	 * @return an ArrayList of Users.
	 */
	public List<User> getUsers() {
		return new ArrayList<User>(this.users);
	}

	/**
	 * Add a User to the collection.
	 * 
	 * @param user
	 *            the User to add.
	 */
	public void persistUser(User user) {
		this.users.add(user);
	}

	/**
	 * Update the User in the collection.
	 * 
	 * @param user
	 *            the User to update.
	 */
	public void updateUser(User user) {
		int indexOfUser = this.users.indexOf(user);
		if (indexOfUser != -1) {
			this.users.remove(indexOfUser); // Easier just to remove them, then
											// individually update them.
		}
		this.users.add(user);
	}

	/**
	 * Add multiple Users to the collection.
	 * 
	 * @param users
	 *            the List of Users to add.
	 */
	public void persistUsers(List<User> users) {
		for (User user : this.users) {
			this.users.add(user);
		}
	}

	/**
	 * Find a specific User by their username.
	 * 
	 * @param username
	 *            the username to query.
	 * @return the User if found, null if not.
	 */
	public User findByUsername(String username) {
		for (User user : this.users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

	/**
	 * See if the password matches the User with the username.
	 * 
	 * @param username
	 *            the username to find the User.
	 * @param password
	 *            the password to check against the User's password.
	 * @return boolean value if there is a match.
	 */
	public boolean checkPassword(String username, String password) {
		User matchingUser = null;
		for (User user : this.users) {
			if (user.getUsername().equals(username)) {
				matchingUser = user;
				break;
			}
		}
		if (matchingUser == null) {
			return false;
		}
		return matchingUser.getPassword().equals(password);
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

	public void addProduct(Product p) {

		products.add(p);

	}

	public List<Product> getProducts() {
		return products;
	}

	public void updateProduct(Product products2) {
		products.remove(products2);
		products.add(products2);
	}

	public Product getProductByID(int productId) {
		for (Product p : products) {
			if (p.getId() == productId)
				return p;
		}
		return null;
	}

	public Product findProductByName(String name) {
		for (Product p : products) {
			if (p.getName().equals(name))
				return p;
		}
		return null;
	}

	// Supplier
	public void addSupplier(Supplier s) {
		suppliers.add(s);
	}

	public Supplier findBySupplierName(String name) {
		for (Supplier s : suppliers) {
			if (s.getName().equalsIgnoreCase(name)) {
				return s;
			}
		}
		return null;
	}

	public Supplier findBySupplierId(int id) {
		for (Supplier s : suppliers) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}

	public ArrayList<Supplier> getSuppliers() {
		return new ArrayList<Supplier>(this.suppliers);
	}

	public void updateSupplier(int id, String name, String addressLine1, String addressLine2, String postcode,
			String phone) {
		for (Supplier s : suppliers) {
			if (s.getId() == id) {
				s.setName(name);
				s.setAddressLine1(addressLine1);
				s.setAddressLine2(addressLine2);
				s.setPostcode(postcode);
				s.setPhone(phone);
			}
		}
	}


	//PurchaseOrder

	// PurchaseOrder
	// PurchaseOrder

	public PurchaseOrder getPurchaseOrderBySupplierID(String supplierID) {
		for (PurchaseOrder purchOrder : purchaseOrders) {
			if (purchOrder.getSupplier().equals(supplierID))
				return purchOrder;
		}
		return null;
	}

	public void addPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrders.add(purchaseOrder);
	}

	public PurchaseOrder getPurchaseOrderByOrderStatus(String orderStatus) {
		for (PurchaseOrder purchOrder : purchaseOrders) {
			if (purchOrder.getStatus().equals(orderStatus))
				return purchOrder;
		}
		return null;
	}

	public PurchaseOrder getPurchaseOrderById(String id) {
		for (PurchaseOrder purchOrder : purchaseOrders) {
			if (Integer.toString(purchOrder.getId()).equals(id))
				return purchOrder;
		}
		return null;
	}

	public ArrayList<PurchaseOrder> getPurchaseOrders() {
		return new ArrayList<PurchaseOrder>(this.purchaseOrders);
	}

	public void updatePurchaseOrders(PurchaseOrder purchaseOrder) {
		purchaseOrders.remove(purchaseOrder);
		purchaseOrders.add(purchaseOrder);
	}

	public List<Product> getLowStockProducts() {
		class MyComparator implements Comparator<Product> {

			@Override
			public int compare(Product product1, Product product2) {
				return new Integer(product1.getCurrentStock() - product1.getLowLimit())
						.compareTo(product2.getCurrentStock() - product2.getLowLimit());
			}
		}
		Collections.sort(products, new MyComparator());
		return products;
	}
}
