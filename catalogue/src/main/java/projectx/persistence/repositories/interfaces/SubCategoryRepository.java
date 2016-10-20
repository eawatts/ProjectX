package projectx.persistence.repositories.interfaces;

import java.util.List;

import projectx.persistence.entities.SubCategory;
import projectx.persistence.webentities.SubCategoriesWithinCategory;

public interface SubCategoryRepository {
	
	public void persistSubCategory(SubCategory subCategory);
	public void persistSubCategories(List<SubCategory> subCategories);
	public List<SubCategory> getSubCategories();
	public List<SubCategoriesWithinCategory> getCategoryWithSubs();
	public void updateSubCategory(SubCategory subCategory);
	public SubCategory findByName(String name);
	public SubCategory findByid(int id);
	
}