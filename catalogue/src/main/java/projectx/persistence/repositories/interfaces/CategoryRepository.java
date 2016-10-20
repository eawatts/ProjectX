package projectx.persistence.repositories.interfaces;

import java.util.List;


import projectx.persistence.entities.Category;
import projectx.persistence.webentities.SubCategoriesWithinCategory;


public interface CategoryRepository {
	
	public void persistCategory(Category category);
	public void persistCategories(List<Category> categories);
	public List<Category> getCategories();
	public List<SubCategoriesWithinCategory> getCategoriesWithSubs();
	public void updateCategory(Category category);
	public Category findByName(String name);
	public Category findByid(int id);
	
}