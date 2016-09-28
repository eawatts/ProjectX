package projectx.assets;

import javax.persistence.*;

@Entity
@Table(name = "OrderType")
public class OrderType {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param name
	 */

	OrderType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
