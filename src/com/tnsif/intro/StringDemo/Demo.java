package com.tnsif.intro.StringDemo;

public class Demo {
    public static void main(String[] args) {
    	String name="chikky";
    	System.out.println("name:"+name);
    	System.out.println("Length:"+name.length());
    	String name1 =" chintu ";
    	System.out.println("Length with trim:"+name1.length());
    	System.out.println("Uppercase of chikky:"+name.toUpperCase());
    	System.out.println("Constant change will not happen:"+name);
    	System.out.println("Lowercase of chikky:"+name.toLowerCase());
    	//using different address
    	String country= new String("chikky");
    	
    	System.out.println("assignment operator comparison:"+(name==country));//whenever we will not use ()for=== opertor it will not print string
    	System.out.println("equals():"+name.equals(country));
    	//using same address
    	String country1="chikky";
    	System.out.println("assignment operator comparison with same address:"+name==country1);
    	System.out.println("equals():"+name.equals(country1));
    	
    	
    }
}
