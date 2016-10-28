package projectx.persistence.offline;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.offline.database.OfflineDB;
import projectx.persistence.repositories.interfaces.ProductRepository;
import projectx.persistence.webentities.CurrentProduct;
import projectx.persistence.webentities.ProductWithAverageReview;

@Stateless
@Default
public class ProductRepositoryOffline implements ProductRepository {

	@Inject
	private OfflineDB db;
	
	public ProductRepositoryOffline() {}
	
	@Override
	public void persistProdcut(Product product) {
		// TODO Auto-generated method stub
	}

	@Override
	public void persistProducts(List<Product> products) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Product> getProducts() {
		return db.getProducts();
	}
	
	@Override
	public List<ProductWithAverageReview> getTopProductsWithAverageReview() {
		return db.getTopProductsWithAverageReview();
	}

	@Override
	public List<ProductWithAverageReview> getSeasonalProductsWithAverageReview() {
		return db.getSeasonalProductsWithAverageReview();
	}
	
	@Override
	public Product getProductFromId(int id) {
		return db.getProductFromId(id);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
	}

	@Override
	public Integer getAverageReviewForProductId(int productId) {
		return db.getAverageReviewForProductId(productId);
	}

	@Override
	public CurrentProduct getCurrentProductFromId(int productId) {
		return db.getCurrentProduct(productId);
	}

	@Override
	public ArrayList<Product> getSubcatsProducts(String subcategory) {
		return db.getSubcatsProducts(subcategory);
	}
}
