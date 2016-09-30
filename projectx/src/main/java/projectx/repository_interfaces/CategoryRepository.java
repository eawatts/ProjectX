package projectx.repository_interfaces;

import java.util.List;

import projectx.entities.Category;


public interface CategoryRepository
{
	
	public void saveCategory(Category category);
	public void saveCategories(List<Category> categories);
	public List<Category> getCategories();
	public void updateCategory(Category category);
	public Category findByName(String name);
	public Category findByid(long id);
	
}