package com.tnsif.intro.accessmodifier.scanner;
import java.util.Scanner;
public class CourseDetails{
	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Integer
	        System.out.print("Enter Student Roll Number: ");
	        int rollNo = sc.nextInt();

	        // String 
	        System.out.print("Enter Course Code: ");
	        String courseCode = sc.next();

	        // String 
	        sc.nextLine(); 
	        System.out.print("Enter Student Name: ");
	        String name = sc.nextLine();

	        // Long
	        System.out.print("Enter Mobile Number: ");
	        long mobile = sc.nextLong();

	        // Float
	        System.out.print("Enter Course Duration (in months): ");
	        float duration = sc.nextFloat();

	        // Double
	        System.out.print("Enter Course Fee: ");
	        double fee = sc.nextDouble();

	        // Boolean
	        System.out.print("Is Course Completed (true/false): ");
	        boolean isCompleted = sc.nextBoolean();

	        // Char
	        System.out.print("Enter Grade (A/B/C): ");
	        char grade = sc.next().charAt(0);

	        // Output
	        System.out.println("\n--- Student & Course Details ---");
	        System.out.println("Roll No      : " + rollNo);
	        System.out.println("Name         : " + name);
	        System.out.println("Course Code  : " + courseCode);
	        System.out.println("Mobile No    : " + mobile);
	        System.out.println("Duration     : " + duration + " months");
	        System.out.println("Course Fee   : " + fee);
	        System.out.println("Completed    : " + isCompleted);
	        System.out.println("Grade        : " + grade);

	        sc.close();
	    }
	}

