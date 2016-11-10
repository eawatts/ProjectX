package projectx.persistence.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Category")
@NamedQueries({ @NamedQuery(name = Category.FIND_BY_ID, query = "SELECT c FROM category c WHERE c.id = :id"),
		@NamedQuery(name = Category.FIND_BY_NAME, query = "SELECT c FROM category c WHERE c.name = :name"),
		@NamedQuery(name = Category.FIND_ALL, query = "SELECT c FROM category c WHERE c.id = :id"),
		@NamedQuery(name = Category.INSERT_CATEGORY, query = "INSERT INTO category c (id, name) VALUES(:id, :name)"),
		@NamedQuery(name = Category.UPDATE_CATEGORY, query = "UPDATE category c SET c.id=:newid, c.name=:newname WHERE c.id =:id") })

public class Category {
	public static final String FIND_BY_ID = "Category.findByID";
	public static final String FIND_BY_NAME = "Category.findByName";
	public static final String FIND_ALL = "Category.findAll";
	public static final String INSERT_CATEGORY = "Category.insert";
	public static final String UPDATE_CATEGORY = "Category.update";
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private int categoryID;

	@Column(name = "name", nullable = false)
	private String name;

	/**
	 * Maps the ManyToOne from sub catagories to allow Catagory to hold the list of sub Categories
	 * Because SQL doesnt handle this but Java can
	 */
	@OneToMany(mappedBy="Category")
	private List<SubCategory> subCategories;
	
	@Column(name = "product_image_filepath", nullable=false)
	private String productImageFilepath;
	

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param nName
	 * @param subcategories 
	 */
	public Category(int id, String nName, List<SubCategory> subcategories, String productImageFilepath) {
		setCategoryID(id);
		setName(nName);
		this.subCategories = subcategories;
		this.productImageFilepath=productImageFilepath;
	}

	/**
	 * @return the categoryID
	 */
	public int getCategoryID() {
		return categoryID;
	}

	/**
	 * @param categoryID
	 *            the categoryID to set
	 */
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the subCategories
	 */
	public List<SubCategory> getSubCategories() {
		return subCategories;
	}
	
	public void addSubCategory(SubCategory subCategory) {
		if(subCategories==null)
			subCategories = new ArrayList<>();
		subCategories.add(subCategory);
		if(subCategory.getCategory() != this)
			subCategory.setCategory(this);
	}

	public String getProductImageFilepath() {
		return productImageFilepath;
	}

	public void setProductImageFilepath(String productImageFilepath) {
		this.productImageFilepath = productImageFilepath;
	}

}
