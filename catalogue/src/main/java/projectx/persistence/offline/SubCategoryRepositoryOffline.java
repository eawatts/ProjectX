package projectx.persistence.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.SubCategory;
import projectx.persistence.offline.database.OfflineDB;
import projectx.persistence.repositories.interfaces.SubCategoryRepository;
import projectx.persistence.webentities.SubCategoriesWithinCategory;

@Stateless
@Default
public class SubCategoryRepositoryOffline implements SubCategoryRepository {

	@Inject
	private OfflineDB db;
	
	@Override
	public void persistSubCategory(SubCategory subCategory){
		
	}
	
	@Override
	public void persistSubCategories(List<SubCategory> subCategories){
		
	}
	
	@Override
	public List<SubCategory> getSubCategories(){
		return db.getSubCategories();
	}
	
	@Override
	public void updateSubCategory(SubCategory subCategory){
		
	}
	
	@Override
	public SubCategory findByName(String name){
		return db.findSubByName(name);
	}
	
	@Override
	public SubCategory findByid(int id){
		return db.findSubByid(id);
	}

	@Override
	public List<SubCategoriesWithinCategory> getCategoryWithSubs() {
		// TODO Auto-generated method stub
		return null;
	}
}
