package com.tnsif.intro.Collections.Map;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
            students.put(101, "Ravi");
	        students.put(102, "Anjali");
	        students.put(103, "Kiran");
           System.out.println("Student List:");
	        for (Map.Entry<Integer, String> entry : students.entrySet()) {
	            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
	        }
            int searchId = 102;
	        System.out.println("\nSearching ID " + searchId + ": " + students.get(searchId));
	    }
	}


