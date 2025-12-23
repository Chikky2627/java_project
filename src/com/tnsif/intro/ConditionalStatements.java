package com.tnsif.intro;

public class ConditionalStatements {
   public static void main(String[] args) {
	   //If,elseif ,else Statements
	   //To check whether student pass or fail in semester
	   String studentName="chikky";
	   int marks=46;
	   if(marks>=21) {
		   System.out.println(studentName +" is passed");
	   }else if(marks<=21) {
		   System.out.println(studentName+" is failed");
	   }else {
		   System.out.println(studentName+" is absent");
	   }

	}

}
