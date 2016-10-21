package projectx.persistence.entities;

public class BankAccount {
	private int bankNumber;
	private int sortCode;

	public BankAccount(int bankNumber, int sortCode) {
		this.bankNumber = bankNumber;
		this.sortCode = sortCode;
	}

	public int getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(int bankNumber) {
		this.bankNumber = bankNumber;
	}

	public int getSortCode() {
		return sortCode;
	}

	public void setSortCode(int sortCode) {
		this.sortCode = sortCode;
	}
}
