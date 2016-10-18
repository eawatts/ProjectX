package projectx.persistence.repositories.interfaces;

import java.util.List;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.User;

public interface ProductRepository {
	
	public void persistProdcut(Product product);
	public void persistProducts(List<Product> products);
	public List<Product> getProducts();
	public void updateProduct(Product product);
}
