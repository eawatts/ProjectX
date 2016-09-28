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
	private String account_number;
	
	@Column(name = "sort_code", length=8)
	@Size(min=6, max=8)
	private String sort_code;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getSort_code() {
		return sort_code;
	}

	public void setSort_code(String sort_code) {
		this.sort_code = sort_code;
	}

}
