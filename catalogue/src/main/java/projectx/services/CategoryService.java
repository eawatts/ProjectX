package projectx.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Category;
import projectx.persistence.repositories.interfaces.CategoryRepository;
import projectx.persistence.webentities.SubCategoriesWithinCategory;

@Stateless
public class CategoryService {

	@Inject
	private CategoryRepository categoryRepository;
	
	public List<Category> getCategories(){
		return categoryRepository.getCategories();
	}
	
	public List<SubCategoriesWithinCategory> getCategoriesWithSubs(){
		return categoryRepository.getCategoriesWithSubs();
	}
	
	public Category findByName(String name){
		return categoryRepository.findByName(name);
	}
	
	public Category findByid(int id){
		return categoryRepository.findByid(id);
	}
}
