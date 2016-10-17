package projectx.persistence.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.selected.SelectedProduct;
import projectx.persistence.services.ProductService;

@Named("products")
@SessionScoped
public class ProductController implements Serializable
{
	private ProductService productService;
	private SelectedProduct selectedProduct;
	@SuppressWarnings("unused")
	private int selectedProductIndex;
	private DataModel<Product> dataModel = null;
	
}
