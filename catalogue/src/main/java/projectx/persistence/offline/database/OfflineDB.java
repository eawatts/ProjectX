package projectx.persistence.offline.database;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import projectx.persistence.entities.Address;
import projectx.persistence.entities.Category;
import projectx.persistence.entities.Order;
import projectx.persistence.entities.OrderState;
import projectx.persistence.entities.OrderType;
import projectx.persistence.entities.PaymentDetails;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.Review;
import projectx.persistence.entities.SubCategory;
import projectx.persistence.entities.User;
import projectx.persistence.entities.UserLevel;
import projectx.persistence.webentities.BasketProduct;
import projectx.persistence.webentities.CurrentProduct;
import projectx.persistence.webentities.ProductWithAverageReview;

@Singleton
public class OfflineDB {
	private static final int NUMBER_OF_PRODUCTS_TO_RETRIEVE = 10;

	private List<Product> products;
	private List<User> users;
	private List<Review> reviews;
	private List<PaymentDetails> paymentDetails;
	private List<Address> addresses;
	private List<Order> orders;
	private List<Category> categories;
	private List<SubCategory> subcategories;
	private List<SubCategory> subcategories1;
	private List<SubCategory> subcategories2;
	private List<SubCategory> subcategories3;
	private List<SubCategory> subcategories4;
	private List<SubCategory> subcategories5;
	private List<SubCategory> subcategories6;

	private ArrayList<Product> classicgnomes;
	private ArrayList<Product> secatures;
	private ArrayList<Product> feednweed;
	private ArrayList<Product> birdhouses;
	private ArrayList<Product> noveltygnomes;
	private ArrayList<Product> themedgnomes;
	private ArrayList<Product> gnomecare;
	private ArrayList<Product> lighting;
	private ArrayList<Product> heaters;
	private ArrayList<Product> hottubs;
	private ArrayList<Product> bbqs;
	private ArrayList<Product> misc;
	private ArrayList<Product> animals;
	private ArrayList<Product> windchimes;
	private ArrayList<Product> weathervanes;
	private ArrayList<Product> pots;
	private ArrayList<Product> rakes;
	private ArrayList<Product> hoes;
	private ArrayList<Product> spadesnforks;
	private ArrayList<Product> trowels;
	private ArrayList<Product> pumps;
	private ArrayList<Product> ponds;
	private ArrayList<Product> fountains;
	private ArrayList<Product> pipes;
	private ArrayList<Product> tablesnchairs;
	private ArrayList<Product> benches;
	private ArrayList<Product> hammocks;
	private ArrayList<Product> swinging;
	private ArrayList<Product> mowers;
	private ArrayList<Product> strimmers;

	public OfflineDB() {
	}

	@PostConstruct
	public void setupData() {
		setupProducts();
		setupPaymentDetails();
		setupAddresses();
		setupUsers();
		setupReviews();
		setupOrders();
		setupCategoriesProducts();
		setupCategories();
	}

	private void setupProducts() {
		products = new ArrayList<Product>();
		products.add(new Product(1, "Red Gnome", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(19.99), 10, 100, 1, "/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(2, "Blue Gnome", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/bluegnome.jpg"));
		products.add(new Product(3, "Girl Gnome", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(19.99), 10, 100, 1, "/products/gnomes/girl-gnome.jpg"));
		products.add(new Product(4, "Sunflower Gnome",
				"Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(24.99), 10, 100, 1, "/products/gnomes/sunflowergnome.jpg"));
		products.add(new Product(5, "Flute Gnome", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(21.99),
				10, 100, 1, "/products/gnomes/flutegnome.jpg"));
		products.add(new Product(6, "Grandad Gnome", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomevIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(23.99), 10, 100, 1, "/products/gnomes/grandadgnome.jpg"));
		products.add(new Product(7, "Bird Feeding Gnome", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.",
				100, new BigDecimal(24.99), 10, 100, 1, "/products/gnomes/birdfeedinggnome.jpg"));
		products.add(new Product(8, "Hippie Gnome", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(22.99), 10, 100, 1,
				"/products/gnomes/hippiegnome.jpg"));
		products.add(new Product(9, "Golf Gnome", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(23.99), 10, 100, 1, "/products/gnomes/golfgnome.jpg"));
		products.add(new Product(10, "Cricket Gnome", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(23.99), 10,
				100, 1, "/products/gnomes/cricket.jpg"));
		products.add(new Product(11, "Gnomeland Security", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeEvery garden requires some sort of security In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(24.99), 10, 100, 1, "/products/gnomes/security.jpg"));
		products.add(new Product(12, "Ninja Gnome", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomePesky weeds will never see him coming In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(22.99),
				10, 100, 1, "/products/gnomes/ninjagnome.jpg"));
		products.add(new Product(13, "Game of Gnomes", "Red GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeRed GnomeOne Gnome to rule them all! In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(23.99), 10,
				100, 1, "/products/gnomes/gameofgnomes.jpg"));
		products.add(new Product(14, "Gnome and Juliet", "Love couple for your garden In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(27.99), 10,
				100, 1, "/products/gnomes/gnomeoandjuliet.jpg"));
		products.add(new Product(15, "Gnomezilla", "No Gnome is safe from this. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(24.99), 10, 100,
				1, "/products/gnomes/gnomezilla.jpg"));
		products.add(new Product(16, "Gnome Brush", "Specific brush to clean your perfect gnomes In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(9.99), 10, 100, 1, "/products/gnomes/brush.jpg"));
		products.add(new Product(17, "Gnome Cleaner", "Special made solution to clean your gnomes and protect them. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.",
				100, new BigDecimal(6.99), 10, 100, 1, "/products/gnomes/gnomecleaner.jpg"));
		products.add(new Product(18, "Gnome Protector", "Protect that special gnome in yourlife. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(6.99), 10, 100, 1, "/products/gnomes/gnomeprotector.jpg"));
		products.add(new Product(19, "4 garden lights", "for all those with a modern garden In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(29.99), 10, 100, 1, "/products/electrical/pillar.jpg"));
		products.add(new Product(20, "Lampost", "Adding some classical touches to your garden In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(39.99), 10, 100, 1, "/products/electrical/lampost.jpg"));
		products.add(new Product(21, "Flowerpot Light",
				"Try using these new flowerpots to see your flowers anytime of the day. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(39.99),
				10, 100, 1, "/products/electrical/flowerpotLight.jpg"));
		products.add(new Product(22, "Decking Lights", "Perfect to add the finishing touch to your decking. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(29.99), 10, 100, 1, "/products/electrical/deckinglight.jpg"));
		products.add(new Product(23, "Floor Patio Heater", "Perfect to add the finishing touch to your decking. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(119.99), 10, 100, 1, "/products/electrical/deckinglight.jpg"));
		products.add(new Product(24, "Table Top Heater", "A small outdoor heater to fit on any tabletop. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(59.99), 10, 100, 1, "/products/electrical/tabltopheater.jpg"));
		products.add(new Product(25, "Umbrela Patio heater",
				"a ring of heaters which will fit to the umbrella so everyone is kept warm. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(79.99), 10, 100, 1, "/products/electrical/parosealheater.jpg"));
		products.add(new Product(26, "Replacement Fillaments", "replacement fillimants for your patio heater. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(29.99), 10, 100, 1, "/products/electrical/replacementfillaments.jpg"));
		products.add(
				new Product(27, "Circular Hottub", "A circular hottub for those that dont have a big enough corner. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.",
						100, new BigDecimal(3999.99), 10, 100, 1, "/products/electrical/circlehottub.jpg"));
		products.add(new Product(28, "Inflatable Hottub",
				"A quick inflatable hottub without taking the space of a full hottub. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(599.99), 10,
				100, 1, "/products/electrical/inflatablehottub.jpg"));
		products.add(
				new Product(29, "Octagonal Hottub", "A hottub for those looking for something that is a bit different. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.",
						100, new BigDecimal(4999.99), 10, 100, 1, "/products/electrical/octagonalhottub.jpg"));
		products.add(new Product(30, "Rectangular Hottub", "A classic hottub with some modern features. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(3999.99), 10, 100, 1, "/products/electrical/rectanglehottub.jpg"));
		products.add(
				new Product(31, "Silver Gas BBQ", "A great looking barbecue that is easy to use and easy on the bank In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.",
						100, new BigDecimal(239.99), 10, 100, 1, "/products/electrical/silverBBQ.jpg"));
		products.add(new Product(32, "Red Gas BBQ", "Cook like a BBQ expert without the mess or flare ups In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(199.99), 10, 100, 1, "/products/electrical/redBBQ.jpg"));
		products.add(new Product(33, "Silver Pro BBQ", "A gas BBQ with everything you could ever need. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(509.99), 10, 100, 1, "/products/electrical/proBBQ.jpg"));
		products.add(
				new Product(34, "Blue Charcoal BBQ", "A great small easy to use barbecue for picnics or festivals. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.",
						100, new BigDecimal(69.99), 10, 100, 1, "/products/electrical/bbqblue.jpg"));
		products.add(new Product(35, "Single Garden Socket",
				"A garden post that can bring electricity to anywear in your garden In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(25.99), 10,
				100, 1, "/products/electrical/bbqblue.jpg"));
		products.add(new Product(36, "Double wall socket",
				"Add a socket to the outside of any walls where you need electrics In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(34.99), 10,
				100, 1, "/products/electrical/bbqblue.jpg"));
		products.add(new Product(37, "Single Plug Extension Lead", "when your current lead is just not long enough. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.",
				100, new BigDecimal(9.99), 10, 100, 1, "/products/electrical/bbqblue.jpg"));
		products.add(new Product(38, "Triple Plug Extension Lead", "Great for when holding any garden party. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(19.99), 10, 100, 1, "/products/electrical/bbqblue.jpg"));
		products.add(new Product(39, "Tortoise Shell Cat", "The cat has closed eyes and is curled up. In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(29.99), 10, 100, 1, "/products/ornimants/cat.jpg"));
		products.add(new Product(40, "King Charles Spaniel",
				"With brown patches over a white coat, big floppy ears and glossy black eyes.In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(29.99), 10, 100, 1, "/products/ornimants/kingspaniel.jpg"));
		products.add(new Product(41, "Black Bear Cub", "Highly detailed walking black bear cub.In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(29.99), 10, 100, 1, "/products/ornimants/bearcub.jpg"));
		products.add(new Product(42, "Tiger Cub", "Highly detailed sitting tiger cub.In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(29.99), 10,
				100, 1, "/products/ornimants/tiger.jpg"));
		products.add(new Product(43, "Heart Windchime", "A windchime made of metal heartsIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(24.99),
				10, 100, 1, "/products/ornimants/heartwindchimes.jpg"));
		products.add(new Product(44, "Wooden Windchime", "An old fashioned windchime In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(27.99), 10,
				100, 1, "/products/ornimants/woodenwindchime.jpg"));
		products.add(new Product(45, "Metal Windchime", "A modern windchimeIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(29.99), 10, 100, 1,
				"/products/ornimants/metalwindchime.jpg"));
		products.add(new Product(46, "Peakcock Windchime",
				"a metalic winchime with a large metal peakock holding it togetherIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(32.99), 10,
				100, 1, "/products/ornimants/peacockwindchime.jpg"));
		products.add(new Product(47, "Flying Pig Weathervane", "Well now pigs can flyIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(49.99), 10,
				100, 1, "/products/ornimants/flyingweathervane.jpg"));
		products.add(new Product(48, "HummingBird Weathervane", "a metalic silhouette of a hummingbird and a flowerIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.",
				100, new BigDecimal(45.99), 10, 100, 1, "/products/ornimants/hummingbirdweathervane.jpg"));
		products.add(new Product(49, "Owl Weathervane", "a metalic silhouette of a owlIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(45.99), 10,
				100, 1, "/products/ornimants/owlweathervane.jpg"));
		products.add(new Product(50, "Wine Weathervane", "For all those lovers of wineIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(49.99), 10,
				100, 1, "/products/ornimants/wineweathervane.jpg"));
		products.add(new Product(51, "Plastic Flowerpot", "Plastic flowerpots great for those starting outIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(9.99), 10, 100, 1, "/products/ornimants/plasticflowerpot.jpg"));
		products.add(new Product(52, "Ribbed Flowerpot", "Classic flowerpot that will be perfect in any gardenIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(19.99), 10, 100, 1, "/products/ornimants/ribbedflowerpot.jpg"));
		products.add(new Product(53, "Wall Hanging Flowerpot", "Flowerpots that need to be screwed to the wallIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(29.99), 10, 100, 1, "/products/ornimants/wallflowerpot.jpg"));
		products.add(
				new Product(54, "Wicker Flowerpot", "Black Wicker pots that will add a modern twist to your gardenIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.",
						100, new BigDecimal(24.99), 10, 100, 1, "/products/ornimants/wickerpot.jpg"));
		products.add(
				new Product(55, "Expanding Lawn Rake", "Lawn rake that will expand its head size depending on needIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.",
						100, new BigDecimal(14.99), 10, 100, 1, "/products/rakesandhoes/expandablerake.jpg"));
		products.add(new Product(56, "Soil Rake", "Keep borders in blooming good healthIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(14.99),
				10, 100, 1, "/products/rakesandhoes/rakestraight.jpg"));
		products.add(new Product(57, "Leaf Rake", "Perfect rake for those pesky leavesIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(19.99), 10,
				100, 1, "/products/rakesandhoes/rakespread.jpg"));
		products.add(new Product(58, "Hand Rake", "Perfect small rake for your allotmentIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(9.99),
				10, 100, 1, "/products/rakesandhoes/HandRake.jpg"));
		products.add(new Product(59, "Eye Hoe",
				"Classic digging hoe that millions of small farmers and gardeners around the world use every dayIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(18.99), 10, 100, 1, "/products/rakesandhoes/eyehoes.jpg"));
		products.add(new Product(60, "Hoe", "Ypur houe for everydayworkIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(18.99), 10, 100, 1,
				"/products/rakesandhoes/generalhoe.jpg"));
		products.add(new Product(61, "Onion Hoe", "Top quality hoe is a must for any vegetable enthusiastIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(18.99), 10, 100, 1, "/products/rakesandhoes/onionhoe.jpg"));
		products.add(new Product(62, "Warren Hoe",
				"Allows this hoe to be used for drilling seeds as well as cultivating and furrowingIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(18.99), 10, 100, 1, "/products/rakesandhoes/warrenhoe.jpg"));
		products.add(new Product(63, "Digging Spade", "Everyone needs a faithful garden spade this could be yoursIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(18.99), 10, 100, 1, "/products/rakesandhoes/spade.jpg"));
		products.add(new Product(64, "Border Spade", "Perfect to fix any bordersIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(19.99), 10, 100,
				1, "/products/rakesandhoes/borderspade.jpg"));
		products.add(new Product(65, "Border Fork", "Great for working on your bordersIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(24.99), 10,
				100, 1, "/products/rakesandhoes/fork.jpg"));
		products.add(new Product(66, "Hand Fork", "great for pottering arround in your flowerpotsIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(9.99), 10, 100, 1, "/products/rakesandhoes/handfork.jpg"));
		products.add(new Product(67, "Trowel", "Multipurpose trowel that can be used for anythingIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(22.99), 10, 100, 1, "/products/rakesandhoes/coppertrowel.jpg"));
		products.add(new Product(68, "Potting Trowel",
				"Holds more compost than a regular trowel, making it more efficient for potting.In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(23.99), 10, 100, 1, "/products/rakesandhoes/pottingtrowel.jpg"));
		products.add(new Product(69, "Planting Trowel", "Has great soil penetration for planting.In the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100,
				new BigDecimal(19.99), 10, 100, 1, "/products/rakesandhoes/plantingtrowel.jpg"));
		products.add(new Product(70, "Rock Trowel", "Perfect for troweling in the rockeryIn the beginning God created the heaven and the earth. And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.", 100, new BigDecimal(19.99),
				10, 100, 1, "/products/rakesandhoes/rocktrowel.jpg"));
		products.add(new Product(1, "Red Gnome", "This gnome is lovely with its bright red hat", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/gnome_red-hat.png"));
		products.add(new Product(2, "Blue Gnome", "Very generic blue hat gnome", 90, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/bluegnome.jpg"));
		products.add(new Product(3, "Girl Gnome", "Our first female gnome for those that have asked for it", 100, new BigDecimal(19.99), 10, 100, 1,
				"/products/gnomes/girl-gnome.jpg"));
		products.add(new Product(4, "Sunflower Gnome", "This is a stubbstandard gnome but most will forgive that for his sunflower", 80, new BigDecimal(24.99), 10, 100,
				1, "/products/gnomes/sunflowergnome.jpg"));
		products.add(new Product(5, "Flute Gnome", "Gnome ready to play into your heart", 89, new BigDecimal(21.99), 10, 100, 1,
				"/products/gnomes/flutegnome.jpg"));
		products.add(new Product(6, "Grandad Gnome", "Perfect reliable gnome who has seen it all", 99, new BigDecimal(23.99), 10, 100, 1,
				"/products/gnomes/grandadgnome.jpg"));
		products.add(new Product(7, "Bird Feeding Gnome", "Gnome feeding birds and willing to join you in the activity", 95, new BigDecimal(24.99), 10, 100, 1,
				"/products/gnomes/birdfeedinggnome.jpg"));
		products.add(new Product(8, "Hippie Gnome", "Gnome looking for peace.", 96, new BigDecimal(22.99), 10, 100, 1,
				"/products/gnomes/hippiegnome.jpg"));
		products.add(new Product(9, "Golf Gnome", "Hoping to hit a whole in one in your garden.", 65, new BigDecimal(23.99), 10, 100, 1,
				"/products/gnomes/golfgnome.jpg"));
		products.add(new Product(10, "Cricket Gnome", "Will easily hit you for four", 50, new BigDecimal(23.99), 10, 100, 1,
				"/products/gnomes/cricket.jpg"));
		products.add(new Product(11, "Gnomeland Security", "Every garden requires some sort of security", 44, new BigDecimal(24.99), 10, 100, 1,
				"/products/gnomes/security.jpg"));		
		products.add(new Product(12, "Ninja Gnome", "Pesky weeds will never see him coming", 30, new BigDecimal(22.99), 10, 100, 1,
				"/products/gnomes/ninjagnome.jpg"));
		products.add(new Product(13, "Game of Gnomes", "One Gnome to rule them all!", 20, new BigDecimal(23.99), 10, 100,
				1, "/products/gnomes/gameofgnomes.jpg"));
		products.add(new Product(14, "Gnome and Juliet", "Love couple for your garden", 10, new BigDecimal(27.99), 10, 100,
				1, "/products/gnomes/gnomeoandjuliet.jpg"));
		products.add(new Product(15, "Gnomezilla", "No Gnome is safe from this.", 34, new BigDecimal(24.99), 10, 100,
				1, "/products/gnomes/gnomezilla.jpg"));
		products.add(new Product(16, "Gnome Brush", "Specific brush to clean your perfect gnomes", 87, new BigDecimal(9.99), 10, 100,
				1, "/products/gnomes/brush.jpg"));		
		products.add(new Product(17, "Gnome Cleaner", "Special made solution to clean your gnomes and protect them.", 65, new BigDecimal(6.99), 10, 100,
				1, "/products/gnomes/gnomecleaner.jpg"));
		products.add(new Product(18, "Gnome Protector", "Protect that special gnome in yourlife.", 55, new BigDecimal(6.99), 10, 100,
				1, "/products/gnomes/gnomeprotector.jpg"));
		products.add(new Product(19, "4 garden lights", "for all those with a modern garden", 34, new BigDecimal(29.99), 10, 100,
				1, "/products/electrical/pillar.jpg"));
		products.add(new Product(20, "Lampost", "Adding some classical touches to your garden", 78, new BigDecimal(39.99), 10, 100,
				1, "/products/electrical/lampost.jpg"));
		products.add(new Product(21, "Flowerpot Light", "Try using these new flowerpots to see your flowers anytime of the day.", 98, new BigDecimal(39.99), 10, 100,
				1, "/products/electrical/flowerpotLight.jpg"));
		products.add(new Product(22, "Decking Lights", "Perfect to add the finishing touch to your decking.", 65, new BigDecimal(29.99), 10, 100,
				1, "/products/electrical/deckinglight.jpg"));
		products.add(new Product(23, "Floor Patio Heater", "Perfect to add the finishing touch to your decking.", 5, new BigDecimal(119.99), 5, 50,
				1, "/products/electrical/patioheater.jpg"));
		products.add(new Product(24, "Table Top Heater", "A small outdoor heater to fit on any tabletop.", 9, new BigDecimal(59.99), 5, 50,
				1, "/products/electrical/tabltopheater.jpg"));
		products.add(new Product(25, "Umbrela Patio heater", "a ring of heaters which will fit to the umbrella so everyone is kept warm.", 44, new BigDecimal(79.99), 5, 50,
				1, "/products/electrical/parosealheater.jpg"));
		products.add(new Product(26, "Replacement Fillaments", "replacement fillimants for your patio heater.", 78, new BigDecimal(29.99), 10, 100,
				1, "/products/electrical/replacementfillaments.jpg"));		
		products.add(new Product(27, "Circular Hottub", "A circular hottub for those that dont have a big enough corner.", 5, new BigDecimal(3999.99), 2, 10,
				1, "/products/electrical/circlehottub.jpg"));
		products.add(new Product(28, "Inflatable Hottub", "A quick inflatable hottub without taking the space of a full hottub.", 34, new BigDecimal(599.99), 4, 40,
				1, "/products/electrical/inflatablehottub.jpg"));
		products.add(new Product(29, "Octagonal Hottub", "A hottub for those looking for something that is a bit different.", 2, new BigDecimal(4999.99), 2, 10,
				1, "/products/electrical/octagonalhottub.jpg"));
		products.add(new Product(30, "Rectangular Hottub", "A classic hottub with some modern features.", 4, new BigDecimal(3999.99), 2, 10,
				1, "/products/electrical/rectanglehottub.jpg"));
		products.add(new Product(31, "Silver Gas BBQ", "A great looking barbecue that is easy to use and easy on the bank", 34, new BigDecimal(239.99), 5, 60,
				1, "/products/electrical/silverBBQ.jpg"));
		products.add(new Product(32, "Red Gas BBQ", "Cook like a BBQ expert without the mess or flare ups", 23, new BigDecimal(199.99), 5, 60,
				1, "/products/electrical/redBBQ.jpg"));
		products.add(new Product(33, "Silver Pro BBQ", "A gas BBQ with everything you could ever need.", 3, new BigDecimal(509.99), 5, 50,
				1, "/products/electrical/proBBQ.jpg"));
		products.add(new Product(34, "Blue Charcoal BBQ", "A great small easy to use barbecue for picnics or festivals.", 40, new BigDecimal(69.99), 5, 70,
				1, "/products/electrical/bbqblue.jpg"));
		products.add(new Product(35, "Single Garden Socket", "A garden post that can bring electricity to anywear in your garden", 90, new BigDecimal(25.99), 10, 100,
				1, "/products/electrical/bbqblue.jpg"));
		products.add(new Product(36, "Double wall socket", "Add a socket to the outside of any walls where you need electrics", 76, new BigDecimal(34.99), 10, 100,
				1, "/products/electrical/bbqblue.jpg"));
		products.add(new Product(37, "Single Plug Extension Lead", "when your current lead is just not long enough.", 85, new BigDecimal(9.99), 10, 100,
				1, "/products/electrical/bbqblue.jpg"));
		products.add(new Product(38, "Triple Plug Extension Lead", "Great for when holding any garden party.", 88, new BigDecimal(19.99), 10, 100,
				1, "/products/electrical/bbqblue.jpg"));
		products.add(new Product(39, "Tortoise Shell Cat", "The cat has closed eyes and is curled up.", 75, new BigDecimal(29.99), 10, 100,
				1, "/products/ornimants/cat.jpg"));
		products.add(new Product(40, "King Charles Spaniel", "With brown patches over a white coat, big floppy ears and glossy black eyes.", 9, new BigDecimal(29.99), 10, 100,
				1, "/products/ornimants/kingspaniel.jpg"));
		products.add(new Product(41, "Black Bear Cub", "Highly detailed walking black bear cub.", 45, new BigDecimal(29.99), 10, 100,
				1, "/products/ornimants/bearcub.jpg"));		
		products.add(new Product(42, "Tiger Cub", "Highly detailed sitting tiger cub.", 34, new BigDecimal(29.99), 10, 100,
				1, "/products/ornimants/tiger.jpg"));
		products.add(new Product(43, "Heart Windchime", "A windchime made of metal hearts", 80, new BigDecimal(24.99), 10, 100,
				1, "/products/ornimants/heartwindchimes.jpg"));
		products.add(new Product(44, "Wooden Windchime", "An old fashioned windchime", 96, new BigDecimal(27.99), 10, 100,
				1, "/products/ornimants/woodenwindchime.jpg"));
		products.add(new Product(45, "Metal Windchime", "A modern windchime", 65, new BigDecimal(29.99), 10, 100,
				1, "/products/ornimants/metalwindchime.jpg"));
		products.add(new Product(46, "Peakcock Windchime", "a metalic winchime with a large metal peakock holding it together", 34, new BigDecimal(32.99), 10, 100,
				1, "/products/ornimants/peacockwindchime.jpg"));
		products.add(new Product(47, "Flying Pig Weathervane", "Well now pigs can fly", 5, new BigDecimal(49.99), 10, 100,
				1, "/products/ornimants/flyingweathervane.jpg"));
		products.add(new Product(48, "HummingBird Weathervane", "a metalic silhouette of a hummingbird and a flower", 9, new BigDecimal(45.99), 10, 100,
				1, "/products/ornimants/hummingbirdweathervane.jpg"));
		products.add(new Product(49, "Owl Weathervane", "a metalic silhouette of a owl", 24, new BigDecimal(45.99), 10, 100,
				1, "/products/ornimants/owlweathervane.jpg"));
		products.add(new Product(50, "Wine Weathervane", "For all those lovers of wine", 36, new BigDecimal(49.99), 10, 100,
				1, "/products/ornimants/wineweathervane.jpg"));
		products.add(new Product(51, "Plastic Flowerpot", "Plastic flowerpots great for those starting out", 89, new BigDecimal(9.99), 10, 100,
				1, "/products/ornimants/plasticflowerpot.jpg"));
		products.add(new Product(52, "Ribbed Flowerpot", "Classic flowerpot that will be perfect in any garden", 56, new BigDecimal(19.99), 10, 100,
				1, "/products/ornimants/ribbedflowerpot.jpg"));
		products.add(new Product(53, "Wall Hanging Flowerpot", "Flowerpots that need to be screwed to the wall", 98, new BigDecimal(29.99), 10, 100,
				1, "/products/ornimants/wallflowerpot.jpg"));
		products.add(new Product(54, "Wicker Flowerpot", "Black Wicker pots that will add a modern twist to your garden", 90, new BigDecimal(24.99), 10, 100,
				1, "/products/ornimants/wickerpot.jpg"));
		products.add(new Product(55, "Expanding Lawn Rake", "Lawn rake that will expand its head size depending on need", 56, new BigDecimal(14.99), 10, 100,
				1, "/products/rakesandhoes/expandablerake.jpg"));
		products.add(new Product(56, "Soil Rake", "Keep borders in blooming good health", 45, new BigDecimal(14.99), 10, 100,
				1, "/products/rakesandhoes/rakestraight.jpg"));
		products.add(new Product(57, "Leaf Rake", "Perfect rake for those pesky leaves", 34, new BigDecimal(19.99), 10, 100,
				1, "/products/rakesandhoes/rakespread.jpg"));
		products.add(new Product(58, "Hand Rake", "Perfect small rake for your allotment", 67, new BigDecimal(9.99), 10, 100,
				1, "/products/rakesandhoes/HandRake.jpg"));
		products.add(new Product(59, "Eye Hoe", "Classic digging hoe that millions of small farmers and gardeners around the world use every day", 90, new BigDecimal(18.99), 10, 100,
				1, "/products/rakesandhoes/eyehoes.jpg"));
		products.add(new Product(60, "Hoe", "Your hoe for every day work", 57, new BigDecimal(18.99), 10, 100,
				1, "/products/rakesandhoes/generalhoe.jpg"));
		products.add(new Product(61, "Onion Hoe", "Top quality hoe is a must for any vegetable enthusiast", 78, new BigDecimal(18.99), 10, 100,
				1, "/products/rakesandhoes/onionhoe.jpg"));
		products.add(new Product(62, "Warren Hoe", "Allows this hoe to be used for drilling seeds as well as cultivating and furrowing", 98, new BigDecimal(18.99), 10, 100,
				1, "/products/rakesandhoes/warrenhoe.jpg"));
		products.add(new Product(63, "Digging Spade", "Everyone needs a faithful garden spade this could be yours", 59, new BigDecimal(18.99), 10, 100,
				1, "/products/rakesandhoes/spade.jpg"));
		products.add(new Product(64, "Border Spade", "Perfect to fix any borders", 76, new BigDecimal(19.99), 10, 100,
				1, "/products/rakesandhoes/borderspade.jpg"));
		products.add(new Product(65, "Border Fork", "Great for working on your borders", 45, new BigDecimal(24.99), 10, 100,
				1, "/products/rakesandhoes/fork.jpg"));
		products.add(new Product(66, "Hand Fork", "great for pottering arround in your flowerpots", 98, new BigDecimal(9.99), 10, 100,
				1, "/products/rakesandhoes/handfork.jpg"));
		products.add(new Product(67, "Trowel", "Multipurpose trowel that can be used for anything", 56, new BigDecimal(22.99), 10, 100,
				1, "/products/rakesandhoes/coppertrowel.jpg"));
		products.add(new Product(68, "Potting Trowel", "Holds more compost than a regular trowel, making it more efficient for potting.", 65, new BigDecimal(23.99), 10, 100,
				1, "/products/rakesandhoes/pottingtrowel.jpg"));
		products.add(new Product(69, "Planting Trowel", "Has great soil penetration for planting.", 76, new BigDecimal(19.99), 10, 100,
				1, "/products/rakesandhoes/plantingtrowel.jpg"));
		products.add(new Product(70, "Rock Trowel", "Perfect for troweling in the rockery", 45, new BigDecimal(19.99), 10, 100,
				1, "/products/rakesandhoes/rocktrowel.jpg"));
		products.add(new Product(71, "Small Submersable Pump", "1500 Litres Per Hour pump perfect for small pond", 4, new BigDecimal(49.99), 10, 100,
				1, "/products/waterfeatures/smallpondpump.gif"));	
		products.add(new Product(72, "Large Submersable Pump", "13000 Litres Per Hour pump perfect for any pond", 89, new BigDecimal(89.99), 10, 100,
				1, "/products/waterfeatures/largepondpump.jpg"));				
		products.add(new Product(73, "Hand Pump Black", "Add an old fashioned pump to your garden", 87, new BigDecimal(69.99), 10, 100,
				1, "/products/waterfeatures/handpump.jpg"));	
		products.add(new Product(74, "Swimmingpool pump", "Perfect pump for a swimmingpool or your Hottub", 67, new BigDecimal(39.99), 10, 100,
				1, "/products/waterfeatures/swimmingpool.jpg"));
		products.add(new Product(75, "Planter Pond", "Perfect mix of a planter and a pond", 56, new BigDecimal(309.99), 10, 100,
				1, "/products/waterfeatures/planterpond.jpg"));
		products.add(new Product(76, "Wooden Koi Pond", "Fish can love this pond", 58, new BigDecimal(209.99), 10, 100,
				1, "/products/waterfeatures/woodenkoipond.png"));
		products.add(new Product(77, "Pond Liner", "50m Pond linear so you can buidl your pond", 78, new BigDecimal(39.99), 10, 100,
				1, "/products/waterfeatures/pondliner.png"));
		products.add(new Product(78, "Pond Underlay", "50m underlay to protect your pond linear from rips.", 86, new BigDecimal(34.99), 10, 100,
				1, "/products/waterfeatures/underlayroll.png"));
		products.add(new Product(79, "Hozelock", "An ultra-light, anti-kink and anti-twisting hose.", 89, new BigDecimal(34.99), 10, 100,
				1, "/products/waterfeatures/hoselock.jpg"));
		products.add(new Product(80, "50m Garden Hose", "Additional or replacement hosepip.", 45, new BigDecimal(34.99), 10, 100,
				1, "/products/waterfeatures/hosepipegreen.jpg"));
		products.add(new Product(81, "50m Green hose", "50m of green hose for any garden need.", 67, new BigDecimal(34.99), 10, 100,
				1, "/products/waterfeatures/greenhose.gif"));
		products.add(new Product(82, "50m Ribbed Pond Hose", "A sturdy hose designed to be protected from the elements.", 57, new BigDecimal(34.99), 10, 100,
				1, "/products/waterfeatures/pondhose.jpg"));
		products.add(new Product(83, "Water Pump Fountain", "Boy & Girl resin fountain with metal effect finish.", 98, new BigDecimal(34.99), 10, 100,
				1, "/products/waterfeatures/WaterPumpFountain.jpg"));
		products.add(new Product(84, "Tree Trunk Bird Bath", "Perfect to attract wildlife to  gardens.", 6, new BigDecimal(34.99), 10, 100,
				1, "/products/waterfeatures/treetrunkbirdbath.jpg"));
		products.add(new Product(85, "Slate Multi Falls", "Slate Multi Falls Self Contained Water Feature.", 10, new BigDecimal(34.99), 10, 100,
				1, "/products/waterfeatures/slatemultifallsjpg.jpg"));
		products.add(new Product(86, "Woodland Hidden Falls", " Slate Multi Falls Self Contained Water Feature", 35, new BigDecimal(34.99), 10, 100,
				1, "/products/waterfeatures/woodlandhiddenfalls.jpg"));
		products.add(new Product(87, "Black Rattan 5 Piece Stacking Furniture Set", "Ideal for any size garden, patio or decking and can be stacked to store.", 10, new BigDecimal(599.99), 5, 50,
				1, "/products/furniture/blackfurniture.png"));
		products.add(new Product(88, "Cast Aluminium 5 Piece Garden Furniture Set", "Premium garden furniture set is ideal for dining and entertaining outdoors", 4, new BigDecimal(699.99), 5, 50,
				1, "/products/furniture/castaluminium.jpg"));
		products.add(new Product(89, "4 Seater Rattan Effect Garden Furniture Set", "Aluminium frame with luxury removable seat cushion and glass topped recessed table.", 6, new BigDecimal(599.99), 5, 50,
				1, "/products/furniture/rattaneffect.jpg"));		
		products.add(new Product(90, "6 Seater Stacking Metal Garden Furniture Set", "Perfect addition to any garden or outdoor space", 45, new BigDecimal(379.99), 5, 50,
				1, "/products/furniture/stackingset.jpg"));
		products.add(new Product(91, "Eden Bench Box", "Combines the practical storage capacity of a patio box with a decorative two person seat", 8, new BigDecimal(79.99), 5, 50,
				1, "/products/furniture/benchbox.jpg"));
		products.add(new Product(92, "Ornate 2 Seater Wooden Garden Bench", "The Peru Ornate Bench is a great addition to any outdoor space.", 10, new BigDecimal(79.99), 5, 50,
				1, "/products/furniture/gardenbench.jpg"));
		products.add(new Product(93, "Wooden Bench Arch with 2 Planters and Trellis", "Make a great practical and decorative addition to your garden.", 1, new BigDecimal(549.99), 5, 50,
				1, "/products/furniture/bencharch.jpg"));
		products.add(new Product(94, "Grey Rattan Effect Companion Set with Footstool", "The set is ideal for any size garden, patio, decking or conservatory and can be kept outdoors all year round", 25, new BigDecimal(599.99), 5, 50,
				1, "/products/furniture/companionset.jpg"));
		products.add(new Product(95, "String hammock and stand", "Grab a good book, a drink, lie back and relax in our luxurious hammock.", 67, new BigDecimal(39.99), 10, 100,
				1, "/products/furniture/stringhammockandstand.jpg"));
		products.add(new Product(96, "Swing hammock chair", "This colourful chair swing will provide hours of relaxation in the garden.", 56, new BigDecimal(89.99), 10, 100,
				1, "/products/furniture/swinghammockchair.jpg"));
		products.add(new Product(97, "Woven string hammock", "This ivory woven hammock will provide hours of relaxation in the garden.", 45, new BigDecimal(59.99), 10, 100,
				1, "/products/furniture/stringhammock.jpg"));
		products.add(new Product(98, "Fatboy Headdemock", "Headdemock easily has room for several people", 5, new BigDecimal(349.95), 5, 50,
				1, "/products/furniture/headdemock.jpg"));
		products.add(new Product(99, "Wrought Iron Grey Swing Seat", "Relax in your garden or patio with this gorgeous outdoor swing seat.", 30, new BigDecimal(249.99), 5, 50,
				1, "/products/furniture/wroughtironswing.jpg"));
		products.add(new Product(100, "Metal Swing Seat", "The set is ideal for any size garden, patio, decking or conservatory and can be kept outdoors all year round", 25, new BigDecimal(299.99), 5, 50,
				1, "/products/furniture/swingseat.jpg"));
		products.add(new Product(101, "Belvedere Metal Swing Seat", "The set is ideal for any size garden, patio, decking or conservatory and can be kept outdoors all year round", 34, new BigDecimal(329.99), 5, 50,
				1, "/products/furniture/belswingseat.jpg"));
		products.add(new Product(102, "Wooden Swing Seat", "Beautiful wooden swing seat is ideal for any size garden or patio area", 32, new BigDecimal(249.99), 5, 50,
				1, "/products/furniture/woodenswingseat.jpg"));
		products.add(new Product(103, "Heart Birdhouse", "Heart bird house designed for a range of species", 56, new BigDecimal(15.00), 10, 100,
				1, "/products/furniture/heartbirdhouse.jpg"));
		products.add(new Product(104, "Beach Hut Bird House", "Beach Hut Birdhouse is a gorgeous homage to the beach hut, which has become very iconic over the last few decades, in birdhouse form.", 89, new BigDecimal(19.99), 10, 100,
				1, "/products/furniture/beachhut.jpg"));
		products.add(new Product(105, "Red Lion Inn Bird House", "A charming addition to any garden", 76, new BigDecimal(49.99), 10, 100,
				1, "/products/furniture/redlionbirdhouse.jpg"));
		products.add(new Product(106, "Teapot Birdhouse", "A delightful garden bird feeder in a country teapot design", 7, new BigDecimal(249.99), 5, 50,
				1, "/products/furniture/teapotbirdhouse.jpg"));
		products.add(new Product(107, "Petrol Ride On Mower", "Compact lawn rider that fits through a standard garden gate and makes maintaining your lawn quick and easy. ", 2, new BigDecimal(1099.99), 5, 25,
				1, "/products/maintenance/rideonmower.jpg"));
		products.add(new Product(108, "Petrol Mower", "A lightweight, highly manoeuvrable and easy to use rear wheel drive mower", 4, new BigDecimal(215.99), 5, 50,
				1, "/products/maintenance/petrolmower.jpg"));
		products.add(new Product(109, "Electric Mower", "A mains electric mower", 24, new BigDecimal(164.99), 5, 50,
				1, "/products/maintenance/electricmower.jpg"));
		products.add(new Product(110, "Hand Cylinder Lawnmower", "A traditional-style hand propelled cylinder lawn mower with both a large rear roller and steel front roller.", 19, new BigDecimal(64.99), 5, 50,
				1, "/products/maintenance/handlawnmower.jpg"));
		products.add(new Product(111, "Wheeled Brush Cutter and Strimmer", "A delightful garden bird feeder in a country teapot design", 87, new BigDecimal(159.99), 5, 50,
				1, "/products/maintenance/wheeledbrushcutter.jpg"));
		products.add(new Product(112, "Easytrim Strimmer", "Easytrim electric line trimmer comes with a 280 watt motor and a full 23cm cutting diameter making it ideal for small gardens.", 34, new BigDecimal(19.99), 10, 100,
				1, "/products/maintenance/easytrim.jpg.jpg"));
		products.add(new Product(113, "Petrol Grass Strimmer", "The machine offers plenty of power for its 26cc engine and is not only extremely versatile, but very easy to operate and maintain.", 45, new BigDecimal(64.99), 10, 100,
				1, "/products/maintenance/petrolgrassstrimmer.jpg"));
		products.add(new Product(114, "Line trimmer", "Perfect to form straight lines in your border", 45, new BigDecimal(40.99), 10, 100,
				1, "/products/maintenance/linetrimmer.jpg"));
		products.add(new Product(115, "Evergreen Complete 4-in-1 Lawn Food", "Keep your garden looking its best with this lawn feed, weed and moss killer from Evergreen.", 78, new BigDecimal(4.99), 10, 100,
				1, "/products/maintenance/evergreen.png"));
		products.add(new Product(116, "Weed, Feed & Moss Killer 20kg", "Keep your garden looking its best with this lawn feed, weed and moss killer.", 45, new BigDecimal(24.99), 10, 100,
				1, "/products/maintenance/20kgseed.jpg"));
		products.add(new Product(117, "Verve Lawn Feed, Weed & Moss Killer 14kg", "Keep your garden looking its best with this lawn feed, weed and moss killer from Verve.", 54, new BigDecimal(17.99), 10, 100,
				1, "/products/maintenance/verve.png"));
		products.add(new Product(118, "Barrettine Lawn Feed, Weed & Moss Killer 8.75kg", "Triple action. Lawn fertiliser to feed the grass for a lush healthy lawn. Two herbicides to eliminate weeds. Iron sulphate to eliminate moss, causing it to blacken and die.", 45, new BigDecimal(249.99), 10, 100,
				1, "/products/maintenance/barrettine.jpg"));
		products.add(new Product(119, "Rechargeable Cordless Secateurs", "Take the strain out of pruning and achieve fantastic results in record time with our Rechargeable Cordless Secateurs.", 100, new BigDecimal(34.99), 10, 100,
				1, "/products/maintenance/rechargeable.jpg"));
		products.add(new Product(120, "Anvil Secateurs", "Expert quality secateurs with toughened steels blades.", 32, new BigDecimal(12.99), 10, 100,
				1, "/products/maintenance/anvil.jpg"));
				products.add(new Product(121, "Okatsune Secateurs", "Okatsune secateurs are the No. 1 choice for professional gardeners in Japan", 43, new BigDecimal(41.99), 10, 100,
				1, "/products/maintenance/okatsune.jpg"));
		products.add(new Product(122, "House Secateurs in Multi Flower Oval Pouch", "These gorgeous garden secateurs by Orla Kiely are perfect for pruning your garden. ", 67, new BigDecimal(18.99), 10, 100,
				1, "/products/maintenance/house.jpg"));

	}


	private void setupPaymentDetails() {
		paymentDetails = new ArrayList<PaymentDetails>();
		paymentDetails.add(new PaymentDetails(1, "125685", "236595632", "Halifax Card"));
		paymentDetails.add(new PaymentDetails(1, "125685", "236595632", "Credit Card"));
		paymentDetails.add(new PaymentDetails(1, "125685", "236595632", "Debit Card"));
		paymentDetails.add(new PaymentDetails(1, "125685", "236595632", "Halifax Card"));
		paymentDetails.add(new PaymentDetails(1, "125685", "236595632", "Credit Card"));
		paymentDetails.add(new PaymentDetails(1, "125685", "236595632", "Halifax Card"));
		paymentDetails.add(new PaymentDetails(1, "125685", "236595632", "Debit Card"));
		paymentDetails.add(new PaymentDetails(1, "125685", "236595632", "Debit Card"));
		paymentDetails.add(new PaymentDetails(1, "125685", "236595632", "Halifax Card"));
		paymentDetails.add(new PaymentDetails(1, "125685", "236595632", "Credit Card"));
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
		String password = "test";

		users = new ArrayList<User>();
		users.add(new User(1, "Mr", "Jonny", "Black", new Date(215455415), "jonny.black@email.com", "Admin", password,
				UserLevel.ADMIN, paymentDetails.get(0), addresses.get(4)));
		users.add(new User(2, "Mr", "Dan", "Black", new Date(215455415), "jonny.black@email.com", "User2", password,
				UserLevel.CUSTOMER, paymentDetails.get(2), addresses.get(2)));
		users.add(new User(3, "Mr", "Ben", "Black", new Date(215455415), "jonny.black@email.com", "User3", password,
				UserLevel.CUSTOMER, paymentDetails.get(3), addresses.get(3)));
		users.add(new User(4, "Mr", "Chris", "Black", new Date(215455415), "jonny.black@email.com", "User4", password,
				UserLevel.CUSTOMER, paymentDetails.get(4), addresses.get(4)));
		users.add(new User(5, "Mr", "Alan", "Black", new Date(215455415), "jonny.black@email.com", "User5", password,
				UserLevel.CUSTOMER, paymentDetails.get(5), addresses.get(1)));
		users.add(new User(6, "Mrs", "Sally", "Black", new Date(215455415), "jonny.black@email.com", "User6", password,
				UserLevel.CUSTOMER, paymentDetails.get(6), addresses.get(2)));
		users.add(new User(7, "Mrs", "Dorean", "Black", new Date(215455415), "jonny.black@email.com", "User7", password,
				UserLevel.CUSTOMER, paymentDetails.get(2), addresses.get(0)));
		users.add(new User(8, "Mrs", "Jenny", "Black", new Date(215455415), "jonny.black@email.com", "User8", password,
				UserLevel.CUSTOMER, paymentDetails.get(6), addresses.get(5)));
		users.add(new User(9, "Mrs", "Jolene", "Black", new Date(215455415), "jonny.black@email.com", "User9", password,
				UserLevel.CUSTOMER, paymentDetails.get(3), addresses.get(4)));
		users.add(new User(10, "Miss", "Karen", "Black", new Date(215455415), "jonny.black@email.com", "User10",
				password, UserLevel.CUSTOMER, paymentDetails.get(2), addresses.get(2)));
		users.add(new User(11, "Miss", "Kate", "Black", new Date(215455415), "jonny.black@email.com", "User11",
				password, UserLevel.CUSTOMER, paymentDetails.get(3), addresses.get(1)));
		users.add(new User(12, "Mr", "Baz", "Black", new Date(215455415), "jonny.black@email.com", "User12", password,
				UserLevel.CUSTOMER, paymentDetails.get(1), addresses.get(0)));
		users.add(new User(13, "Mrs", "Greath", "Black", new Date(215455415), "jonny.black@email.com", "User13",
				password, UserLevel.CUSTOMER, paymentDetails.get(1), addresses.get(3)));
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
		reviews.add(new Review(18, 0.5f, "Tripping hazard.", users.get(10), products.get(1)));
	}

	private void setupOrders() {
		orders = new ArrayList<Order>();

		List<BasketProduct> productsForOrder = new ArrayList<BasketProduct>();
		productsForOrder.add(new BasketProduct(products.get(0), 1));
		productsForOrder.add(new BasketProduct(products.get(5), 2));
		productsForOrder.add(new BasketProduct(products.get(6), 4));
		productsForOrder.add(new BasketProduct(products.get(2), 1));
		orders.add(new Order(1, users.get(0), OrderType.CUSTOMER, OrderState.OUT_FOR_DELIVERY,
				"Leave with Garry next door", new Date(15263), new Date(45155541), productsForOrder));

		productsForOrder = new ArrayList<BasketProduct>();
		productsForOrder.add(new BasketProduct(products.get(2), 2));
		productsForOrder.add(new BasketProduct(products.get(4), 1));
		productsForOrder.add(new BasketProduct(products.get(6), 1));
		productsForOrder.add(new BasketProduct(products.get(8), 3));
		orders.add(new Order(2, users.get(0), OrderType.CUSTOMER, OrderState.DELIVERED, "Don't put in shed!",
				new Date(15263), new Date(45155541), productsForOrder));
	}

	private void setupCategoriesProducts() {
		classicgnomes = new ArrayList<Product>();
		classicgnomes.add(products.get(0));
		classicgnomes.add(products.get(1));
		classicgnomes.add(products.get(2));
		classicgnomes.add(products.get(3));
		classicgnomes.add(products.get(4));
		classicgnomes.add(products.get(5));
		classicgnomes.add(products.get(6));

		noveltygnomes = new ArrayList<Product>();
		noveltygnomes.add(products.get(7));
		noveltygnomes.add(products.get(8));
		noveltygnomes.add(products.get(9));
		noveltygnomes.add(products.get(10));
		noveltygnomes.add(products.get(11));
		themedgnomes = new ArrayList<Product>();
		themedgnomes.add(products.get(12));
		themedgnomes.add(products.get(13));
		themedgnomes.add(products.get(14));
		gnomecare = new ArrayList<Product>();
		gnomecare.add(products.get(15));
		gnomecare.add(products.get(16));
		gnomecare.add(products.get(17));

		lighting = new ArrayList<Product>();
		lighting.add(products.get(18));
		lighting.add(products.get(19));
		lighting.add(products.get(20));
		lighting.add(products.get(21));

		heaters = new ArrayList<Product>();
		heaters.add(products.get(22));
		heaters.add(products.get(23));
		heaters.add(products.get(24));
		heaters.add(products.get(25));

		hottubs = new ArrayList<Product>();
		hottubs.add(products.get(26));
		hottubs.add(products.get(27));
		hottubs.add(products.get(28));
		hottubs.add(products.get(29));

		bbqs = new ArrayList<Product>();
		bbqs.add(products.get(30));
		bbqs.add(products.get(31));
		bbqs.add(products.get(32));
		bbqs.add(products.get(33));
		misc = new ArrayList<Product>();
		misc.add(products.get(34));
		misc.add(products.get(35));
		misc.add(products.get(36));
		misc.add(products.get(37));

		animals = new ArrayList<Product>();
		animals.add(products.get(38));
		animals.add(products.get(39));
		animals.add(products.get(40));
		animals.add(products.get(41));
		windchimes = new ArrayList<Product>();
		windchimes.add(products.get(42));
		windchimes.add(products.get(43));
		windchimes.add(products.get(44));
		windchimes.add(products.get(45));
		weathervanes = new ArrayList<Product>();
		weathervanes.add(products.get(46));
		weathervanes.add(products.get(47));
		weathervanes.add(products.get(48));
		weathervanes.add(products.get(49));
		pots = new ArrayList<Product>();
		pots.add(products.get(50));
		pots.add(products.get(51));
		pots.add(products.get(52));
		pots.add(products.get(53));

		rakes = new ArrayList<Product>();
		rakes.add(products.get(54));
		rakes.add(products.get(55));
		rakes.add(products.get(56));
		rakes.add(products.get(57));
		hoes = new ArrayList<Product>();
		hoes.add(products.get(58));
		hoes.add(products.get(59));
		hoes.add(products.get(60));
		hoes.add(products.get(61));
		spadesnforks = new ArrayList<Product>();
		spadesnforks.add(products.get(62));
		spadesnforks.add(products.get(63));
		spadesnforks.add(products.get(64));
		spadesnforks.add(products.get(65));
		trowels = new ArrayList<Product>();
		trowels.add(products.get(66));
		trowels.add(products.get(67));
		trowels.add(products.get(68));
		trowels.add(products.get(69));

		pumps = new ArrayList<Product>();
		pumps.add(products.get(70));
		pumps.add(products.get(71));
		pumps.add(products.get(72));
		pumps.add(products.get(73));
		ponds = new ArrayList<Product>();
		ponds.add(products.get(74));
		ponds.add(products.get(75));
		ponds.add(products.get(76));
		ponds.add(products.get(77));
		pipes = new ArrayList<Product>();
		pipes.add(products.get(78));
		pipes.add(products.get(79));
		pipes.add(products.get(80));
		pipes.add(products.get(81));
		fountains = new ArrayList<Product>();
		fountains.add(products.get(82));
		fountains.add(products.get(83));
		fountains.add(products.get(84));
		fountains.add(products.get(85));
		
		tablesnchairs = new ArrayList<Product>();
		tablesnchairs.add(products.get(86));
		tablesnchairs.add(products.get(87));
		tablesnchairs.add(products.get(88));
		tablesnchairs.add(products.get(89));
		benches = new ArrayList<Product>();
		benches.add(products.get(90));
		benches.add(products.get(91));
		benches.add(products.get(92));
		benches.add(products.get(93));
		hammocks = new ArrayList<Product>();
		hammocks.add(products.get(94));
		hammocks.add(products.get(95));
		hammocks.add(products.get(96));
		hammocks.add(products.get(97));
		swinging = new ArrayList<Product>();
		swinging.add(products.get(98));
		swinging.add(products.get(99));
		swinging.add(products.get(100));
		swinging.add(products.get(101));
		birdhouses = new ArrayList<Product>();
		birdhouses.add(products.get(102));
		birdhouses.add(products.get(103));
		birdhouses.add(products.get(104));
		birdhouses.add(products.get(105));
		
		mowers = new ArrayList<Product>();
		mowers.add(products.get(106));
		mowers.add(products.get(107));
		mowers.add(products.get(108));
		mowers.add(products.get(109));
		strimmers = new ArrayList<Product>();
		strimmers.add(products.get(110));
		strimmers.add(products.get(111));
		strimmers.add(products.get(112));
		strimmers.add(products.get(113));
		feednweed = new ArrayList<Product>();
		feednweed.add(products.get(114));
		feednweed.add(products.get(115));
		feednweed.add(products.get(116));
		feednweed.add(products.get(117));
		secatures = new ArrayList<Product>();
		secatures.add(products.get(118));
		secatures.add(products.get(119));
		secatures.add(products.get(120));
		secatures.add(products.get(121));
	}

	private void setupCategories() {
		categories = new ArrayList<Category>();

		Category one = new Category(1, "Gnomes", subcategories);
		one.addSubCategory(new SubCategory(1, "Classic", one, classicgnomes));
		one.addSubCategory(new SubCategory(2, "Novelty", one, noveltygnomes));
		one.addSubCategory(new SubCategory(3, "Themed", one, themedgnomes));
		one.addSubCategory(new SubCategory(4, "Gnome Care", one, gnomecare));

		Category two = new Category(2, "Electrical", subcategories1);
		two.addSubCategory(new SubCategory(5, "Lighting", two, lighting));
		two.addSubCategory(new SubCategory(6, "Heaters", two, heaters));
		two.addSubCategory(new SubCategory(7, "Hot Tubs", two, hottubs));
		two.addSubCategory(new SubCategory(8, "BBQs", two, bbqs));
		two.addSubCategory(new SubCategory(9, "Misc", two, misc));

		Category three = new Category(3, "Ornaments", subcategories2);
		three.addSubCategory(new SubCategory(10, "Animals", three, animals));
		three.addSubCategory(new SubCategory(11, "Wind Chimes", three, windchimes));
		three.addSubCategory(new SubCategory(12, "Weather Vanes", three, weathervanes));
		three.addSubCategory(new SubCategory(13, "Pots", three, pots));

		Category four = new Category(4, "Rakes and Hoes", subcategories3);
		four.addSubCategory(new SubCategory(14, "Rakes", four, rakes));
		four.addSubCategory(new SubCategory(15, "Hoes", four, hoes));
		four.addSubCategory(new SubCategory(16, "Spades and Forks", four, spadesnforks));
		four.addSubCategory(new SubCategory(17, "Trowels", four, trowels));

		Category five = new Category(5, "Water Features", subcategories4);
		five.addSubCategory(new SubCategory(18, "Pumps", five, pumps));
		five.addSubCategory(new SubCategory(19, "Ponds", five, ponds));
		five.addSubCategory(new SubCategory(19, "Pipes", five, pipes));
		five.addSubCategory(new SubCategory(19, "Fountains", five, fountains));

		Category six = new Category(6, "Furniture", subcategories5);
		six.addSubCategory(new SubCategory(20, "Tables and Chairs", six, tablesnchairs));
		six.addSubCategory(new SubCategory(21, "Benches", six, benches));
		six.addSubCategory(new SubCategory(22, "Hammocks", six, hammocks));
		six.addSubCategory(new SubCategory(23, "Swinging", six, swinging));
		six.addSubCategory(new SubCategory(24, "Bird Houses", six, birdhouses));

		Category seven = new Category(7, "Maintenance", subcategories6);
		seven.addSubCategory(new SubCategory(25, "Mowers", seven, mowers));
		seven.addSubCategory(new SubCategory(26, "Strimmers", seven, strimmers));
		seven.addSubCategory(new SubCategory(27, "Feed and Weed", seven, feednweed));
		seven.addSubCategory(new SubCategory(28, "Secateurs", seven, secatures));

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
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	// ----- END USERS -----

	// ----- ORDERS -----

	public List<Order> getOrders() {
		return this.orders;
	}

	public List<Order> getOrdersForUser(int userId) {
		List<Order> userOrders = new ArrayList<Order>();

		for (Order order : orders) {
			if (order.getUser().getId() == userId) {
				userOrders.add(order);
			}
		}
		return userOrders;
	}

	public void addOrder(Order order) {
		this.orders.add(order);
	}

	// ----- END ORDERS -----

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

	public Category findById(int id) {

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

	public ArrayList<Product> getSubcatsProducts(String subcategory) {
		switch (subcategory.toLowerCase()) {
		case "classic":
			return classicgnomes;
		case "secatures":
			return secatures;
		case "feed and weed":
			return feednweed;
		case "bird houses":
			return birdhouses;
		case "novelty":
			return noveltygnomes;
		case "themed":
			return themedgnomes;
		case "gnome care":
			return gnomecare;
		case "lighting":
			return lighting;
		case "heaters":
			return heaters;
		case "hot tubs":
			return hottubs;
		case "bbqs":
			return bbqs;
		case "misc":
			return misc;
		case "animals":
			return animals;
		case "wind chimes":
			return windchimes;
		case "weather vanes":
			return weathervanes;
		case "pots":
			return pots;
		case "rakes":
			return rakes;
		case "hoes":
			return hoes;
		case "spades and forks":
			return spadesnforks;
		case "trowels":
			return trowels;
		case "pumps":
			return pumps;
		case "ponds":
			return ponds;
		case "fountains":
			return fountains;
		case "pipes":
			return pipes;
		case "tables and chairs":
			return tablesnchairs;
		case "benches":
			return benches;
		case "hammocks":
			return hammocks;
		case "swinging":
			return swinging;
		case "mowers":
			return mowers;
		case "strimmers":
			return strimmers;
		}
		return null;
	}

	public List search(String parameter) {
		List results = new ArrayList<Product>();
		for (Product p : products) {
			if (p.getName().toLowerCase().contains(parameter.toLowerCase())
					|| Integer.toString(p.getId()).equals(parameter)) {
				results.add(p);
			}
		}

		return results;
	}

}
