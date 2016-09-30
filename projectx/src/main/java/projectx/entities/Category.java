package projectx.entities;

import javax.persistence.*;

/**
 * @author DanielH
 *
 */
@Entity
@Table(name = "Category")
public class Category 
{
	@Id @GeneratedValue
	@Column(name = "id")
	private int categoryID;
	
	@Column(name = "name")
	private String name;
	
	/**
	 * Constructor
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
	public int getCategoryID() {
		return categoryID;
	}

	/**
	 * @param categoryID the categoryID to set
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
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
