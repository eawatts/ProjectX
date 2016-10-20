package projectx.services;

import javax.inject.Inject;
import javax.ejb.Stateless;
import projectx.persistence.entities.BankAccount;
import projectx.persistence.repositories.interfaces.PaymentDetailRepository;

@Stateless
public class BankAccountService{
	
	@Inject
	private PaymentDetailRepository bankRepository;
	
	public char[] formatBankNumber(String banknumbers){
		char[] banknumber = banknumbers.toCharArray();
		return banknumber;
	}
	public char[] formatSortCode(String sortcodes){
		char[] sortcode = sortcodes.toCharArray();
		return sortcode;
	}
	public BankAccount createNewBankAccout(String banknumber, String sortcode) {
		BankAccount userBankAccount = new BankAccount(formatBankNumber(banknumber),formatSortCode(sortcode));
		return userBankAccount;
	}
}