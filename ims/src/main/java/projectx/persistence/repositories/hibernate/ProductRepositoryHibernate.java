package projectx.persistence.repositories.hibernate;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import projectx.persistence.entities.Notification;
import projectx.persistence.entities.Product;
import projectx.persistence.repositories.NotificationRepository;
import projectx.persistence.repositories.ProductRepository;
import projectx.persistence.repositories.hibernate.database.HibernateDatabase;
import projectx.persistence.util.NotificationType;

@Stateless
@Alternative // This can be used by changing beans.xml

public class ProductRepositoryHibernate implements ProductRepository {
	
	@Inject
	private HibernateDatabase db;

	@Override
	public void persistProduct(Product product) {
		db.persistProduct(product);
	}

	@Override
	public void persistProducts(List<Product> products) {
		// TODO oneday :D
	}

	@Override
	public List<Product> getProducts() {
		return db.getProducts();
	}

	@Override
	public void updateProduct(Product products) {
		
	}

	@Override
	public Product findByProductId(int productId) {
		return db.getProductById(productId);
	}

	@Override
	public Product findByProductName(String name) {
		return db.getProductByName(name);
	}

	@Override
	public List<Product> getLowStockProducts() {
		return db.getLowStockProducts();
	}

	@Override
	public void addProduct(Product p) {
		persistProduct(p); //see persist product
	}
}
