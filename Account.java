package week7;


public class Account {
	
	private int accountNumber;
	private double balance;
	private double minimumBalance;
	private double overdraftFee;

	public Account(int accountNumber, double balance, double minimumBalance, double overdraftFee) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
		this.overdraftFee = overdraftFee;

	}
	
	public int getaccNum() {
		return accountNumber;
	} 
	
	public void setaccNum(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance (int balance) {
		this.balance = balance;
	}
	
	public double getminBalance() {
		return minimumBalance;
	}
	
	public void setminBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public double getodFee() {
		return overdraftFee;
	}
	
	public void setodFee(int overdraftFee) {
		this.overdraftFee = overdraftFee;
	}
	
	
	public void depositFunds(double deposit) {
		balance+=deposit;
	}
	
	public void withdrawFunds(double withdrawal) {
		if(withdrawal > balance) {
			System.out.println("insufficient funds");
		} else {
		balance-=withdrawal;
		}
	}
	
	public void displayAccInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Minimum Balance: " + minimumBalance);
		System.out.println("Overdraft Fee: " + overdraftFee);
	}
	
	
}
