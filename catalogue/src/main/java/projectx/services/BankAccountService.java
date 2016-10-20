package projectx.services;

import javax.inject.Inject;

import projectx.persistence.entities.BankAccount;
import projectx.persistence.repositories.interfaces.PaymentDetailRepository;

public class BankAccountService{
	
	@Inject
	private PaymentDetailRepository bankRepository;
	
	public void setBankNumber(String banknumber){
		
	}
	public void setSortCode(String sortcode){
		
	}
	public BankAccount createNewBankAccout(String banknumber, String sortcode) {
		// TODO Auto-generated method stub
		return null;
	}
}