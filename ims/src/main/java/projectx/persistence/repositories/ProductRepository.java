package projectx.persistence.repositories;

import java.util.List;

import projectx.persistence.entities.Product;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.faces.model.DataModel;


@Stateless
@Default
public interface ProductRepository
{
	public void persistProduct (Product products);
	public void persistProducts(List<Product> products);
	public List<Product> getProducts();
	public void updateProduct(Product products);
	public Product findByProductId(int productId);
	public Product findByProductName(String name);
	public List<Product> getLowStockProducts();
	public void addProduct(Product p);

}