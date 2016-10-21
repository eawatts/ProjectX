package projectx.persistence.offline.database;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import projectx.persistence.entities.Address;
import projectx.persistence.entities.BankAccount;
import projectx.persistence.entities.Category;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.Review;
import projectx.persistence.entities.SubCategory;
import projectx.persistence.entities.User;
import projectx.persistence.entities.UserLevel;
import projectx.persistence.webentities.CurrentProduct;
import projectx.persistence.webentities.ProductWithAverageReview;

@Singleton
public class OfflineDB {
	private static final int NUMBER_OF_PRODUCTS_TO_RETRIEVE = 10;

	private List<Product> products;
	private List<User> users;
	private List<Review> reviews;
	private List<BankAccount> bankAccounts;
	private List<Address> addresses;
	private List<Category> categories;
	private List<SubCategory> subcategories;
	private List<SubCategory> subcategories1;
	private List<SubCategory> subcategories2;
	private List<SubCategory> subcategories3;
	private List<SubCategory> subcategories4;
	private List<SubCategory> subcategories5;
	private List<SubCategory> subcategories6;

	public OfflineDB() {
	}

	@PostConstruct
	public void setupData() {
		setupProducts();
		setupBankAccounts();
		setupAddresses();
		setupUsers();
		setupReviews();
		setupCategories();
	}

	private void setupProducts() {
		products = new ArrayList<Product>();
		products.add(new Product(1, "Red Gnome 1", "This gnome is lovely", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(2, "Red Gnome 2", "Very generic gnome", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(3, "Red Gnome 3", "Bogstandard", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(4, "Red Gnome 4", "This is a stubbstandard gnome", 100, new BigDecimal(19.99), 10, 100,
				1, "/img/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(5, "Red Gnome 5", "Red-hatted gnome", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(6, "Red Gnome 6", "Classic Gnome", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(7, "Red Gnome 7", "Usual red gnome with hat", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(8, "Red Gnome 8", "Classic red hat gnome", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(9, "Red Gnome 9", "The gnome of gnomes", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(10, "Red Gnome 10", "The one true gnome", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(11, "Red Gnome 11", "Large red hat gnome", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(12, "Red Gnome 12", "Your dream gnome", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(13, "Red Gnome 13", "Classic gnome - medium size", 100, new BigDecimal(19.99), 10, 100,
				1, "/products/gnomes/gnome_red-hat.png"));

	}

	private void setupBankAccounts() {
		bankAccounts = new ArrayList<BankAccount>();
		bankAccounts.add(new BankAccount(125685, 236595632));
		bankAccounts.add(new BankAccount(216543, 236595632));
		bankAccounts.add(new BankAccount(464246, 236595632));
		bankAccounts.add(new BankAccount(236594, 236595632));
		bankAccounts.add(new BankAccount(985654, 236595632));
		bankAccounts.add(new BankAccount(365254, 236595632));
		bankAccounts.add(new BankAccount(365254, 236595632));
		bankAccounts.add(new BankAccount(365254, 236595632));
		bankAccounts.add(new BankAccount(365254, 236595632));
		bankAccounts.add(new BankAccount(365254, 236595632));
	}

	private void setupAddresses() {
		addresses = new ArrayList<Address>();
		addresses.add(new Address(0, "Cherry House", "My Street", "Manchester", "M4 CTR"));
		addresses.add(new Address(1, "Cherry House", "My Street", "Manchester", "M4 CTR"));
		addresses.add(new Address(2, "Cherry House", "My Street", "Manchester", "M4 CTR"));
		addresses.add(new Address(3, "Cherry House", "My Street", "Manchester", "M4 CTR"));
		addresses.add(new Address(4, "Cherry House", "My Street", "Manchester", "M4 CTR"));
		addresses.add(new Address(5, "Cherry House", "My Street", "Manchester", "M4 CTR"));
	}

	private void setupUsers() {
		byte[] password = new byte[25];

		users = new ArrayList<User>();
		users.add(new User(1, "Mr", "Jonny", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password, UserLevel.ADMIN, null, null));
		users.add(new User(2, "Mr", "Dan", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password,	UserLevel.CUSTOMER, bankAccounts.get(2), addresses.get(2)));
		users.add(new User(3, "Mr", "Ben", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password,	UserLevel.CUSTOMER, bankAccounts.get(3), addresses.get(3)));
		users.add(new User(4, "Mr", "Chris", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password,	UserLevel.CUSTOMER, bankAccounts.get(4), addresses.get(4)));
		users.add(new User(5, "Mr", "Alan", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password,	UserLevel.CUSTOMER, bankAccounts.get(5), addresses.get(1)));
		users.add(new User(6, "Mrs", "Sally", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password,	UserLevel.CUSTOMER, bankAccounts.get(6), addresses.get(2)));
		users.add(new User(7, "Mrs", "Dorean", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password,	UserLevel.CUSTOMER, bankAccounts.get(2), addresses.get(0)));
		users.add(new User(8, "Mrs", "Jenny", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password,	UserLevel.CUSTOMER, bankAccounts.get(6), addresses.get(5)));
		users.add(new User(9, "Mrs", "Jolene", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password,	UserLevel.CUSTOMER, bankAccounts.get(3), addresses.get(4)));
		users.add(new User(10, "Miss", "Karen", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password, UserLevel.CUSTOMER, bankAccounts.get(2), addresses.get(2)));
		users.add(new User(11, "Miss", "Kate", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password, UserLevel.CUSTOMER, bankAccounts.get(3), addresses.get(1)));
		users.add(new User(12, "Mr", "Baz", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password, UserLevel.CUSTOMER, bankAccounts.get(1), addresses.get(0)));
		users.add(new User(13, "Mrs", "Greath", "Black", new Date(215455415), "jonny.black@email.com", "JBlack", password, UserLevel.CUSTOMER, bankAccounts.get(1), addresses.get(3)));
	}


	private void setupReviews() {
		reviews = new ArrayList<Review>();
		reviews.add(new Review(1, 4.5f, "Pretty dank.", users.get(1), products.get(2)));
		reviews.add(new Review(2, 3.1f, "Pretty good.", users.get(2), products.get(3)));
		reviews.add(new Review(3, 2.0f, "Broke first night.", users.get(3), products.get(4)));
		reviews.add(new Review(4, 4.9f, "Pretty good.", users.get(4), products.get(8)));
		reviews.add(new Review(5, 5f, "Best. Purchase Ever!.", users.get(5), products.get(8)));
		reviews.add(new Review(6, 3.8f, "Pretty good.", users.get(6), products.get(8)));
		reviews.add(new Review(7, 4.2f, "Worth the money..", users.get(7), products.get(1)));
		reviews.add(new Review(8, 4.2f, "Outstanding.", users.get(8), products.get(1)));
		reviews.add(new Review(9, 3f, "Pretty good.", users.get(9), products.get(1)));
		reviews.add(new Review(10, 1f, "Hated it.", users.get(10), products.get(1)));
		reviews.add(new Review(11, 1f, "Raining when it arrived.", users.get(11), products.get(1)));
		reviews.add(new Review(12, 5f, "My little Harry loves it.", users.get(12), products.get(1)));
		reviews.add(new Review(13, 3.8f, "Looks great next to the pond.", users.get(12), products.get(1)));
		reviews.add(new Review(14, 3.5f, "Pros: Price. Cons: Quality", users.get(8), products.get(1)));
		reviews.add(new Review(15, 3.9f, "Its my second one!", users.get(6), products.get(1)));
		reviews.add(new Review(16, 4.2f, "Absolute scorcher.", users.get(5), products.get(1)));
		reviews.add(new Review(17, 4.6f, "Perfect proportions.", users.get(1), products.get(1)));
		reviews.add(new Review(18, 0.5f, "Tripping hazard. Lorem ipsum dolor sit amet, eu sit dignissim conceptam, "
											+ "in dicta nullam vim, indoctum instructior eu quo. Duo ex vocent iuvaret"
											+ " vituperatoribus, nam ludus nostro eruditi an. Eam legere alterum cu."
											+ " Id solum rebum apeirian cum, sed in aliquando elaboraret."
											+ " Te qui vero dicant probatus.",
				users.get(10), products.get(1)));
	}

	private void setupCategories() {
		categories = new ArrayList<Category>();

		Category one = new Category(1, "Gnomes", subcategories);
		one.addSubCategory(new SubCategory(1, "Classic", one));
		one.addSubCategory(new SubCategory(2, "Novelty", one));
		one.addSubCategory(new SubCategory(3, "Themed", one));
		one.addSubCategory(new SubCategory(4, "Gnome Care", one));

		Category two = new Category(2, "Electrical", subcategories1);
		two.addSubCategory(new SubCategory(5, "Lighting", two));
		two.addSubCategory(new SubCategory(6, "Heaters", two));
		two.addSubCategory(new SubCategory(7, "Hot Tubs", two));
		two.addSubCategory(new SubCategory(8, "BBQs", two));
		two.addSubCategory(new SubCategory(9, "Misc", two));

		Category three = new Category(3, "Oranaments", subcategories2);
		three.addSubCategory(new SubCategory(10, "Animal", three));
		three.addSubCategory(new SubCategory(11, "Wind Chimes", three));
		three.addSubCategory(new SubCategory(12, "Weather Vanes", three));
		three.addSubCategory(new SubCategory(13, "Pots", three));

		Category four = new Category(4, "Rakes and Hoes", subcategories3);
		four.addSubCategory(new SubCategory(14, "Rakes", four));
		four.addSubCategory(new SubCategory(15, "Hoes", four));
		four.addSubCategory(new SubCategory(16, "Spades and Forks", four));
		four.addSubCategory(new SubCategory(17, "Trowels", four));

		Category five = new Category(5, "Water Features", subcategories4);
		five.addSubCategory(new SubCategory(18, "Pumps", five));
		five.addSubCategory(new SubCategory(19, "Ponds", five));
		five.addSubCategory(new SubCategory(19, "Pipes", five));
		five.addSubCategory(new SubCategory(19, "Fountains", five));

		Category six = new Category(6, "Furniture", subcategories5);
		six.addSubCategory(new SubCategory(20, "Tables and Chairs", six));
		six.addSubCategory(new SubCategory(21, "Benches", six));
		six.addSubCategory(new SubCategory(22, "Hammocks", six));
		six.addSubCategory(new SubCategory(23, "Swinging", six));
		six.addSubCategory(new SubCategory(24, "Bird Houses", six));

		Category seven = new Category(7, "Maintenance", subcategories6);
		seven.addSubCategory(new SubCategory(25, "Mowers", seven));
		seven.addSubCategory(new SubCategory(26, "Strimmers", seven));
		seven.addSubCategory(new SubCategory(27, "Feed and Weed", seven));
		seven.addSubCategory(new SubCategory(28, "Secateurs", seven));

		categories.add(one);
		categories.add(two);
		categories.add(three);
		categories.add(four);
		categories.add(five);
		categories.add(six);
		categories.add(seven);

	}

	// ----- PRODUCTS -----
	/**
	 * Returns a copy of the Products.
	 * 
	 * @return copy of the Products ArrayList.
	 */
	public List<Product> getProducts() {
		return new ArrayList<Product>(products);
	}

	public List<ProductWithAverageReview> getTopProductsWithAverageReview() {

		List<ProductWithAverageReview> productsWithAverageReview = new ArrayList<ProductWithAverageReview>();
		for (int i = 0; i < NUMBER_OF_PRODUCTS_TO_RETRIEVE; i++) {
			productsWithAverageReview.add(new ProductWithAverageReview(products.get(i),
					getAverageReviewForProductId(products.get(i).getId())));
		}
		return productsWithAverageReview;
	}

	public List<ProductWithAverageReview> getSeasonalProductsWithAverageReview() {

		List<ProductWithAverageReview> productsWithAverageReview = new ArrayList<ProductWithAverageReview>();
		for (int i = 0; i < NUMBER_OF_PRODUCTS_TO_RETRIEVE; i++) {
			productsWithAverageReview.add(new ProductWithAverageReview(products.get(i),
					getAverageReviewForProductId(products.get(i).getId())));
		}
		return productsWithAverageReview;
	}

	public CurrentProduct getCurrentProduct(int productId) {

		Product product = getProductFromId(productId);
		Integer averageReview = getAverageReviewForProductId(productId);
		List<Review> reviews = getReviewsForProductId(productId);

		return new CurrentProduct(product, averageReview, reviews);
	}

	public Product getProductFromId(int productId) {

		for (Product product : products) {
			if (product.getId() == productId) {
				return product;
			}
		}
		return null;
	}

	// ----- END PRODUCTS -----

	// ----- REVIEWS -----

	/**
	 * Will return the average rating of a Product.
	 * 
	 * @param productId
	 *            the Product Id to check.
	 * @return null if no Reviews exist, the average score if present.
	 */
	public Integer getAverageReviewForProductId(int productId) {

		// See if the Product actually exists.
		Product product = getProductFromId(productId);
		if (product == null) {
			return null;
		}

		int reviewTotal = 0;
		int numberOfReviews = 0;

		for (Review review : reviews) {
			if (review.getProduct().getId() == productId) {
				numberOfReviews++;
				reviewTotal += review.getRating();
			}
		}

		if (numberOfReviews == 0) { // Also helps prevent divide by zero.
			return null;
		}

		return reviewTotal / numberOfReviews;
	}

	public List<Review> getSomeReviews(int n, int itemID) {
		List<Review> reviewList = new ArrayList<Review>();
		for (int i = 0; i < reviews.size(); i++) {
			if (reviews.get(i).getProduct().getId() == itemID) {
				reviewList.add(reviews.get(i));
				if (reviewList.size() == n) {
					break;
				}
			} else {
				continue;
			}
		}
		return reviewList;
	}

	public List<Review> getReviews() {
		return new ArrayList<Review>(reviews);
	}

	public List<Review> getReviewsForProductId(int productId) {
		ArrayList<Review> reviewsForProduct = new ArrayList<Review>();
		for (Review review : reviews) {
			if (review.getProduct().getId() == productId) {
				reviewsForProduct.add(review);
			}
		}
		return reviewsForProduct;
	}

	// ----- END REVIEWS -----

	// ----- USERS -----

	/**
	 * Returns a copy of the Users.
	 * 
	 * @return copy of the Users ArrayList.
	 */
	public List<User> getUsers() {
		return new ArrayList<User>(users);
	}

	public void userAdd(User user) {
		users.add(user);

	}

	// ----- END USERS -----

	// ----- CATEGORIES -----

	public List<Category> getCategories() {
		return new ArrayList<Category>(categories);
	}

	public Category findByName(String name) {

		for (Category category : categories) {
			if (category.getName() == name) {
				return category;
			}
		}
		return null;
	}

	public Category findByid(int id) {

		for (Category category : categories) {
			if (category.getCategoryID() == id) {
				return category;
			}
		}
		return null;
	}

	// ----- END CATEGOIES -----

	// ----- SUB-CATEGORIES -----

	/**
	 * 
	 * @return list of categories
	 */

	public List<SubCategory> getSubCategories() {
		return new ArrayList<SubCategory>(subcategories);
	}

	public List<SubCategory> getSubCategories(Category category) {
		List<SubCategory> subcategoryList = new ArrayList<SubCategory>();
		for (SubCategory subcat : subcategories) {
			if (category.getCategoryID() == subcat.getCategory().getCategoryID()) {
				subcategoryList.add(subcat);
			}
		}
		return subcategoryList;
	}

	/**
	 * @param category
	 *            name
	 * @return Category
	 */

	public SubCategory findSubByName(String name) {

		for (SubCategory subcategory : subcategories) {
			if (subcategory.getName() == name) {
				return subcategory;
			}
		}
		return null;
	}

	public SubCategory findSubByid(int id) {

		for (SubCategory subcategory : subcategories) {
			if (subcategory.getSubCategoryID() == id) {
				return subcategory;
			}
		}
		return null;
	}
}
