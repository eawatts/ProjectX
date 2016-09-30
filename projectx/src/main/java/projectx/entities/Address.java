package projectx.entities;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {

	@Id
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "line_1")
	private String line1;
	
	@Column(name = "line_2")
	private String line2;
	
	@Column(name = "postcode")
	private String postcode;

	/**
	 * Constructor
	 * 
	 * @author Tom ;)
	 * @param id
	 * @param line1
	 * @param line2
	 * @param postcode
	 * 
	 */
	Address(int id, String line1, String line2, String postcode) {
		this.id = id;
		this.line1 = line1;
		this.line2 = line2;
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
	 * @return Address line1
	 */
	public String getLine1() {
		return line1;
	}

	/**
	 * getLine_2
	 * 
	 * @return Address line2
	 */
	public String getLine2() {
		return line2;
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

	public void setLine_1(String line1) {
		this.line1 = line1;
	}

	public void setLine_2(String line2) {
		this.line2 = line2;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}
