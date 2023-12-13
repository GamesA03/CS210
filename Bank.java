package week7;
import week7.Customer;
public class Bank {
	private int routingNumber;
	private Customer customer;
	
	public Customer createCustomer(String firstName, String lastName, Account acc) {
		Customer nuCustomer = new Customer(firstName, lastName, acc);
		return nuCustomer;
	}
	public Bank (int routingNumber) {
		this.routingNumber = routingNumber;
	}
	
	public int getRN() {
		return routingNumber;
	}
	
	public void setRN(int routingNumber) {
		this.routingNumber = routingNumber;
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank(123456);
		
		Account one = new Account(12345, 0.20, 0.50, 0.30);
		Customer A = bank.createCustomer("Arturo", "Games", one);
		System.out.println(A.getFN());
		System.out.println(A.getLN());
		
		one.displayAccInfo();
		
	}
}
