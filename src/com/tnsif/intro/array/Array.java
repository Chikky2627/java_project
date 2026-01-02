package com.tnsif.intro.array;

public class Array {
	public static void main(String [] args) {
      int[] arr= {5,10,15,20};
      for(int i=0;i<arr.length;i++) {
    	  System.out.println(arr[i]);
      }
      System.out.println("array length is:"+arr.length);
      System.out.println(arr[arr.length-1]);
      System.out.println(arr[0]);
	}
}