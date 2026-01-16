package com.tnsif.intro.Collections.vector;
import java.util.Vector;
import java.util.Scanner;
public class StudentMarks {
	public static void main(String[] args) {
           // Creating Vector to store marks
	        Vector<Integer> marks = new Vector<>();
	        Scanner sc = new Scanner(System.in);

	        // Adding marks
	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            System.out.print("Enter marks for student " + i + ": ");
	            marks.add(sc.nextInt());
	        }

	        // Displaying all marks
	        System.out.println("\nStudent Marks List:");
	        for (int m : marks) {
	            System.out.println(m);
	        }
            // Finding highest marks
	        int highest = marks.get(0);
	        for (int m : marks) {
	            if (m > highest) {
	                highest = m;
	            }
	        }
            System.out.println("\nHighest Marks: " + highest);

	        sc.close();
	    }
	}


