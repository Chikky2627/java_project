package com.tnsif.intro;

public class LogicalOperator {

	public static void main(String args[]) {
		int age=12;
		int marks=33;
		
		System.out.println("AND:"+ (age<=16&&marks>40));
		System.out.println("OR:"+(age<=16||marks>40));
		System.out.println("NOT"+!(marks>50));
		
	}

}
