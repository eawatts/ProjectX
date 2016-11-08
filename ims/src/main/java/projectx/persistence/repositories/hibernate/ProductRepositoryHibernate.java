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
	public void persistProduct(Product products) {
		// TODO Auto-generated method stub
	}

	@Override
	public void persistProducts(List<Product> products) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Product products) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product findByProductId(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findByProductName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getLowStockProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
	}
}
