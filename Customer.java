package week7;
import week7.Account;

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String firstName, String lastName, Account account) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
	}
	
	public String getFN() {
		return firstName;
	}
	
	public void setFN(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLN() {
		return lastName;
	}
	
	public void setLN(String lastName) {
		this.lastName = lastName;
	}
	
	public Account getAcc() {
		return account;
	}
	
	public void setAcc(Account account) {
		this.account = account;
	}
}
