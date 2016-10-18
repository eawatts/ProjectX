package projectx.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.interfaces.ProductRepository;

@Stateless
public class ProductService {
	
	@Inject
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.getProducts();
	}

}
