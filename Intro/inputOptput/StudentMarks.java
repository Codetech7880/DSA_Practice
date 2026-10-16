package Intro.inputOptput;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st subject mark out of 100 : ");
        int sub1 = sc.nextInt();

        System.out.print("Enter 2nd subject mark out of 100 : ");
        int sub2 = sc.nextInt();

        System.out.print("Enter 3rd subject mark out of 100 : ");
        int sub3 = sc.nextInt();

        System.out.print("Enter 4th subject mark out of 100 : ");
        int sub4 = sc.nextInt();

        System.out.print("Enter 5th subject mark out of 100 : ");
        int sub5 = sc.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total marks in all subjects : " + total);

        float percentage = (total * 100) / 500;
        System.out.println("Total percentage of student : " + percentage + " %");

    }
}
