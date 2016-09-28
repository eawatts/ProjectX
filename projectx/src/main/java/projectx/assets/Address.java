package projectx.assets;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

	@Id
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "line_1")
	private String line_1;
	
	@Column(name = "line_2")
	private String line_2;
	
	@Column(name = "postcode")
	private String postcode;

	/**
	 * Constructor
	 * 
	 * @author Tom ;)
	 * @param id
	 * @param line_1
	 * @param line_2
	 * @param postcode
	 * 
	 */
	Address(int id, String line_1, String line_2, String postcode) {
		this.id = id;
		this.line_1 = line_1;
		this.line_2 = line_2;
		this.postcode = postcode;
	}

	// GETTERS

	/**
	 * getID method
	 * 
	 * @return Address id
	 */
	public int getId() {
		return id;
	}

	/**
	 * getLine_1
	 * 
	 * @return Address line_1
	 */
	public String getLine_1() {
		return line_1;
	}

	/**
	 * getLine_2
	 * 
	 * @return Address line_2
	 */
	public String getLine_2() {
		return line_2;
	}

	/**
	 * getPostcode
	 * 
	 * @return Address postcode
	 */
	public String getPostcode() {
		return postcode;
	}

	// SETTERS
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public void setLine_1(String line_1) {
		this.line_1 = line_1;
	}

	public void setLine_2(String line_2) {
		this.line_2 = line_2;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

}
