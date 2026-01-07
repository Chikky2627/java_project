package com.tnsif.intro.practice;

public class AcessModifiers {
	  
	public static void practice() {
	  System.out.println("age");
  }
    private  void practice1() {
	// practice(); 
    	System.out.println("agee");
  }
 
 public static void main(String [] args) {
	 AcessModifiers acc=new AcessModifiers();
	 acc.practice1();
	 


}
}