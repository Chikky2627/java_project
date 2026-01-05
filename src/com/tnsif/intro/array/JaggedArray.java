package com.tnsif.intro.array;
import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number of rows:");
	   int rows=sc.nextInt();
	   int[][] arr=new int[rows][];
	   for(int i=0;i<rows;i++) {
	   System.out.println("Enter columns for row"+(i+1)+":");
	   int columns=sc.nextInt();
	   arr[i]=new int[columns];
	   
	   System.out.println("enter elements:");
	   for(int j=0;j<rows;j++) {
		   
		   arr[i][j]=sc.nextInt();
		   System.out.println(arr[i][j]);
	   }
	}
	   }
}
