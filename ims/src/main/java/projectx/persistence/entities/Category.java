package projectx.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity
@Table(name = "category")
@NamedQueries({
		/*
		 * @NamedQuery(name = Category.FIND_BY_ID, query =
		 * "SELECT * FROM category c WHERE c.id = :id"),
		 * 
		 * @NamedQuery(name = Category.FIND_BY_NAME, query =
		 * "SELECT c FROM category c WHERE c.name = :name"),
		 * 
		 * @NamedQuery(name = Category.FIND_ALL, query =
		 * "SELECT c FROM category c WHERE c.id = :id"),
		 * 
		 * @NamedQuery(name = Category.INSERT_CATEGORY, query =
		 * "INSERT INTO category c (id, name) VALUES(:id, :name)"),
		 * 
		 * @NamedQuery(name = Category.UPDATE_CATEGORY, query =
		 * "UPDATE category c SET c.id=:newid, c.name=:newname WHERE c.id =:id")
		 */
})

public class Category {
	
	public static final String FIND_BY_ID = "Category.findByID";
	public static final String FIND_BY_NAME = "Category.findByName";
	public static final String FIND_ALL = "Category.findAll";
	public static final String INSERT_CATEGORY = "Category.insert";
	public static final String UPDATE_CATEGORY = "Category.update";
	
	@Id
	@GeneratedValue()
	@Column(name = "id", nullable = false)
	private int categoryID;

	@Column(name = "name", nullable = false)
	private String name;

	public Category() {
	}

	public Category(int categoryID, String name) {
		super();
		this.categoryID = categoryID;
		this.name = name;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
