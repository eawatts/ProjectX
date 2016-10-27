package projectx.persistence.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.faces.model.DataModel;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.ProductRepository;

@Stateless
public class ProductService{
	@Inject
	private ProductRepository productRepository;
	
	public Product findProductById(String id)
	{
		return findProductById(Integer.parseInt(id));
	}
	
	public Product findProductById(int id)
	{
		return productRepository.findByProductId(id);
	}
	public List<Product> getProducts() 
	{
		return productRepository.getProducts();
	}

	public List<Product> getLowStockProduct() {
		return productRepository.getLowStockProducts();
	}
} 