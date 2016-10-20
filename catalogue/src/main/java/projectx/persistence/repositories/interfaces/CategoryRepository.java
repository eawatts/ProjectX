package projectx.persistence.repositories.interfaces;

import java.util.List;


import projectx.persistence.entities.Category;



public interface CategoryRepository {
	
	public void persistCategory(Category category);
	public void persistCategories(List<Category> categories);
	public List<Category> getCategories();
	public void updateCategory(Category category);
	public Category findByName(String name);
	public Category findByid(int id);
	
}