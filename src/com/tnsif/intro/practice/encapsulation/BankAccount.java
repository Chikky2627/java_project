package com.tnsif.intro.practice.encapsulation;

public class BankAccount {
    private double balance;
   public void deposit(double amount) {
	   if(amount>0) {
		   balance+=amount;
		   System.out.println("amount you have deposited"+amount);
	   }else System.out.println("please enter valid amount");
	   
   }
   public void withdraw(double amount) {
	   if(amount>0&&amount<=balance) {
		   balance-=amount;
		   System.out.println("enter your password to proceed");
	   }else System.out.println("invalid amount balance");
   }
   public double getBalance() {
	   return balance;
   }
   public static void main(String [] args) {
	   BankAccount ba=new BankAccount();
	   ba.deposit(900);
	   ba.withdraw(90.0);
	   System.out.println(ba.getBalance());
	   
	   
   }
}
