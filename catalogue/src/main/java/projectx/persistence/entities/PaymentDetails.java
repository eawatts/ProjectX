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

	@Id
	@Column(name = "id", nullable=false)
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@NotNull
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "user_id_fk", nullable=false)
	private PaymentDetails paymentDetails;
	
	@Column(name = "account_number", length= 20)
	@Size(min=5, max=20)
	private String accountNumber;
	
	@Column(name = "sort_code", length=8)
	@Size(min=6, max=8)
	private String sortCode;

	@ManyToOne
	@JoinColumn(name = "user_id_fk", nullable=false)
	private User user;
	
	@Column(name = "account_number", length= 20)
	@Size(min=5, max=20)
	private String account_number;
	
	public PaymentDetails(int id, User user, String accountNumber, String sortCode)
	{
		this.id = id;
		this.user = user;
		this.account_number = accountNumber;
		this.sortCode = sortCode;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the account_number
	 */
	public String getAccountNumber() {
		return account_number;
	}

	/**
	 * @param accountNumber the account_number to set
	 */
	public void setAccount_number(String accountNumber) {
		this.account_number = accountNumber;
	}

	/**
	 * @return the sort_code
	 */
	public String getSort_code() {
		return sortCode;
	}

	/**
	 * @param sort_code the sort_code to set
	 */
	public void setSort_code(String sort_code) {
		this.sortCode = sort_code;
	}
	public static final String FIND_BY_USER= "PaymentDetails.findByUser";
	public static final String FIND_BY_ID= "PaymentDetails.findById";
	public static final String CREATE_PAYMENTDETAIL= "PaymentDetails.createPaymentDetail";
	public static final String UPDATE_PAYMENTDETAIL= "PaymentDetails.UpdatePaymentDetail";
	public static final String SHOW_ALL= "PaymentDetails.showAll";

}
