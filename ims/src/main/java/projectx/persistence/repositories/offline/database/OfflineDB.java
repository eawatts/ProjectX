package projectx.persistence.repositories.offline.database;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import projectx.persistence.entities.Category;
import projectx.persistence.entities.Notification;
import projectx.persistence.entities.PaymentDetails;
import projectx.persistence.entities.Review;
import projectx.persistence.entities.Supplier;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.User;
import projectx.persistence.util.NotificationType;
import projectx.persistence.util.OrderState;
import projectx.persistence.util.UserLevel;
import projectx.persistence.webentities.PurchaseOrderProduct;

@Startup
@Singleton
public class OfflineDB {

	private List<User> users;
	private List<Review> reviews;
	private List<PaymentDetails> paymentDetails;
	private List<Category> categories;
	private List<Product> products;
	private List<Notification> notifications;
	private ArrayList<Supplier> suppliers;
	private ArrayList<PurchaseOrder> purchaseOrders;
	private ArrayList<ProductsOrdered> productsOrdered;
	private ArrayList<String> p1imgs;
	
	

	@PostConstruct
	private void populateData() {
		users = new ArrayList<User>();
		users.add(new User(1, "hello", "password", "firstname", "lastname", UserLevel.CUSTOMER, "username@email.com"));
		users.add(new User(2, "alstock", "password", "Al", "Stock", UserLevel.ADMIN, "alstock@al.co.uk"));
		users.add(new User(2, "adam", "test", "Adam", "Dev", UserLevel.ADMIN, "email@me.com"));

		suppliers = new ArrayList<Supplier>();
		suppliers.add(new Supplier(1, "Gnomes gnomes gnomes", "1 Road Street", "The Town", "M56YH", "07463772819"));
		suppliers.add(new Supplier(2, "Rakes and Hoes Emporium", "33 Garden Street", "Cheshire", "SG147YH", "04463776419"));
		suppliers.add(new Supplier(3, "We Sell Stuff", "2 Made Up Street", "Barca", "BE39UI", "01320739921"));
		suppliers.add(new Supplier(4, "Gnomes R Us", "123 Fake Street", "MAdeUp Land", "TU59PI", "01193812204"));

		ArrayList<String> productImages1 = new ArrayList<String>();
		productImages1.add("img/Product Images/classic-gnome.png");
		ArrayList<String> productImages2 = new ArrayList<String>();
		productImages2.add("img/Product Images/sitting-gnome.png");
		ArrayList<String> productImages3 = new ArrayList<String>();
		productImages3.add("img/Product Images/lying-gnome.png");
		ArrayList<String> productImages4 = new ArrayList<String>();
		productImages4.add("img/Product Images/sleeping-gnome.png");
		ArrayList<String> productImages5 = new ArrayList<String>();
		productImages5.add("img/Product Images/gnomezilla.png");
		ArrayList<String> productImages6 = new ArrayList<String>();
		productImages6.add("img/Product Images/flashing-gnome.png");
		ArrayList<String> productImages7 = new ArrayList<String>();
		productImages7.add("img/Product Images/toilet-gnome.png");
		ArrayList<String> productImages8 = new ArrayList<String>();
		productImages8.add("img/Product Images/security-gnome.png");
		ArrayList<String> productImages9 = new ArrayList<String>();
		productImages9.add("img/Product Images/gameof-gnome.png");
		ArrayList<String> productImages10 = new ArrayList<String>();
		productImages10.add("img/Product Images/terminator-gnome.png");
		ArrayList<String> productImages11 = new ArrayList<String>();
		productImages11.add("img/Product Images/solider-gnome.png");
		ArrayList<String> productImages12 = new ArrayList<String>();
		productImages12.add("img/Product Images/santa-gnome.png");
		ArrayList<String> productImages13 = new ArrayList<String>();
		productImages13.add("img/Product Images/zombie-gnome.png");
		ArrayList<String> productImages14 = new ArrayList<String>();
		productImages14.add("img/Product Images/ornament-gnome.png");
		ArrayList<String> productImages15 = new ArrayList<String>();
		productImages15.add("img/Product Images/gnomehouse.png");
		ArrayList<String> productImages16 = new ArrayList<String>();
		productImages16.add("img/Product Images/gnome-cloth.png");
		ArrayList<String> productImages17 = new ArrayList<String>();
		productImages17.add("img/Product Images/gnome-spray.png");
		ArrayList<String> productImages18 = new ArrayList<String>();
		productImages18.add("img/Product Images/hedgehog-ornament.png");
		ArrayList<String> productImages19 = new ArrayList<String>();
		productImages19.add("img/Product Images/heron-ornament.png");
		ArrayList<String> productImages20 = new ArrayList<String>();
		productImages20.add("img/Product Images/lamb-ornament.png");
		ArrayList<String> productImages21 = new ArrayList<String>();
		productImages21.add("img/Product Images/black-wind-chime.png");
		ArrayList<String> productImages22 = new ArrayList<String>();
		productImages22.add("img/Product Images/silver-wind-chime.png");
		ArrayList<String> productImages23 = new ArrayList<String>();
		productImages23.add("img/Product Images/rooster-wind-chime.png");
		ArrayList<String> productImages24 = new ArrayList<String>();
		productImages24.add("img/Product Images/cooper-rooster-wether-vane.png");
		ArrayList<String> productImages25 = new ArrayList<String>();
		productImages25.add("img/Product Images/eagle-weather-vane.png");
		ArrayList<String> productImages26 = new ArrayList<String>();
		productImages26.add("img/Product Images/arrow-weather-vane.png");
		ArrayList<String> productImages27 = new ArrayList<String>();
		productImages27.add("img/Product Images/classic-pot.png");
		ArrayList<String> productImages28 = new ArrayList<String>();
		productImages28.add("img/Product Images/square-pot.png");
		ArrayList<String> productImages29 = new ArrayList<String>();
		productImages29.add("img/Product Images/pots-set.png");
		ArrayList<String> productImages30 = new ArrayList<String>();
		productImages30.add("img/Product Images/small-light.png");
		ArrayList<String> productImages31 = new ArrayList<String>();
		productImages31.add("img/Product Images/large-light.png");
		ArrayList<String> productImages32 = new ArrayList<String>();
		productImages32.add("img/Product Images/solar-light.png");
		ArrayList<String> productImages33 = new ArrayList<String>();
		productImages33.add("img/Product Images/wall-heater.png");
		ArrayList<String> productImages34 = new ArrayList<String>();
		productImages34.add("img/Product Images/wood-heater.png");
		ArrayList<String> productImages35 = new ArrayList<String>();
		productImages35.add("img/Product Images/patio-heater.png");
		ArrayList<String> productImages36 = new ArrayList<String>();
		productImages36.add("img/Product Images/small-hot-tub.png");
		ArrayList<String> productImages37 = new ArrayList<String>();
		productImages37.add("img/Product Images/large-hottub.png");
		ArrayList<String> productImages38 = new ArrayList<String>();
		productImages38.add("img/Product Images/round-bbq.png");
		ArrayList<String> productImages39 = new ArrayList<String>();
		productImages39.add("img/Product Images/large-grill.png");
		ArrayList<String> productImages40 = new ArrayList<String>();
		productImages40.add("img/Product Images/deluxe-grill.png");
		ArrayList<String> productImages41 = new ArrayList<String>();
		productImages41.add("img/Product Images/garden-extension.png");
		ArrayList<String> productImages42 = new ArrayList<String>();
		productImages42.add("img/Product Images/garden-plugs.png");
		ArrayList<String> productImages43 = new ArrayList<String>();
		productImages43.add("img/Product Images/small-rake.png");
		
		
		products = new ArrayList<Product>();
		products.add(new Product(1, "Classic Gnome", 20, 52.00, 50, "a classic garden gnome perfect for every garden", productImages1));
		products.add(new Product(2, "Seated Gnome", 26, 33.00, 20, "a classic gnome in the seated position", productImages2));
		products.add(new Product(3, "Laying Gnome", 23, 34.00, 30, "a classic gnome lying down", productImages3));
		products.add(new Product(4, "Sleeping Gnome", 25, 31.00, 20, "a classic gnome having a nap",productImages4));
		products.add(new Product(5, "Gnomezilla", 30, 32.00, 40, "Gnomes being devowered by the almighty godzilla", productImages5));
		products.add(new Product(6, "Flashing Gnome", 35, 34.00, 20, "a rude flashing gnome", productImages6));
		products.add(new Product(7, "Gnome on the loo", 10, 52.00, 15, "a gnome doing his business",  productImages7));
		products.add(new Product(8, "GnomeLand Security", 15, 34.00, 20, "a Gnomeland Security punned gnome", productImages8));
		products.add(new Product(9, "Game of Gnomes", 2, 31.00, 8, "a Gnome based on the popular tv show", productImages9));
		products.add(new Product(10, "Gnominator", 25, 34.00, 20, "if arnie was born a gnome",  productImages10));
		products.add(new Product(11, "Gnome Guard", 13, 32.00, 10, "Royal Gnome guard for the Gnome Queen",productImages11));
		products.add(new Product(12, "Santa", 35, 35.00, 50, "big, fat, jolly gnome", productImages12));
		products.add(new Product(13, "Zombie Gnome", 10, 51.00, 5, "a very shiny product",  productImages13));
		products.add(new Product(14, "Xmas tree ornament gnome", 22, 3.00, 20, "a gnome perfect for the christmas", productImages14));
		products.add(new Product(15, "Gnome home", 5, 32.00, 10, "a house for all of your gnome friends",  productImages15));
		products.add(new Product(16, "Cloth for your Gnome", 21, 3.00, 15, "a cloth to clean and dust your gnome friends", productImages16));
		products.add(new Product(17, "Gnome spray", 30, 13.00, 13, "shiny products require spraying regulary",  productImages17));
		products.add(new Product(18, "Hedgehog ornament", 31, 32.00, 20, "a hedgehog friend to add to your garden",  productImages18));
		products.add(new Product(19, "Heron Ornament", 10, 54.00, 20, "a heron friend to add to your garden", productImages19));
		products.add(new Product(20, "Lamb Ornament", 21, 31.00, 20, "another very shiny product", productImages20));
		products.add(new Product(21, "Black Wind Chime", 12, 22.00, 10, "a Wind Chime coloured in the tone known as black",  productImages21));
		products.add(new Product(22, "Silver Wind Chime", 2, 10.00, 15, "a metalic coloured wind chime",  productImages22));
		products.add(new Product(23, "Rooster Wind Chime", 30, 13.00, 20, "a wind chime adorned with a shiny rooster",  productImages23));
		products.add(new Product(24, "Rooster Weather Vane", 12, 13.00, 10, "another shiny weather vane product", productImages24));
		products.add(new Product(25, "Eagle Weather Vane", 100, 54.00, 20, "a weather vane with an eagle upon its top[t", productImages25));
		products.add(new Product(26, "Arrow Weather Vane", 15, 31.00, 10, "a weather vane with an arrow as a pointer",productImages26));
		products.add(new Product(27, "Classic Pot", 23, 10.00, 20, "a classic pot for the garden", productImages27));
		products.add(new Product(28, "Square Pot", 25, 20.00, 20, "a large square pot", productImages28));
		products.add(new Product(29, "Garden pot set", 15, 30.00, 20, "a set of different sized pots", productImages29));
		products.add(new Product(30, "Small Light", 17, 20.00, 20, "a small light to brighten up the darkness", productImages30));
		products.add(new Product(31, "Large Garden Light", 30, 30.00, 20, "a clasically styled large light source", productImages31));
		products.add(new Product(32, "Solar Light", 35, 35.00, 20, "a self charging garden light", productImages32));
		products.add(new Product(33, "Wall Heater", 3, 35.00, 20, "a heater that can grip the wall", productImages33));
		products.add(new Product(34, "Wood Heater", 2, 40.00, 15, "a out side heat source that can run on wood", productImages34));
		products.add(new Product(35, "Patio Heater", 35, 150.00, 20, "a large heater for the patio", productImages35));
		products.add(new Product(36, "Small Hot tub", 3, 300.00, 5, "a small hot tub for the garden", productImages36));
		products.add(new Product(37, "Large Hot tub", 12, 3.00, 10, "a large garden hot tub", productImages37));
		products.add(new Product(38, "Round BBQ", 3, 35.00, 20, "a samll round bbq for the garden", productImages38));
		products.add(new Product(39, "Large Grill", 13, 60.00, 20, "a shiny grill for all your meat needs", productImages39));
		products.add(new Product(40, "Deluxe Grill", 35, 100.00, 20, "a top of the range grill", productImages40));
		products.add(new Product(41, "Plug Extension", 3, 31.00, 20, "an extension coed for electrical garden items", productImages41));
		products.add(new Product(42, "Garden Plugs", 35, 34.00, 20, "Weather proof garden plugs for the outdorrs", productImages42));
		products.add(new Product(43, "Small Rake", 12, 12.00, 20, "a Small Garden Rake", productImages43));

		paymentDetails = new ArrayList<PaymentDetails>();
		paymentDetails.add(new PaymentDetails(1,
				new User(1, "hello", "password", "firstname", "lastname", UserLevel.CUSTOMER, "username@email.com"),
				"89012345", "123456"));
		paymentDetails.add(new PaymentDetails(1,
				new User(1, "hello", "password", "firstname", "lastname", UserLevel.CUSTOMER, "username@email.com"),
				"89012345", "123456"));
		/*
		productsOrdered = new ArrayList<ProductsOrdered>();
		productsOrdered.add(new ProductsOrdered());
		productsOrdered.add(new ProductsOrdered());

		purchaseOrders = new ArrayList<PurchaseOrder>();
		PurchaseOrder purchaseOrder1 = new PurchaseOrder(1, suppliers.get(1), true, Date.valueOf("2016-09-13"),
				OrderState.ORDER_CLOSED, productsOrdered);
		purchaseOrder1.addOrderedProducts(new ProductsOrdered(1, products.get(1), 20, purchaseOrder1,10.00));
		purchaseOrder1.addOrderedProducts(new ProductsOrdered(2, products.get(2), 10, purchaseOrder1,10.00));
		PurchaseOrder purchaseOrder2 = new PurchaseOrder(2, suppliers.get(1), false, Date.valueOf("2016-02-16"),
				OrderState.PENDING_CONFIRMATION, productsOrdered);
		purchaseOrder2.addOrderedProducts(new ProductsOrdered(3, products.get(1), 20, purchaseOrder2,10.00));
		purchaseOrder2.addOrderedProducts(new ProductsOrdered(4, products.get(5), 10, purchaseOrder2,10.00));
		PurchaseOrder purchaseOrder3 = new PurchaseOrder(3, suppliers.get(3), true, Date.valueOf("2016-10-15"),
				OrderState.PENDING_DELIVERY, productsOrdered);
		purchaseOrder3.addOrderedProducts(new ProductsOrdered(5, products.get(3), 20, purchaseOrder3,10.00));
		purchaseOrder3.addOrderedProducts(new ProductsOrdered(6, products.get(5), 10, purchaseOrder3,10.00));
		PurchaseOrder purchaseOrder4 = new PurchaseOrder(4, suppliers.get(3), true, Date.valueOf("2016-08-16"),
				OrderState.DELIVERED, productsOrdered);
		purchaseOrder4.addOrderedProducts(new ProductsOrdered(7, products.get(4), 20, purchaseOrder4,10.00));
		purchaseOrder4.addOrderedProducts(new ProductsOrdered(8, products.get(5), 10, purchaseOrder4,10.00));

		purchaseOrders.add(purchaseOrder1);
		purchaseOrders.add(purchaseOrder2);
		purchaseOrders.add(purchaseOrder3);
		purchaseOrders.add(purchaseOrder4);
		*/
		/*ArrayList<ProductsOrdered> productsOrdered = new ArrayList<ProductsOrdered>();
		ArrayList<PurchaseOrder> orders = new ArrayList<PurchaseOrder>();
		PurchaseOrder purchaseOrder1 = new PurchaseOrder(null, suppliers.get(1), true, Date.valueOf("2016-09-13"),
				OrderState.ORDER_CLOSED, productsOrdered);
		
		orders.add(purchaseOrder1);
		
		productsOrdered.add(new ProductsOrdered(null, products.get(1), 20, purchaseOrder1,10.00));
		productsOrdered.add(new ProductsOrdered(null, products.get(2), 10, purchaseOrder1,10.00));*/
		
		notifications = new ArrayList<Notification>();
		notifications.add(new Notification(1, NotificationType.PURCHASE_ORDER_ISSUE, "It seems a bit costly."));
		notifications.add(new Notification(2, NotificationType.PURCHASE_ORDER_ISSUE, "It's cheaper at the first place."));
		notifications.add(new Notification(3, NotificationType.PURCHASE_ORDER_ISSUE, "We are planning to stop selling these."));
		notifications.add(new Notification(4, NotificationType.PURCHASE_ORDER_ISSUE, "Double the about out Product 34."));
		notifications.add(new Notification(5, NotificationType.PURCHASE_ORDER_ISSUE, "Just resubmit this one Monday."));
		notifications.add(new Notification(6, NotificationType.WAREHOUSE_IDLE, "Half of the team are not doing anything."));
		notifications.add(new Notification(7, NotificationType.WAREHOUSE_IDLE, "Baz hasn't done any work all day."));
		notifications.add(new Notification(8, NotificationType.SAVE_ERROR, "Is the server down?"));
		notifications.add(new Notification(9, NotificationType.SAVE_ERROR, "Can't save the Purchase Order!"));
		notifications.add(new Notification(10, NotificationType.SAVE_ERROR, "Not sure what happened."));

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
		p.setId(products.get(products.size()-1).getId()+1);
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

	public PurchaseOrder getPurchaseOrderById(int id) {
		for (PurchaseOrder purchaseOrder : purchaseOrders) {
			if (purchaseOrder.getId()==id)
				return purchaseOrder;
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
		
		List<Product> orderedProducts = new ArrayList<Product>();
		
		for (Product product : new ArrayList<Product>(products)) {
			if(product.getCurrentStock() <= product.getLowLimit()){
				orderedProducts.add(product);
			}
		}
		
		class MyComparator implements Comparator<Product> {
			
			@Override
			public int compare(Product product1, Product product2) {
				return new Integer(product1.getCurrentStock() - product1.getLowLimit())
						.compareTo(product2.getCurrentStock() - product2.getLowLimit());
			}
		}
		Collections.sort(orderedProducts, new MyComparator());
		
		return orderedProducts;
	}

	// NOTIFICATIONS

	public List<Notification> getNotifications() {
		return new ArrayList<>(notifications);
	}

	public List<Notification> getNotificationsForType(NotificationType type) {
		List<Notification> matchingNotifications = new ArrayList<Notification>();
		for (Notification notification : notifications) {
			if(notification.getType() == type) {
				matchingNotifications.add(notification);
			}
		}
		return matchingNotifications;
	}
	
	public void dismissNotification(Notification notification) {
		notifications.remove(notification);
	}


	public List getSearchResults(String search, String searchList){
		List results;
		switch(searchList)
		{
			case "product":
			{
				results = new ArrayList<Product>();
				for(Product p: products)
				{
					if(p.getName().toLowerCase().contains(search.toLowerCase())|| Integer.toString(p.getId()).equals(search)) results.add(p);
				}
				break;
			}
			case "supplier":
			{
				results = new ArrayList<Supplier>();
				for(Supplier s: suppliers)
				{
					if(s.getName().toLowerCase().contains(search.toLowerCase())|| Integer.toString(s.getId()).equals(search)) results.add(s);
				}
				break;
			}
			case "purchase order":
			{
				results = new ArrayList<PurchaseOrder>();
				for(PurchaseOrder po: purchaseOrders)
				{
					if(Integer.toString(po.getId()).equals(search) || po.getSupplier().getName().equals(search)) results.add(po);
				}
				break;
			}
			default: return null;
		}
		
		
		return results;
	}

	public List<PurchaseOrderProduct> createPurchaseOrderEntry()
	{
		// TODO Auto-generated method stub
		return null;
	}

}


