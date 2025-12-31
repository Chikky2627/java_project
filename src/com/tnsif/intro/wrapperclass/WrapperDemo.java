package com.tnsif.intro.wrapperclass;

public class WrapperDemo {
     int x=5;//auto boxing
    Integer i=x;
    Double d=5.77;
    double dd=d;//auto unboxing
     public static void main (String [] args) {
    	 WrapperDemo ww=new WrapperDemo();
    	 System.out.println(ww.i);//primitive data type
    	 System.out.println(ww.x);//wrapper class
    	 System.out.println(ww.d);
    	 
     }
    
}
