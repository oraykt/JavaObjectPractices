package com.oraykurt.bank;

public class BankAccount implements IInterest {
	private static int ID = 1000;
	private String accountNumber;
	private static final String routingNumber = "05400654";
	private String name;
	private String SSN;
	private double balance;


	public BankAccount(String SSN, double initDeposit){
		this.SSN = SSN;
		this.balance = initDeposit;
		ID++;
		setAccountNumber();
	}

	private void setAccountNumber(){
		int random = (int) (Math.random() * 100);
		this.accountNumber = ID + "" + random + "" + SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber);
		showBalance();
	}

	public void payBill (double amount){
		System.out.println("Paying bill: " + amount);
		this.balance -= amount;
		showBalance();
	}

	public void makeDeposit (double amount){
		System.out.println("Making deposit: " + amount);
		this.balance += amount;
		showBalance();
	}

	public void showBalance(){
		System.out.println("Balance: " + balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void accrue() {
		balance *= (1 + rate/100);
		showBalance();
	}

	@Override
	public String toString() {
		return "BankAccount{" +
				"accountNumber='" + accountNumber + '\'' +
				", name='" + name + '\'' +
				", SSN='" + SSN + '\'' +
				", balance=" + balance +
				'}';
	}
}
