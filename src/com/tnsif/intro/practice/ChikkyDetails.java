package com.tnsif.intro.practice;
import java.util.Scanner;

public class ChikkyDetails {
    public static void main(String []args) {
//    	ChikkyDetails ch =new ChikkyDetails();
//    	Scanner sc=new Scanner(System.in);
//    	System.out.println("Enter favourite dish:");
//    	String chname=sc.nextLine();
//    	System.out.println("Enter memorable date:");
//    	Integer ch1=sc.nextInt();
//    	System.out.println("Enter place:");
//    	String chname1=sc.next();
//    	System.out.println("Enter id:");
//    	Float chname2=sc.nextFloat();
//    	System.out.println("Enter favourite dish:");
//    	Double chname3=sc.nextDouble();
//    	System.out.println("Enter place:");
//    	String chname7=sc.nextLine();
    	Scanner sc=new Scanner(System.in);

    	        System.out.print("Enter number: ");
    	        int n = sc.nextInt();   // reads number, leaves \n

    	        System.out.print("Enter name: ");
    	        String name = sc.nextLine(); // ❌ gets skipped

    	        System.out.println("Name: " + name);
    	        

    	               
    	                System.out.print("Enter number: ");
    	                int n1 = sc.nextInt();

    	                sc.nextLine(); // ✅ clears newline

    	                System.out.print("Enter name: ");
    	                String name1 = sc.nextLine(); // works

    	                System.out.println("Name: " + name);
    	            }
    	        

    	    }
    	

    	
    

