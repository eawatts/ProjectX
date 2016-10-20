package projectx.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Category;
import projectx.persistence.entities.SubCategory;
import projectx.persistence.repositories.interfaces.CategoryRepository;
import projectx.persistence.repositories.interfaces.SubCategoryRepository;

@Stateless
public class SubCategoryService {

	@Inject
	private SubCategoryRepository subCategoryRepository;
	
	public List<SubCategory> getSubCategories(){
		return subCategoryRepository.getSubCategories();
	}
	
	public SubCategory findByName(String name){
		return subCategoryRepository.findByName(name);
	}
	
	public SubCategory findByid(int id){
		return subCategoryRepository.findByid(id);
	}
}




