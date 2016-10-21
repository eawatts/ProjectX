package projectx.persistence.webentities;

import java.util.List;

import projectx.persistence.entities.Category;
import projectx.persistence.entities.SubCategory;
import java.io.Serializable;


@Deprecated
public class SubCategoriesWithinCategory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1240136532829893259L;
	private Category category;
	private List<SubCategory> subCatList;
	
	@Deprecated
 	public SubCategoriesWithinCategory(Category category, List<SubCategory> subCatList){
		
		this.category = category;
		this.subCatList = subCatList;
	}

	@Deprecated
	public void setCategory(Category category) {
		this.category = category;
	}

	@Deprecated
	public void setSubCatList(List<SubCategory> subCatList) {
		this.subCatList = subCatList;
	}


	public Category getCategory() {
		return category;
	}

	public List<SubCategory> getSubCatList() {
		return subCatList;
	}
	
	
}
