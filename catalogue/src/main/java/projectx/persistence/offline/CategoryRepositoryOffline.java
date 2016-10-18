package projectx.persistence.offline;

import java.util.List;

import javax.inject.Inject;

import projectx.persistence.entities.Category;
import projectx.persistence.offline.database.OfflineDB;
import projectx.persistence.repositories.interfaces.CategoryRepository;

public class CategoryRepositoryOffline implements CategoryRepository {
	
	@Inject
	private OfflineDB db;

	@Override
	public void persistCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void persistCategories(List<Category> categories) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
