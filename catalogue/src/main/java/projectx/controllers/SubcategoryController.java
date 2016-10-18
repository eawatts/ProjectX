package projectx.controllers;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.Category;
import projectx.persistence.entities.Product;
import projectx.persistence.entities.SubCategory;

@Named("subcategory")
@SessionScoped
public class SubcategoryController implements Serializable{

	/**
	 *auto generated serial number 
	 */
	private static final long serialVersionUID = 6816671190729802756L;
	private Product product;
	private Category category;
	private String categoryName = "";
	private String subcategoryName = "";
	private ArrayList <SubCategory> subList = new ArrayList<SubCategory>();
	
	public String getCategoryName(){
		 
		return categoryName;
	}
	
	public String getSubcategoryName(){
		return subcategoryName;
	}

	public ArrayList <SubCategory> getSubCategories(){
		
		subList = populateSubCats();
		return subList;
	}
	
	
	public ArrayList <SubCategory> populateSubCats(){
	
	ArrayList <SubCategory>subList1 = new ArrayList<SubCategory>();	
	
	SubCategory themed = new SubCategory(1, "Themed", 1);
	SubCategory novelty = new SubCategory(2, "Novelty", 1);
	SubCategory classic = new SubCategory(3, "Classic", 1);
	SubCategory gnomeCare = new SubCategory(4, "Gnome Care", 1);

	subList1.add(themed);
	subList1.add(novelty);
	subList1.add(classic);
	subList1.add(gnomeCare);
	
	return subList1;
	
	}

}
