package com.tnsif.intro.assignments;

public class NestedTry {
	

	    public static void main(String[] args) {

	        try {
	            System.out.println("Outer try block");

	            int[] arr = {10, 20, 30};

	            try {
	                System.out.println("Inner try block");
	                // This will cause ArrayIndexOutOfBoundsException
	                System.out.println(arr[5]);
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Inner catch: Array index out of range");
	            }

	            // This will cause ArithmeticException
	            int result = 10 / 0;

	        } catch (ArithmeticException e) {
	            System.out.println("Outer catch: Cannot divide by zero");
	        }

	        System.out.println("Program continues normally");
	    }
	}


