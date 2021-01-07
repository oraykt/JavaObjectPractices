package com.oraykurt.Bank;

public class BankApp {

	public static void main (String args[]){

		BankAccount acc1 = new BankAccount("55442211", 1500);

		acc1.makeDeposit(100);
		acc1.payBill(1500);
		acc1.makeDeposit(900);

		acc1.accrue();
		System.out.println(acc1.toString());

	}
}
