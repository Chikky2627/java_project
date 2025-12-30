package com.tnsif.intro;

public class StaticKeyword {
    static String StudentName="AKSHITHA";
    static public void CourseDetails() {
    	String CourseName="JAVA";
    	System.out.println("CourseName:"+CourseName);
    }
    static {
    	String CoursePrice="FREE";
    	System.out.println("CoursePrice:"+CoursePrice);
    }
	public static void main(String[] args) {
		System.out.println("StudentName:"+StaticKeyword.StudentName);
		StaticKeyword.CourseDetails();
		

	}
	

}
