package Intro.Conditional;

import java.util.Scanner;

public class SpecialTypeMarks {
    public static void main(String[] args) {
        
        // Take input 5 students marks, drop the least one and calculate the overall percentage considering only the top four marks, print it.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st subject marks : ");
        int sub1 = sc.nextInt();

        System.out.print("Enter 2nd subject marks : ");
        int sub2 = sc.nextInt();

        System.out.print("Enter 3rd subject marks : ");
        int sub3 = sc.nextInt();

        System.out.print("Enter 4th subject marks : ");
        int sub4 = sc.nextInt();

        System.out.print("Enter 5th subject marks : ");
        int sub5 = sc.nextInt();

        int smallest = sub1;

        if(sub2 < smallest)
            smallest = sub2;

        if(sub3 < smallest)
            smallest = sub3;

        if(sub4 < smallest)
            smallest = sub4;

        if(sub5 < smallest)
            smallest = sub5;

        int total = sub1 + sub2 + sub3 + sub4 + sub5 - smallest;
        float percentage = (total * 100) / 400;
        System.out.println("Total percentage of student : " + percentage + " %");

    }
}
