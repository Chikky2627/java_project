package com.tnsif.intro.practice;

public class ThisKeyword1 {
   
  
public  void setSalary() {
	   
	System.out.println("duration");
   }
   public void getSalary( ) {
	  this.setSalary();
	   
	   System.out.println("this.setsalary");
   }
   public static void main(String [] args) {
	   ThisKeyword1 th=new ThisKeyword1();
	   ThisKeyword1 th1=new ThisKeyword1();
	   
	   th.getSalary();
   }
}
