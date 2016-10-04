package projectx.persistence.offline;

import java.util.List;

import javax.inject.Inject;

import projectx.persistence.entities.Category;
import projectx.persistence.entities.User;
import projectx.persistence.repositories.interfaces.CategoryRepository;
import projectx.persistence.repositories.interfaces.UserRepository;

public class CategoryRepositoryOffline implements CategoryRepository {
	
	@Inject
	private InitialData db;

	@Override
	public void persistCategory(Category category)
	{
		db.addCategory(category);
		
	}

	@Override
	public void persistCategories(List<Category> categories)
	{
		for(Category category : categories)
		{
			persistCategory(category);
		}
		
	}

	@Override
	public List<Category> getCategories()
	{
		return db.getCategories();
	}

	@Override
	public void updateCategory(Category category)
	{
		// TODO Auto-generated method stub
		db.updateCategory(category);
		
	}

	@Override
	public Category findByName(String name)
	{
		// TODO Auto-generated method stub
		db.findCategoryByName(name);
	}

	@Override
	public Category findByid(long id)
	{
		// TODO Auto-generated method stub
		db.findCategoryById(id);
	}

	
}
