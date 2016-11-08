package projectx.persistence.repositories.hibernate.database;

import java.util.ArrayList;

import org.hibernate.Session;

import projectx.persistence.entities.Notification;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;
import projectx.persistence.entities.User;
import projectx.persistence.util.NotificationType;
import projectx.persistence.util.UserLevel;

public class HibernateDatabaseSeed {

	public static void seedDatabase(Session session) {
		seedUsers(session);
		seedNotifications(session);
		seedSuppliersAndProducts(session);

		session.close();
	}

	private static void seedUsers(Session session) {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User(1, "hello", "password", "firstname", "lastname", UserLevel.CUSTOMER, "username@email.com"));
		users.add(new User(2, "alstock", "password", "Al", "Stock", UserLevel.ADMIN, "alstock@al.co.uk"));
		users.add(new User(2, "adam", "test", "Adam", "Dev", UserLevel.ADMIN, "email@me.com"));

		for (User user : users)
			session.save(user);

		session.beginTransaction().commit();
	}

	private static void seedNotifications(Session session) {
		ArrayList<Notification> notifications = new ArrayList<Notification>();
		notifications.add(new Notification(null, NotificationType.PURCHASE_ORDER_ISSUE, "It seems a bit costly."));
		notifications
				.add(new Notification(null, NotificationType.PURCHASE_ORDER_ISSUE, "It's cheaper at the first place."));
		notifications.add(new Notification(null, NotificationType.PURCHASE_ORDER_ISSUE,
				"We are planning to stop selling these."));
		notifications
				.add(new Notification(null, NotificationType.PURCHASE_ORDER_ISSUE, "Double the about out Product 34."));
		notifications
				.add(new Notification(null, NotificationType.PURCHASE_ORDER_ISSUE, "Just resubmit this one Monday."));
		notifications.add(
				new Notification(null, NotificationType.WAREHOUSE_IDLE, "Half of the team are not doing anything."));
		notifications.add(new Notification(null, NotificationType.WAREHOUSE_IDLE, "Baz hasn't done any work all day."));
		notifications.add(new Notification(null, NotificationType.SAVE_ERROR, "Is the server down?"));
		notifications.add(new Notification(null, NotificationType.SAVE_ERROR, "Can't save the Purchase Order!"));
		notifications.add(new Notification(null, NotificationType.SAVE_ERROR, "Not sure what happened."));
		notifications.add(new Notification(null, NotificationType.DELIVERY_ERROR, "The eagle has landed!"));

		for (Notification notification : notifications)
			session.save(notification);

		session.beginTransaction().commit();
	}

	private static void seedSuppliersAndProducts(Session session) {
		ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
		suppliers.add(new Supplier(null, "Gnomes gnomes gnomes", "1 Road Street", "The Town", "M56YH", "07463772819"));
		suppliers.add(new Supplier(null, "Rakes and Hoes Emporium", "33 Garden Street", "Cheshire", "SG147YH", "04463776419"));
		suppliers.add(new Supplier(null, "We Sell Stuff", "2 Made Up Street", "Barca", "BE39UI", "01320739921"));
		suppliers.add(new Supplier(null, "Gnomes R Us", "123 Fake Street", "MAdeUp Land", "TU59PI", "01193812204"));

		for (Supplier supplier : suppliers)
			session.save(supplier);

		session.beginTransaction().commit();

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
		
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(null, "Classic Gnome", 20, 52.00, 50, "a classic garden gnome perfect for every garden", productImages1));
		products.add(new Product(null, "Seated Gnome", 26, 33.00, 20, "a classic gnome in the seated position", productImages2));
		products.add(new Product(null, "Laying Gnome", 23, 34.00, 30, "a classic gnome lying down", productImages3));
		products.add(new Product(null, "Sleeping Gnome", 25, 31.00, 20, "a classic gnome having a nap",productImages4));
		products.add(new Product(null, "Gnomezilla", 30, 32.00, 40, "Gnomes being devowered by the almighty godzilla", productImages5));
		products.add(new Product(null, "Flashing Gnome", 35, 34.00, 20, "a rude flashing gnome", productImages6));
		products.add(new Product(null, "Gnome on the loo", 10, 52.00, 15, "a gnome doing his business",  productImages7));
		products.add(new Product(null, "GnomeLand Security", 15, 34.00, 20, "a Gnomeland Security punned gnome", productImages8));
		products.add(new Product(null, "Game of Gnomes", 2, 31.00, 8, "a Gnome based on the popular tv show", productImages9));
		products.add(new Product(null, "Gnominator", 25, 34.00, 20, "if arnie was born a gnome",  productImages10));
		products.add(new Product(null, "Gnome Guard", 13, 32.00, 10, "Royal Gnome guard for the Gnome Queen",productImages11));
		products.add(new Product(null, "Santa", 35, 35.00, 50, "big, fat, jolly gnome", productImages12));
		products.add(new Product(null, "Zombie Gnome", 10, 51.00, 5, "a very shiny product",  productImages13));
		products.add(new Product(null, "Xmas tree ornament gnome", 22, 3.00, 20, "a gnome perfect for the christmas", productImages14));
		products.add(new Product(null, "Gnome home", 5, 32.00, 10, "a house for all of your gnome friends",  productImages15));
		products.add(new Product(null, "Cloth for your Gnome", 21, 3.00, 15, "a cloth to clean and dust your gnome friends", productImages16));
		products.add(new Product(null, "Gnome spray", 30, 13.00, 13, "shiny products require spraying regulary",  productImages17));
		products.add(new Product(null, "Hedgehog ornament", 31, 32.00, 20, "a hedgehog friend to add to your garden",  productImages18));
		products.add(new Product(null, "Heron Ornament", 10, 54.00, 20, "a heron friend to add to your garden", productImages19));
		products.add(new Product(null, "Lamb Ornament", 21, 31.00, 20, "another very shiny product", productImages20));
		products.add(new Product(null, "Black Wind Chime", 12, 22.00, 10, "a Wind Chime coloured in the tone known as black",  productImages21));
		products.add(new Product(null, "Silver Wind Chime", 2, 10.00, 15, "a metalic coloured wind chime",  productImages22));
		products.add(new Product(null, "Rooster Wind Chime", 30, 13.00, 20, "a wind chime adorned with a shiny rooster",  productImages23));
		products.add(new Product(null, "Rooster Weather Vane", 12, 13.00, 10, "another shiny weather vane product", productImages24));
		products.add(new Product(null, "Eagle Weather Vane", 100, 54.00, 20, "a weather vane with an eagle upon its top[t", productImages25));
		products.add(new Product(null, "Arrow Weather Vane", 15, 31.00, 10, "a weather vane with an arrow as a pointer",productImages26));
		products.add(new Product(null, "Classic Pot", 23, 10.00, 20, "a classic pot for the garden", productImages27));
		products.add(new Product(null, "Square Pot", 25, 20.00, 20, "a large square pot", productImages28));
		products.add(new Product(null, "Garden pot set", 15, 30.00, 20, "a set of different sized pots", productImages29));
		products.add(new Product(null, "Small Light", 17, 20.00, 20, "a small light to brighten up the darkness", productImages30));
		products.add(new Product(null, "Large Garden Light", 30, 30.00, 20, "a clasically styled large light source", productImages31));
		products.add(new Product(null, "Solar Light", 35, 35.00, 20, "a self charging garden light", productImages32));
		products.add(new Product(null, "Wall Heater", 3, 35.00, 20, "a heater that can grip the wall", productImages33));
		products.add(new Product(null, "Wood Heater", 2, 40.00, 15, "a out side heat source that can run on wood", productImages34));
		products.add(new Product(null, "Patio Heater", 35, 150.00, 20, "a large heater for the patio", productImages35));
		products.add(new Product(null, "Small Hot tub", 3, 300.00, 5, "a small hot tub for the garden", productImages36));
		products.add(new Product(null, "Large Hot tub", 12, 3.00, 10, "a large garden hot tub", productImages37));
		products.add(new Product(null, "Round BBQ", 3, 35.00, 20, "a samll round bbq for the garden", productImages38));
		products.add(new Product(null, "Large Grill", 13, 60.00, 20, "a shiny grill for all your meat needs", productImages39));
		products.add(new Product(null, "Deluxe Grill", 35, 100.00, 20, "a top of the range grill", productImages40));
		products.add(new Product(null, "Plug Extension", 3, 31.00, 20, "an extension coed for electrical garden items", productImages41));
		products.add(new Product(null, "Garden Plugs", 35, 34.00, 20, "Weather proof garden plugs for the outdorrs", productImages42));
		products.add(new Product(null, "Small Rake", 12, 12.00, 20, "a Small Garden Rake", productImages43));
		
		for (Product product : products) session.save(product);

		session.beginTransaction().commit();
	}

}
