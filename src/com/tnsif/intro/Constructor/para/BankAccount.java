package com.tnsif.intro.Constructor.para;

public class BankAccount {
  int accountNumber;
  int balance;
  BankAccount(int a,int b){
	  accountNumber=a;
	  balance=b;
  }
	public static void main(String[] args) {
		BankAccount bb=new BankAccount(900000,67000);
		System.out.print(bb.accountNumber+" "+bb.balance);

	}

}
