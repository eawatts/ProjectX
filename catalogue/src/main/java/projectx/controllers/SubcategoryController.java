package projectx.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Category;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.SubCategory;
import projectx.services.CategoryService;

@Named("subcategory")
@SessionScoped
public class SubcategoryController implements Serializable{

	/**
	 *auto generated serial number 
	 */
	private static final long serialVersionUID = 6816671190729802756L;
	private String categoryName = "Gnomes";
	private String subcategoryName = "Seasonal";
	private ArrayList <SubCategory> subList = new ArrayList<SubCategory>();
	
	@Inject
	private SubCategoryService subCategoryService;
	
	
	public List <Category> getSubCategories(){
		
		return subCategoryService.getSubCategories();
	}
	
	public Category findByName(String name){
		return SubCategoryService.findByName(name);
	}
	
	public Category findByid(int id){
		return SubCategoryService.findByid(id);
	}

}
