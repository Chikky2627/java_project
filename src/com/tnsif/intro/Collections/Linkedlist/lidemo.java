package com.tnsif.intro.Collections.Linkedlist;
import java.util.LinkedList;
public class lidemo {
   public static void main(String[] args) {
		LinkedList<Integer> lis=new LinkedList<>();
		 lis.add(90);
		 lis.add(80);
		 lis.add(70);
		 System.out.println(lis);
		 lis.addFirst(100);
		 lis.addLast(60);
		 lis.add(2,25);//to add at any index
		 System.out.println(lis);
		 lis.remove(0);
		 System.out.println(lis);
		 lis.get(0);
		 System.out.println(lis);
   }

}
