package projectx.persistence.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.offline.database.OfflineDB;
import projectx.persistence.repositories.interfaces.ProductRepository;

@Stateless
@Default
public class ProductRepositoryOffline implements ProductRepository {

	@Inject
	private OfflineDB db;
	
	public ProductRepositoryOffline() {}
	
	@Override
	public void persistProdcut(Product product) {
		// TODO Auto-generated method stub
	}

	@Override
	public void persistProducts(List<Product> products) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Product> getProducts() {
		return db.getProducts();
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
	}
}
