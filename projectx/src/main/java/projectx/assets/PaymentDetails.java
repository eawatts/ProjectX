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
	
	@ManyToOne
	@JoinColumn(name = "user_id_fk", nullable=false)
	private PaymentDetails paymentDetails;
	
	@Column(name = "account_number", length= 20)
	@Size(min=5, max=20)
	private String accountNumber;
	
	@Column(name = "sort_code", length=8)
	@Size(min=6, max=8)
	private String sortCode;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
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
}
