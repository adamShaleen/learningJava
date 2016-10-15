package account;

public class BankAccount {
	private String accountNumber;
	private int accountBalance;
	private String customerName;
	
	public BankAccount(String acctNum, int startingBalance, String custName) {
		this.setAccountNumber(acctNum);
		this.accountBalance = startingBalance;
		this.customerName = custName;
		System.out.println("Thank you for opening an account with Fake Bank of America.");
		System.out.println("Your opening balance is " + this.accountBalance);
	}
	
	
	public String getAccountNumber(String enteredAccountNumber) {
		if (this.accountNumber == enteredAccountNumber) {
			return this.accountNumber;
		}
		return "Incorrect account number";
	}
	
	public String setAccountNumber(String enteredAccountNumber) {
		if (enteredAccountNumber.length() == 6) {
			this.accountNumber = enteredAccountNumber;
		}
		return "Incorrect account criteria.";
	}
	
	public int getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String name) {
		this.customerName = name;
	}
	
	public int deposit(int depositAmount) {
		accountBalance = accountBalance + depositAmount;
		System.out.println(this.customerName + " has just deposited $" + depositAmount + " New Balance: " + this.getAccountBalance());
		return accountBalance;
	}
	
	public int withdraw(int withdrawAmount) {
		accountBalance = accountBalance - withdrawAmount;
		System.out.println(this.customerName + " has just withdrawn $" + withdrawAmount + " New Balance: " + this.getAccountBalance());
		return accountBalance;
	}
	
}
