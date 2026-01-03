package com.tnsif.intro.StringDemo;
import java.util.Scanner;
public class Task1 {
      public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter Training name:");
    	 String n=sc.nextLine();
    	 String reverse="";
    	 for(int i=n.length()-1;i>=0;i--) {
    		 reverse+=n.charAt(i);
    	 }
    		 System.out.println(reverse);
    		 System.out.println(n.replace("tns india foundation","_"));
      }
}
