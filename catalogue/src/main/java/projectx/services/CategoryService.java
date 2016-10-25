package projectx.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Category;
import projectx.persistence.repositories.interfaces.CategoryRepository;


@Stateless
public class CategoryService {

	@Inject
	private CategoryRepository categoryRepository;
	
	public List<Category> getCategories(){
		return categoryRepository.getCategories();
	}
	
	
	public Category findByName(String name){
		return categoryRepository.findByName(name);
	}
	
	public Category findById(int id){
		return categoryRepository.findById(id);
	}
}
