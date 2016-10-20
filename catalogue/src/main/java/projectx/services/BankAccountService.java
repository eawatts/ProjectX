package projectx.services;

import javax.inject.Inject;

import projectx.persistence.repositories.interfaces.PaymentDetailRepository;

public class BankAccountService{
	
	@Inject
	private PaymentDetailRepository bankRepository;
	
	public void setBankNumber(int[] banknumber){
		
	}
	public void setSortCode(int[] sortcode){
		
	}
}