package projectx.persistence.controllers;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.selected.SelectedProduct;
import projectx.persistence.services.ProductService;

@Named("products")
@SessionScoped
public class ProductController implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2390803500375830316L;
	@Inject
	private ProductService productService;
	@Inject
	private SelectedProduct selectedProduct;
	@SuppressWarnings("unused")
	private int selectedProductIndex;
	private DataModel<Product> productDataModel = null;
	/**
	 * @return the productService
	 */
	public ProductService getProductService()
	{
		return productService;
	}
	/**
	 * @param productService the productService to set
	 */
	public void setProductService(ProductService productService)
	{
		this.productService = productService;
	}
	/**
	 * @return the selectedProduct
	 */
	public SelectedProduct getSelectedProduct()
	{
		return selectedProduct;
	}
	/**
	 * @param selectedProduct the selectedProduct to set
	 */
	public void setSelectedProduct(SelectedProduct selectedProduct)
	{
		this.selectedProduct = selectedProduct;
	}
	/**
	 * @return the productList
	 */
	public DataModel<Product> getProductList()
	{
		return productDataModel;
	}
	/**
	 * @param productList the productList to set
	 */
	public void setProductList(DataModel<Product> productList)
	{
		this.productDataModel = productList;
	}
	
}
