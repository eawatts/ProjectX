package projectx.persistence.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.interfaces.ProductRepository;

@Stateless
public class ProductService{
@Inject private ProductRepository productManager;
public Product findProductById(String id)
{
	return findProductById(Integer.parseInt(id));
}
public Product findProductById(int id)
{
	return productManager.findByProductId(id);
}
public List<Product> getProducts() 
{
	return productManager.getProducts();
}
}