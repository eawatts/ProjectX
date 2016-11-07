package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.ProductRepository;
import projectx.persistence.repositories.offline.database.OfflineDB;

@Stateless
@Default
public class ProductRepositoryOffline implements ProductRepository {

	@Inject
	OfflineDB offlineDB;

	@Override
	public void persistProduct(Product products) {
		offlineDB.addProduct(products);
	}

	@Override
	public void persistProducts(List<Product> products) {
		for (Product p : products) {
			offlineDB.addProduct(p);
		}
	}

	@Override
	public List<Product> getProducts() {
		return offlineDB.getProducts();
	}

	public void addProduct(Product p) {
		offlineDB.addProduct(p);
	}

	@Override
	public void updateProduct(Product products) {
		offlineDB.updateProduct(products);
	}

	@Override
	public Product findByProductId(int productId) {
		return offlineDB.getProductByID(productId);
	}

	@Override
	public Product findByProductName(String name) {
		return offlineDB.findProductByName(name);
	}

	@Override
	public List<Product> getLowStockProducts() {
		return offlineDB.getLowStockProducts();
	}

}
