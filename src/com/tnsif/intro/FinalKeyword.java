package com.tnsif.intro;

public class FinalKeyword {
       final int marks=80;
       final public void Markstest() {
    	   //marks=60; can't ressign
    	   if(marks>21) {
    		   System.out.println("pass") ; 
    	   }else {
    		   System.out.println("Fail"); 
    	   }
    	   
       }
//       class FinalKeywordtest  extends FinalKeyword{
//    	   public void Markstest() {
//    		   
//    	   }
//       }
	public static void main(String[] args) {
		FinalKeyword fk=new FinalKeyword();
		fk.Markstest();
	}

}
