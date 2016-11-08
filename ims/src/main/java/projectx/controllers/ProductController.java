package projectx.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;
import projectx.persistence.selected.SelectedProduct;
import projectx.services.ProductService;

@Named("products")
@SessionScoped
public class ProductController implements Serializable
{
	private static final long serialVersionUID = 2390803500375830316L;
	@Inject
	private ProductService productService;
	@Inject
	private SelectedProduct selectedProduct;
	@Inject
	private SearchController searchController;

	@SuppressWarnings("unused")
	private int selectedProductIndex;
	private Product product;
	private int productid;

	public String getProduct(String id)
	{
		/*
		 * try {
		 * selectedProduct.setSelectedProduct(productService.findProductById(id)
		 * ); return "product"; } catch(Exception e) {
		 * 
		 * }
		 */return "browse";
	}


	public List<Product> getProductList()
	{	
		if(searchController.getSearchResults() != null && searchController.getSearchResults().size() > 0 && searchController.getSearchResults().get(0) instanceof Product)
		{
			return searchController.getSearchResults();
		}
		else
		{
			return productService.getProducts();
		}
		
	}

	// public List<Supplier> getSupplier(int productId)
	// {
	// return selectedProduct.getSelectedProduct().getSupplierList(productId);
	// }
	//
	public void setSelectedProduct(int productId)
	{
		selectedProduct.setSelectedProduct(productService.findProductById(productId));
	}

	public Product getProductByID()
	{

		System.out.println("Test1");
		/*
		 * for(int i=1;i<10;i++){
		 * System.out.print(productService.getProductbyID(productid).getName());
		 * }
		 */
		System.out.println("Product is " + productService.getProductbyID(productid));
		return productService.getProductbyID(productid);
	}

	public String viewProduct(int id)
	{
		productid = id;
		return "product";
	}

	public void createProduct(int id, String name, int stockLvl, double price, int lowStock, String description,
			ArrayList<Supplier> suppliers, ArrayList<String> imglists)
	{
		Product p = new Product(id, name, stockLvl, price, lowStock, description, null, null);
		productService.addProduct(p);
	}

	public void setProductByID(Product product)
	{
		this.product = product;
	}

	public List<Product> getLowStockProducts()
	{
		return productService.getLowStockProduct();
	}

	public List<Product> getTop25LowStockProducts()
	{
		return productService.getTop25LowStockProducts();
	}

	public List<Product> getProducts(){
		return productService.getProducts();
	}

}
