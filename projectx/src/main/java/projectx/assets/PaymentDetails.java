package projectx.assets;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "PaymentDetails")
public class PaymentDetails {

	@Id
	@Column(name = "id", length=80, nullable=false)
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@NotNull
	@Size(min=1, max=8)
	private int id;
	
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
	public String getAccount_number() {
		return account_number;
	}

	/**
	 * @param account_number the account_number to set
	 */
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	/**
	 * @return the sort_code
	 */
	public String getSort_code() {
		return sort_code;
	}

	/**
	 * @param sort_code the sort_code to set
	 */
	public void setSort_code(String sort_code) {
		this.sort_code = sort_code;
	}

	@ManyToOne
	@JoinColumn(name = "user_id_fk", nullable=false)
	private User user;
	
	@Column(name = "account_number", length= 20)
	@Size(min=5, max=20)
	private String account_number;
	
	@Column(name = "sort_code", length=8)
	@Size(min=6, max=8)
	private String sort_code;
	
	public PaymentDetails(int id, User user, String account_number, String sort_code)
	{
		this.id = id;
		this.user = user;
		this.account_number = account_number;
		this.sort_code = sort_code;
	}

}
