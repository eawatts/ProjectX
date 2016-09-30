package projectx.entities;

import javax.persistence.*;

/**
 * @author DanielH
 *
 */
@Entity
@Table(name = "Category")
@NamedQueries({ @NamedQuery(name = Category.FIND_BY_ID, query = "SELECT c FROM category c WHERE c.id = :id"),
		@NamedQuery(name = Category.FIND_BY_NAME, query = "SELECT c FROM category c WHERE c.name = :name"),
		@NamedQuery(name = Category.FIND_ALL, query = "SELECT c FROM category c WHERE c.id = :id"),
		@NamedQuery(name = Category.INSERT_CATEGORY, query = "INSERT INTO category c (id, name) VALUES(:id, :name)")})
public class Category
{
	public static final String FIND_BY_ID = "Category.findByID";
	public static final String FIND_BY_NAME = "Category.findByName";
	public static final String FIND_ALL = "Category.findAll";
	public static final String INSERT_CATEGORY = "Category.insert";
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private int categoryID;

	@Column(name = "name", nullable = false)
	private String name;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param nName
	 */
	public Category(int id, String nName)
	{
		setCategoryID(id);
		setName(nName);
	}

	/**
	 * @return the categoryID
	 */
	public int getCategoryID()
	{
		return categoryID;

	}

	/**
	 * @param categoryID
	 *            the categoryID to set
	 */
	public void setCategoryID(int categoryID)
	{
		this.categoryID = categoryID;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

}
