package com.tnsif.intro.assignments.Banking;

public class BankImpDemo {
	public static void main(String[] args) {
		Bank bank=new BankImp();
		Account account=new Account(5055,"chikky",10001,bank);
		account.deposit(40001);
		account.withdraw(20001);
		System.out.println(account);
	}

}
