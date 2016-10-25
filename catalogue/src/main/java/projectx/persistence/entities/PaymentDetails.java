package projectx.persistence.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NamedQueries (
	{
		@NamedQuery (name=PaymentDetails.FIND_BY_USER, query= "SELECT d FROM PaymentDetails d WHERE d.user_id=:user_id"),
		@NamedQuery (name=PaymentDetails.FIND_BY_ID, query= "SELECT d FROM PaymentDetails d WHERE d.id=:id"),
		@NamedQuery (name=PaymentDetails.CREATE_PAYMENTDETAIL, query= "INSERT into PaymentDetails (id, user_id, account_number, sort_code) VALUES (:id, :user_id, :account_number, :sort_code)"),
		@NamedQuery (name=PaymentDetails.UPDATE_PAYMENTDETAIL, query= "UPDATE PaymentDetails SET (user_id=:user_id, account_number=:account_number, sort_code=:sort_code) WHERE id=:id"), 
		@NamedQuery (name=PaymentDetails.SHOW_ALL, query= "SELECT * FROM PaymentDetails"),
	}
)

@Entity
@Table(name = "PaymentDetails")
public class PaymentDetails {
	
	public static final String FIND_BY_USER= "PaymentDetails.findByUser";
	public static final String FIND_BY_ID= "PaymentDetails.findById";
	public static final String CREATE_PAYMENTDETAIL= "PaymentDetails.createPaymentDetail";
	public static final String UPDATE_PAYMENTDETAIL= "PaymentDetails.UpdatePaymentDetail";
	public static final String SHOW_ALL= "PaymentDetails.showAll";

	@Id
	@Column(name = "id", nullable=false)
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@NotNull
	private Integer id;
	
	@Column(name = "account_number", length= 20)
	@Size(min=5, max=20)
	private String accountNumber;
	
	@Column(name = "sort_code", length=8)
	@Size(min=6, max=8)
	private String sortCode;
	
	public PaymentDetails() {
	}
	
	public PaymentDetails(Integer id, String accountNumber, String sortCode)
	{
		this.id = id;
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccount_number(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSort_code() {
		return sortCode;
	}

	public void setSort_code(String sort_code) {
		this.sortCode = sort_code;
	}
}
