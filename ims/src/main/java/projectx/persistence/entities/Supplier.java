package projectx.persistence.entities;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NamedQueries({
		@NamedQuery(name = Supplier.FIND_BY_SUPPLIER_NAME, query = "SELECT s FROM Supplier s WHERE s.name = :Suppliername"),
		@NamedQuery(name = Supplier.FIND_BY_SUPPLIER_ID, query = "SELECT s FROM Supplier s WHERE s.id = :Supplierid"),
/*		@NamedQuery(name = Supplier.UPDATE_SUPPLIER, query = ""),
		@NamedQuery(name = Supplier.CREATE_SUPPLIER, query = ""),
		@NamedQuery(name = Supplier.GET_SUPPLIERS, query = ""),*/
})

@Entity
@Table(name = "supplier")
public class Supplier implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String FIND_BY_SUPPLIER_NAME = "Supplier.findBySupplierName";
	public static final String FIND_BY_SUPPLIER_ID = "Supplier.findBySupplierId";
	public static final String UPDATE_SUPPLIER = "Supplier.updateSupplier";
	public static final String CREATE_SUPPLIER = "Supplier.createSupplier";
	public static final String GET_SUPPLIERS = "Supplier.getSuppliers";
	public static final String DELETE_SUPPLIERS = "Supplier.deleteSupplier";

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name", nullable = false, length = 50)
	@Size(min = 2, max = 50)
	private String name;

	@Column(name = "address_line_1", nullable = false, length = 100)
	@Size(min = 2, max = 100)
	private String addressLine1;

	@Column(name = "address_line_2", nullable = false, length = 100)
	@Size(min = 2, max = 100)
	private String addressLine2;

	@Column(name = "postcode", nullable = false, length = 8)
	@Size(min = 5, max = 8)
	private String postcode;

	@Column(name = "phone", nullable = false, length = 20)
	@Size(min = 11, max = 30)
	private String phone;

	public Supplier() {
	}

	public Supplier(Integer id, String name, String addressLine1, String addressLine2, String postcode, String phone) {
		this.id = id;
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.postcode = postcode;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public boolean equals(Object obj) {

		return (obj != null && getClass() == obj.getClass() && id != null) ? id.equals(((Product) obj).id)
				: (obj == this);
	}

	@Override
	public int hashCode() {
		return (id != null) ? (getClass().hashCode() + id.hashCode()) : super.hashCode();
	}
}
