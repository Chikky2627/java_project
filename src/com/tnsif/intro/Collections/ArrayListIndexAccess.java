package com.tnsif.intro.Collections;
import java.util.ArrayList;
public class ArrayListIndexAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> arr=new ArrayList<>();
	   arr.add(10);
	   arr.add(20);
	   arr.add(30);
	   arr.add(40);
	   
	   System.out.println(arr.get(0));
	   System.out.println(arr.remove(3));
	   System.out.println(arr);
}

}
