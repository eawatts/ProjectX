package projectx.services;

//import javax.inject.Inject;
import javax.ejb.Stateless;
import projectx.persistence.entities.BankAccount;
//import projectx.persistence.repositories.interfaces.PaymentDetailRepository;

@Stateless
public class BankAccountService{
	
	/*@Inject
	private PaymentDetailRepository bankRepository;
	*/
	public int formatBankNumber(String bankNumbers){
		return Integer.parseInt(bankNumbers);
	}
	public int formatSortCode(String sortcode){
		return Integer.parseInt(sortcode);
	}
	public BankAccount createNewBankAccout(String banknumber, String sortcode) {
		return new BankAccount(formatBankNumber(banknumber),formatSortCode(sortcode));
	}
}