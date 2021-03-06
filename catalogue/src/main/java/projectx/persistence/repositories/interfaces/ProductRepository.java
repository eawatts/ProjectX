package projectx.persistence.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;

import projectx.persistence.entities.Product;
import projectx.persistence.webentities.CurrentProduct;
import projectx.persistence.webentities.ProductWithAverageReview;

public interface ProductRepository {
	
	public void persistProdcut(Product product);
	public void persistProducts(List<Product> products);
	public List<Product> getProducts();
	public List<ProductWithAverageReview> getTopProductsWithAverageReview();
	public List<ProductWithAverageReview> getSeasonalProductsWithAverageReview();
	public CurrentProduct getCurrentProductFromId(int id);
	public Product getProductFromId(int id);
	public Integer getAverageReviewForProductId(int id);
	public void updateProduct(Product product);
	public ArrayList<Product> getSubcatsProducts(String subcatagory);
}
