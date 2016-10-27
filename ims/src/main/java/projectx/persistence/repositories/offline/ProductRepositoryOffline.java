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
	OfflineDB initialData;
	
	@Override
	public void persistProduct(Product products) {
		initialData.addProduct(products);

	}

	@Override
	public void persistProducts(List<Product> products) {
		for(Product p: products)
		{
			initialData.addProduct(p);
		}

	}

	@Override
	public List<Product> getProducts() {
		return initialData.getProducts();
	}

	@Override
	public void updateProduct(Product products) 
	{
		initialData.updateProduct(products);
	}

	@Override
	public Product findByProductId(int productId) {
		return initialData.getProductByID(productId);
	}

	@Override
	public Product findByProductName(String name) 
	{
		return initialData.findProductByName(name);
	}

}
