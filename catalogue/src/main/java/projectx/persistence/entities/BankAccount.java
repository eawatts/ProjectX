package projectx.persistence.entities;

public class BankAccount {
	private char[] banknumber;
	private char[] sortcode;
	
	BankAccount(char[] cs, char[] cs2){
		this.banknumber=cs;
		this.sortcode=cs2;
		
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
