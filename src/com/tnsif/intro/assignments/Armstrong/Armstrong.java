package com.tnsif.intro.assignments.Armstrong;
import java.util.Scanner;
public class Armstrong {
	static boolean validatesItself(int number) {
	        int original = number;
	        int digits = String.valueOf(number).length(); 
	        int checksum = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            checksum += Math.pow(digit, digits);
	            number /= 10;
	        }
           return checksum == original;
	    }
         public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
            if (validatesItself(num)) {
	            System.out.println(num + " passes the Armstrong ");
	        } else {
	            System.out.println(num + " fails the Armstrong ");
	        }
	    }
	}


