package projectx.persistence.repositories.hibernate.database;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import projectx.persistence.entities.Notification;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.Supplier;
import projectx.persistence.entities.User;
import projectx.persistence.util.NotificationType;
import projectx.persistence.util.OrderState;
import projectx.persistence.util.UserLevel;

public class HibernateDatabaseSeed {

	public static void seedDatabase(EntityManager entityManager) {
		seedUsers(entityManager);
		seedNotifications(entityManager);
		seedSuppliersAndProducts(entityManager);
		entityManager.close();
	}

	private static void seedUsers(EntityManager entityManager) {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User(1, "hello", "password", "firstname", "lastname", UserLevel.CUSTOMER, "username@email.com"));
		users.add(new User(2, "alstock", "password", "Al", "Stock", UserLevel.ADMIN, "alstock@al.co.uk"));
		users.add(new User(2, "adam", "test", "Adam", "Dev", UserLevel.ADMIN, "email@me.com"));
		
		for (User user : users)
			entityManager.persist(user);

		entityManager.getTransaction().commit();
	}

	private static void seedNotifications(EntityManager entityManager) {
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
			entityManager.persist(notification);

		entityManager.getTransaction().commit();
	}

	private static void seedSuppliersAndProducts(EntityManager entityManager) {
		ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
		suppliers.add(new Supplier(null, "Gnomes gnomes gnomes", "1 Road Street", "The Town", "M56YH", "07463772819"));
		suppliers.add(new Supplier(null, "Rakes and Hoes Emporium", "33 Garden Street", "Cheshire", "SG147YH", "04463776419"));
		suppliers.add(new Supplier(null, "We Sell Stuff", "2 Made Up Street", "Barca", "BE39UI", "01320739921"));
		suppliers.add(new Supplier(null, "Gnomes R Us", "123 Fake Street", "MAdeUp Land", "TU59PI", "01193812204"));

		for (Supplier supplier : suppliers)
			entityManager.persist(supplier);

		entityManager.getTransaction().commit();

		ArrayList<String> productImages = new ArrayList<String>();
		productImages.add("/image1");
		productImages.add("/image1");
		productImages.add("/image1");
		productImages.add("/image1");
		productImages.add("/image1");
		productImages.add("/image1");

		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(null, "Gnome", 100, 5.00, 20, "a very shiny product", productImages));
		products.add(new Product(null, "Gnomeo", 150, 3.00, 20, "another very shiny product", productImages));
		products.add(new Product(null, "Gnomezilla", 200, 3.00, 20, "a Gnome", productImages));
		products.add(new Product(null, "Egnomeous", 250, 3.00, 20, "another Gnome",productImages));
		products.add(new Product(null, "SpeedyGnome", 300, 3.00, 20, "shiny product", productImages));
		products.add(new Product(null, "Lawnmower", 350, 3.00, 20, "another shiny product", productImages));
		products.add(new Product(null, "Pond base", 100, 5.00, 20, "a very shiny product",  productImages));
		products.add(new Product(null, "Bench", 150, 3.00, 20, "another very shiny product", productImages));
		products.add(new Product(null, "Hot tub", 200, 3.00, 20, "a Gnome", productImages));
		products.add(new Product(null, "Spade", 250, 3.00, 20, "another Gnome",  productImages));
		products.add(new Product(null, "Trowel", 300, 3.00, 20, "shiny product",productImages));
		products.add(new Product(null, "Rake", 350, 3.00, 20, "another shiny product", productImages));
		products.add(new Product(null, "Classy Hoe", 100, 5.00, 20, "a very shiny product",  productImages));
		products.add(new Product(null, "Water Fountain", 150, 3.00, 20, "another very shiny product", productImages));
		products.add(new Product(null, "Flamingo", 200, 3.00, 20, "a Gnome",  productImages));
		products.add(new Product(null, "Windchime", 250, 3.00, 20, "another Gnome", productImages));
		products.add(new Product(null, "Weathervane", 300, 3.00, 20, "shiny product",  productImages));
		products.add(new Product(null, "Weedkiller", 350, 3.00, 20, "another shiny product",  productImages));
		products.add(new Product(null, "Flower Pot", 100, 5.00, 20, "a very shiny product", productImages));
		products.add(new Product(null, "Compost", 150, 3.00, 20, "another very shiny product", productImages));
		products.add(new Product(null, "Patio Heater", 200, 3.00, 20, "a Gnome",  productImages));
		products.add(new Product(null, "Mean Grill", 250, 3.00, 20, "another Gnome",  productImages));
		products.add(new Product(null, "Outdoor Table", 300, 3.00, 20, "shiny product",  productImages));
		products.add(new Product(null, "Outdoor Light", 350, 3.00, 20, "another shiny product", productImages));
		products.add(new Product(null, "Santa Gnome", 100, 5.00, 20, "a very shiny product", productImages));
		products.add(new Product(null, "Garden Gloves", 150, 3.00, 20, "another very shiny product",productImages));
		products.add(new Product(null, "Secataurs", 200, 3.00, 20, "a Gnome", productImages));
		products.add(new Product(null, "Petrol Chainsaw", 250, 3.00, 20, "another Gnome", productImages));
		products.add(new Product(null, "Hedge Trimmer", 300, 3.00, 20, "shiny product", productImages));
		products.add(new Product(null, "Paddling Pool", 350, 3.00, 20, "another shiny product", productImages));

		for (Product product : products) entityManager.persist(product);

		entityManager.getTransaction().commit();
		
	
		ArrayList<ProductsOrdered> productsOrdered = new ArrayList<ProductsOrdered>();
		ArrayList<PurchaseOrder> orders = new ArrayList<PurchaseOrder>();
		PurchaseOrder purchaseOrder1 = new PurchaseOrder(null, suppliers.get(1), true, Date.valueOf("2016-09-13"),
				OrderState.ORDER_CLOSED, productsOrdered);
		
		orders.add(purchaseOrder1);
		for (PurchaseOrder purchaseOrder : orders)
			entityManager.persist(purchaseOrder);

		entityManager.getTransaction().commit();
		
		productsOrdered.add(new ProductsOrdered(null, products.get(1), 20, purchaseOrder1,10.00));
		productsOrdered.add(new ProductsOrdered(null, products.get(2), 10, purchaseOrder1,10.00));
		
		for (ProductsOrdered prodOrder : productsOrdered)
			entityManager.persist(prodOrder);

		entityManager.getTransaction().commit();
	}
	
}
