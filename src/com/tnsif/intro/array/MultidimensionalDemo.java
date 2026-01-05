package com.tnsif.intro.array;
import java.util.Scanner;

public class MultidimensionalDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] arr = new int[students][subjects];

        // Input
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            for (int j = 0; j < subjects; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("\nAll Students Marks:");
        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < subjects; j++) {
                System.out.print(arr[i][j] + " ");
            }
            //2
            System.out.println();
        }

        sc.close();
    }
}

