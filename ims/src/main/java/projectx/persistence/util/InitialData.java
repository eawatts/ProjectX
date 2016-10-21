package projectx.persistence.util;

import java.sql.Date;
import java.util.ArrayList;
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

@Startup
@Singleton
public class InitialData {

	private List<User> users;
	private List<Review> reviews;
	private List<PaymentDetails> paymentDetails;
	private List<Category> categories;
	private List<Product> products;
	private List<Supplier> suppliers;
	private List<PurchaseOrder> purchaseOrders;
	
	@PostConstruct
	private void populateData() {
		users = new ArrayList<User>();
		users.add(new User(1,"hello","password","firstname","lastname",UserLevel.CUSTOMER,"username@email.com"));
		users.add(new User(2,"alstock","password","Al","Stock",UserLevel.ADMIN,"alstock@al.co.uk"));
		
		products = new ArrayList<Product>();
		products.add(new Product(1,"product",300,5.00,20,"a very shiny product"));
		products.add(new Product(2,"Another product",300,3.00,20,"another very shiny product"));
		products.add(new Product(3,"Gnome",300,3.00,20,"a Gnome"));
		products.add(new Product(4,"Another Gnome",300,3.00,20,"another Gnome"));
		products.add(new Product(5,"Help",300,3.00,20,"shiny product"));
		products.add(new Product(6,"Help Me",300,3.00,20,"another shiny product"));
		
		paymentDetails = new ArrayList<PaymentDetails>();
		paymentDetails.add(new PaymentDetails(1,new User(1,"hello","password","firstname","lastname",UserLevel.CUSTOMER,"username@email.com"),"89012345","123456"));
		
		suppliers= new ArrayList<Supplier>();
		suppliers.add(new Supplier(1, "Gnomes gnomes gnomes", "1 Road Street", "The Town", "M56YH", "07463772819"));
		suppliers.add(new Supplier(2, "Rakes and Hoes Emporium", "33 Garden Street", "Cheshire", "SG147YH", "04463776419"));
		suppliers.add(new Supplier(3, "We Sell Stuff", "2 Made Up Street", "Barca", "BE39UI", "01320739921"));
		suppliers.add(new Supplier(4, "Gnomes R Us", "123 Fake Street", "MAdeUp Land", "TU59PI", "01193812204"));
		
		purchaseOrders= new ArrayList<PurchaseOrder>();
		PurchaseOrder purchaseOrder1=new PurchaseOrder(1, suppliers.get(1), true, Date.valueOf("2016-09-13"), OrderState.ORDER_CLOSED, purchasedProducts);
		purchaseOrder1.addOrderedProducts(new ProductsOrdered(1,products.get(1),20));
		purchaseOrder1.addOrderedProducts(new ProductsOrdered(2,products.get(2),10));
		PurchaseOrder purchaseOrder2=new PurchaseOrder(2, suppliers.get(1), false, Date.valueOf("2016-02-16"), OrderState.PENDING_CONFIRMATION, products);
		purchaseOrder2.addOrderedProducts(new ProductsOrdered(3,products.get(1),20));
		purchaseOrder2.addOrderedProducts(new ProductsOrdered(4,products.get(5),10));
		PurchaseOrder purchaseOrder3=ew PurchaseOrder(3, suppliers.get(3), true, Date.valueOf("2016-10-15"), OrderState.PENDING_DELIVERY, products));
		purchaseOrder3.addOrderedProducts(new ProductsOrdered(5,products.get(3),20));
		purchaseOrder3.addOrderedProducts(new ProductsOrdered(6,products.get(6),10));
		PurchaseOrder purchaseOrder4=new PurchaseOrder(4, suppliers.get(3), true, Date.valueOf("2016-08-16"), OrderState.DELIVERED, products));
		purchaseOrder4.addOrderedProducts(new ProductsOrdered(7,products.get(4),20));
		purchaseOrder4.addOrderedProducts(new ProductsOrdered(8,products.get(6),10));

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
	
	// CATEGORY
	
	public void addCategory(Category category){
		categories.add(category);
	}
	public void updateCategory(Category category){
		categories.remove(category);
		categories.add(category);
	}
	public Category findCategoryByName(String name){
		for(Category c:categories)
		{
			if(c.getName().equals(name)) {return c;}
		}
		return null;
	}
	public Category findCategoryById(long id){
		// TODO: Implement!!
		return null;
	}
	public List<Category> getCategories(){
		// TODO: Implement!!
		return null;
	}
	
	// USERS
	
	/**
	 * Get the offline Users.
	 * @return an ArrayList of Users.
	 */
	public List<User> getUsers(){
		return new ArrayList<User>(this.users);
	}
	
	/**
	 * Add a User to the collection.
	 * @param user the User to add.
	 */
	public void persistUser(User user){
		this.users.add(user);
	}
	
	/**
	 * Update the User in the collection.
	 * @param user the User to update.
	 */
	public void updateUser(User user){
		int indexOfUser = this.users.indexOf(user);
		if (indexOfUser != -1){
			this.users.remove(indexOfUser); // Easier just to remove them, then individually update them.
		}
		this.users.add(user);		
	}
	
	/**
	 * Add multiple Users to the collection.
	 * @param users the List of Users to add.
	 */
	public void persistUsers(List<User> users) {
		for(User user : this.users){
			this.users.add(user);
		}
	}
	
	/**
	 * Find a specific User by their username.
	 * @param username the username to query.
	 * @return the User if found, null if not.
	 */
	public User findByUsername(String username) {
		for (User user : this.users){
			if (user.getUsername().equals(username)){
				return user;
			}
		}
		return null;
	}

	/**
	 * See if the password matches the User with the username.
	 * @param username the username to find the User.
	 * @param password the password to check against the User's password.
	 * @return boolean value if there is a match.
	 */
	public boolean checkPassword(String username, String password) {
		User matchingUser = null;
		for (User user : this.users){
			if (user.getUsername().equals(username)){
				matchingUser = user;
				break;
			}
		}
		if (matchingUser == null){
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

	public void addProduct(Product p)
	{

		products.add(p);
		
	}

	public List<Product> getProducts()
	{
		return products;
	}

	public void updateProduct(Product products2)
	{
		products.remove(products2);
		products.add(products2);
	}

	public Product getProductByID(int productId)
	{
		for(Product p: products)
		{
			if( p.getId() == productId) return p;
		}
		return null;
	}

	public Product findProductByName(String name)
	{
		for(Product p: products)
		{
			if( p.getName().equals(name)) return p;
		}
		return null;
	}
	//Supplier
	public void addSupplier(Supplier s){
		suppliers.add(s);
	}
	public Supplier findBySupplierName(String name){
		for(Supplier s: suppliers){
			if(s.getName().equalsIgnoreCase(name)){
				return s;
			}
		}
		return null;
	}
	
	public Supplier findBySupplierId(int id){
		for(Supplier s: suppliers){
			if(s.getId()==id){
				return s;
			}
		}
		return null;
	}

	public ArrayList<Supplier> getSuppliers() {
		return new ArrayList<Supplier>(this.suppliers);
	}
	public void updateSupplier(Supplier supplier){
		int indexOfSupplier = this.suppliers.indexOf(supplier);
		if (indexOfSupplier != -1){
			this.suppliers.remove(indexOfSupplier); // Easier just to remove them, then individually update them.
		}
		this.suppliers.add(supplier);		
	}

	//PurchaseOrder
	//PurchaseOrder
	public PurchaseOrder getPurchaseOrderBySupplierID(String supplierID) {
		for(PurchaseOrder p: purchaseOrders)
		{
			if( p.getSupplier().equals(supplierID)) return p;
		}
		return null;
	}

	public void addPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrders.add(purchaseOrder);
	}

	public PurchaseOrder getPurchaseOrderByOrderStatus(String orderStatus) {
		for(PurchaseOrder p: purchaseOrders)
		{
			if( p.getStatus().equals(orderStatus)) return p;
		}
		return null;
	}

	public PurchaseOrder getPurchaseOrderById(String id) {
		for(PurchaseOrder p: purchaseOrders)
		{
			if(  Integer.toString(p.getId() ).equals(id)) return p;
		}
		return null;
	}

	public List<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}

	public void updatePurchaseOrders(PurchaseOrder purchaseOrder) {
		purchaseOrders.remove(purchaseOrder);
		purchaseOrders.add(purchaseOrder);
	}
	
	
	
	
}
