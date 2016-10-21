package projectx.persistence.entities;

import javax.persistence.*;

@NamedQueries({ @NamedQuery(name = Address.FIND_BY_ID, query = "Select a FROM Address a WHERE a.id= : Aid"),
		@NamedQuery(name = Address.FIND_BY_LINE1, query = "Select a FROM Address a WHERE a.line_1= : line_1"),
		@NamedQuery(name = Address.FIND_BY_LINE2, query = "Select a FROM Address a WHERE a.line_2= : line_2"),
		@NamedQuery(name = Address.FIND_BY_POSTCODE, query = "Select a FROM Address a WHERE a.postcode= : postcode"),
		@NamedQuery(name = Address.INSERT_NEW_ADDRESS, query = "INSERT INTO Address (id, line_1, line_2, postcode) VALUES( :Aid, :line_1, :line_2, :postcode, :active)"),
		@NamedQuery(name = Address.UPDATE_ACTIVE, query = "UDATE Address  a SET a.active = :status WHERE a.id = :Aid") })

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
	private Integer id;
	@Column(name = "line_1")
	private String line1;
	@Column(name = "line_2")
	private String line2;
	private String houseNumber;
	private String street;
	private String town;
	@Column(name = "postcode")
	private String postcode;

	public Address(Integer id, String houseNumber, String street, String town, String postcode) {
		this.id = id;
		this.houseNumber = houseNumber;
		this.street = street;
		this.town = town;
		this.postcode = postcode;
	}

	// GETTERS

	public Integer getId() {
		return id;
	}

	public String getLine1() {
		return line1;
	}

	public String getLine2() {
		return line2;
	}

	public String getPostcode() {
		return postcode;
	}
	
	public String getHousenumber() {
		return houseNumber;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getTown() {
		return town;
	}

	// SETTERS

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public void setHousenumber(String housenumber) {
		this.houseNumber = housenumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setTown(String town) {
		this.town = town;
	}
}
