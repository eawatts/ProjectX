package projectx.persistence.entities;

import javax.persistence.*;

@NamedQueries({ @NamedQuery(name = Address.FIND_BY_ID, query = "Select a FROM Address a WHERE a.id= : Aid"),
		@NamedQuery(name = Address.FIND_BY_LINE1, query = "Select a FROM Address a WHERE a.line_1= : line_1"),
		@NamedQuery(name = Address.FIND_BY_LINE2, query = "Select a FROM Address a WHERE a.line_2= : line_2"),
		@NamedQuery(name = Address.FIND_BY_POSTCODE, query = "Select a FROM Address a WHERE a.postcode= : postcode"),
		@NamedQuery(name = Address.INSERT_NEW_ADDRESS, query = "INSERT INTO Address (id, line_1, line_2, postcode) VALUES( :Aid, :line_1, :line_2, :postcode, :active)"),
		@NamedQuery(name = Address.UPDATE_ACTIVE, query =  "UDATE Address  a SET a.active = :status WHERE a.id = :Aid")})
@Entity
@Table(name = "Address")
public class Address {

	public static final String FIND_BY_ID = "Address.findById";
	public static final String FIND_BY_LINE1 = "Address.findByLine1";
	public static final String FIND_BY_LINE2 = "Address.findByLine2";
	public static final String FIND_BY_POSTCODE = "Address.findByPostCode";
	public static final String INSERT_NEW_ADDRESS = "Address.new";
	public static final String UPDATE_ACTIVE = "Address.deactivate";
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
