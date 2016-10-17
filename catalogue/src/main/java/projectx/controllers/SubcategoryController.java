package projectx.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.Category;
import projectx.persistence.entities.Product;

@Named("subcategory")
@SessionScoped
public class SubcategoryController implements Serializable{

	/**
	 *auto generated serial number 
	 */
	private static final long serialVersionUID = 6816671190729802756L;
	private Product product;
	private Category category;
	private String categoryName = "";
	private String subcategoryName = "";
	
	
	public String getCategoryName(){
		 
		return categoryName;
	}
	
	public String getSubcategoryName(){
		return subcategoryName;
	}
}
