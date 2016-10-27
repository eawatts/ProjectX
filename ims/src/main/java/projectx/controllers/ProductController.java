package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.selected.SelectedProduct;
import projectx.services.ProductService;

@Named("product")
@SessionScoped
public class ProductController implements Serializable
{
	private static final long serialVersionUID = 2390803500375830316L;
	@Inject
	private ProductService productService;
	@Inject
	private SelectedProduct selectedProduct;

	@SuppressWarnings("unused")
	private int selectedProductIndex;
	
	
	private DataModel<Product> productDataModel = null;
	
	
	
	public String getProduct(String id)
	{
		try
		{
			selectedProduct.setSelectedProduct(productService.findProductById(id));
			return "product";
		}
		catch(Exception e)
		{
			return "browse";
		}
	}
	
	public DataModel<Product> listProducts()
	{
		if(productDataModel == null)
			productDataModel = createDataModel();
		return productDataModel;
	}
	
	public DataModel<Product> createDataModel()
	{
		
		return new ListDataModel<Product>(productService.getProducts());
	}
	
	public DataModel<Product> getProductDataModel()
	{
		if(productDataModel == null)
		{
			productDataModel = createDataModel();
		}
		return productDataModel;
	}
	

//	public List<Supplier> getSupplier(int productId)
//	{
//		return selectedProduct.getSelectedProduct().getSupplierList(productId);
//	}
//	
	public void setSelectedProduct(int productId)
	{
		selectedProduct.setSelectedProduct(productService.findProductById(productId));
	}
	
	public Product getProductbyID(){
		int productid = 1;
		for(int i=0;i>10;i++){
			System.out.print(productService.getProductbyID(productid).getName());
		}
		return productService.getProductbyID(productid);
	}

	
	

	public List<Product> getLowStockProducts(){
		return productService.getLowStockProduct();
	}
	

}
