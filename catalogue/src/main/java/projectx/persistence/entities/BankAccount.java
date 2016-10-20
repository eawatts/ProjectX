package projectx.persistence.entities;

public class BankAccount {
	private char[] banknumber;
	private char[] sortcode;
	
	public BankAccount(char[] banknumber, char[] sortcode){
		this.banknumber=banknumber;
		this.sortcode=sortcode;
		
	}
	
	public char[] getBanknumber() {
		return banknumber;
	}

	public void setBanknumber(char[] banknumber) {
		this.banknumber = banknumber;
	}

	public char[] getSortcode() {
		return sortcode;
	}

	public void setSortcode(char[] sortcode) {
		this.sortcode = sortcode;
	}
}
