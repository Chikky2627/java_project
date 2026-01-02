package com.tnsif.intro.assignments;

public class StringReverse {
   public static void main(String[] args) {
	   String s="TEAM WORK";
	   System.out.println("original String is:"+s);
	   System.out.print("reversed string:");
	   for(int i=s.length()-1;i>=0;i--) {
		  System.out.print(s.charAt(i));
	   }
   }
}