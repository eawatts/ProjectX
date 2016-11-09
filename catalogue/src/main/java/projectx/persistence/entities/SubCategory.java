package projectx.persistence.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SubCategory")
@NamedQueries({ @NamedQuery(name = SubCategory.FIND_BY_ID, query = "SELECT s FROM subcategory s WHERE s.id = :id"),
		@NamedQuery(name = SubCategory.FIND_BY_NAME, query = "SELECT s FROM subcategory s WHERE s.name = :name"),
		@NamedQuery(name = SubCategory.FIND_ALL, query = "SELECT s FROM subcategory s WHERE s.id = :id"),
		@NamedQuery(name = SubCategory.INSERT_CATEGORY, query = "INSERT INTO subcategory s (id, name) VALUES(:id, :name)"),
		@NamedQuery(name = SubCategory.UPDATE_CATEGORY, query = "UPDATE subcategory s SET s.id=:newid, s.name=:newname WHERE s.id =:id"),
		@NamedQuery(name = SubCategory.FIND_PRODUCTS, query = "SELECT p.name, s.name, c.name FROM products p JOIN subcategory s ON p.subcategory_id = s.id JOIN "
				+ "category c ON s.category_id = c.id WHERE s.id = :id"),
		@NamedQuery(name = SubCategory.FIND_MAIN_CATEGORY, query = "SELECT s.name, c.name FROM subcategory s JOIN category c ON s.category_id = c.id ORDER BY c.name DESC") })
public class SubCategory {

	public static final String FIND_BY_ID = "SubCategory.findByID";
	public static final String FIND_BY_NAME = "SubCategory.findByName";
	public static final String FIND_ALL = "SubCategory.findAll";
	public static final String FIND_PRODUCTS = "SubCategory.findProducts";
	public static final String INSERT_CATEGORY = "SubCategory.insert";
	public static final String UPDATE_CATEGORY = "SubCategory.update";
	public static final String FIND_MAIN_CATEGORY = "SubCategory.findMainCategory";

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private int subCategoryID;

	@Column(name = "name", nullable = false)
	private String name;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	@NotNull
	private Category category;
	
	@Column(name = "product_image_filepath", nullable=false)
	private String product_image_filepath;
	
	

	private List<Product> products;
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param nName
	 * @param c_id
	 */
	public SubCategory(int id, String nName, Category category, ArrayList<Product> Products, String image) {
		setSubCategoryID(id);
		setName(nName);
		this.category = category;
		this.setProducts(Products);
		this.product_image_filepath=image;
	}

	/**
	 * @return the subcategoryID
	 */
	public int getSubCategoryID() {
		return subCategoryID;

	}

	/**
	 * @param subCategoryID
	 * @param subcategoryID
	 *            the subcategoryID to set
	 */
	public void setSubCategoryID(int subCategoryID) {
		this.subCategoryID = subCategoryID;
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
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
		if(!category.getSubCategories().contains(this))
			category.addSubCategory(this);
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	public String getProduct_image_filepath() {
		return product_image_filepath;
	}

	public void setProduct_image_filepath(String product_image_filepath) {
		this.product_image_filepath = product_image_filepath;
	}
}
