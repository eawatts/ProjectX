package projectx.assets;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PaymentDetails")
public class PaymentDetails {
	
	private int id;
	private int user_id;
	private String account_number;
	private String sort_code;

	@Id
	@GeneratedValue
	@Column(name = "id", length=80, nullable=false)
	@NotNull
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "user_id")
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Column(name = "account_number")
	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	@Column(name = "sort_code")
	public String getSort_code() {
		return sort_code;
	}

	public void setSort_code(String sort_code) {
		this.sort_code = sort_code;
	}

}
