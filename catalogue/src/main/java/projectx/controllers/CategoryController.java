package projectx.controllers;


import java.io.Serializable;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Category;
import projectx.persistence.webentities.SubCategoriesWithinCategory;
import projectx.services.CategoryService;

@Named("category")
@RequestScoped
public class CategoryController implements Serializable{

	@Inject
	private CategoryService categoryService;

		/**
	 * Auto generated
	 */
	private static final long serialVersionUID = -8865755023593376085L;
	
		public List <Category> getCategories(){
			return categoryService.getCategories();
		}
		
		public List<SubCategoriesWithinCategory> getCategoriesWithSubs(){
			return categoryService.getCategoriesWithSubs();
		}
		
		public Category findByName(String name){
			return categoryService.findByName(name);
		}
		
		public Category findByid(int id){
			return categoryService.findByid(id);
		}
}
	