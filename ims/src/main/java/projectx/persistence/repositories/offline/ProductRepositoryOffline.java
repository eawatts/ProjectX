package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.ProductRepository;

@Stateless
@Default
public class ProductRepositoryOffline implements ProductRepository {

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

}
