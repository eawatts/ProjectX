package projectx.services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.ProductRepository;

@Stateless
public class ProductService {

	@Inject
	private ProductRepository productRepository;

	public Product findProductById(String id) {
		return findProductById(Integer.parseInt(id));
	}

	public Product findProductById(int id) {
		return productRepository.findByProductId(id);
	}

	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

	public void addProduct(Product p) {
		productRepository.addProduct(p);
	}

	public List<Product> getLowStockProduct() {
		return productRepository.getLowStockProducts();
	}

	public Product getProductbyID(int id) {
		return productRepository.findByProductId(id);
	}

	public List<Product> getTop25LowStockProducts() {
		List<Product> orderedProducts = getLowStockProduct();
		List<Product> top25LowStockProducts = new ArrayList<Product>();
		int listSize = orderedProducts.size();
		if (listSize > 25) {
			listSize = 25;
		}
		for (int i = 0; i < listSize; i++) {
			
			top25LowStockProducts.add(orderedProducts.get(i));
		}
		return top25LowStockProducts;
	}
}