package projectx.persistence.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.Category;
import projectx.persistence.offline.database.OfflineDB;
import projectx.persistence.repositories.interfaces.CategoryRepository;
import projectx.persistence.webentities.SubCategoriesWithinCategory;
@Stateless
@Default
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
		return db.getCategories();
	}
	
	@Override
	public List<SubCategoriesWithinCategory> getCategoriesWithSubs(){
		return db.getCategoriesWithSubs();
	}
	
	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category findByName(String name) {
		return db.findByName(name);
	}

	@Override
	public Category findByid(int id) {
		return db.findByid(id);
	}
}
