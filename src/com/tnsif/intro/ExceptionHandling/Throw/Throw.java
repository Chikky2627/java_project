
package com.tnsif.intro.ExceptionHandling.Throw;

public class Throw {
	public static void main(String []args) {
   int age=12;
   try{
	   if(age>18) {
       System.out.println("eligible");
	   }else {
	   throw new ArithmeticException("age must be above 18");
	   }
   }catch(ArithmeticException e) {
	   System.out.println("ghhj");
	  e.printStackTrace();
   }
   
}
}

