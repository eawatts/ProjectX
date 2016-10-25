package projectx.controllers;


import java.io.Serializable;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Category;
import projectx.services.CategoryService;

@Named("category")
@SessionScoped
public class CategoryController implements Serializable{

	@Inject
	private CategoryService categoryService;
	
	private int subcategoryid;
		/**
	 * Auto generated
	 */
	private static final long serialVersionUID = -8865755023593376085L;
	
		public List <Category> getCategories(){
			return categoryService.getCategories();
		}
		
		public Category findByName(String name){
			return categoryService.findByName(name);
		}
		
		public Category findById(){
			System.out.println(subcategoryid);
			return categoryService.findById(subcategoryid);
		}
		public String viewSubcatagory(int id){
			subcategoryid = id;
			return "catalogue_subcategories";
			
		}
}
	