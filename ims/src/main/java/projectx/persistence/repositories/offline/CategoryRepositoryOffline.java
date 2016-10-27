package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.Category;
import projectx.persistence.repositories.CategoryRepository;
import projectx.persistence.repositories.offline.database.OfflineDB;

@Stateless
@Default
public class CategoryRepositoryOffline implements CategoryRepository {
	
	@Inject
	private OfflineDB db;

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
		return db.findCategoryByName(name);
	}

	@Override
	public Category findByid(long id)
	{
		// TODO Auto-generated method stub
		return db.findCategoryById(id);
	}

	
}
