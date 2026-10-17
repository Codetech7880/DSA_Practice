package Intro.Conditional;

import java.util.Scanner;

public class eligiblityCheck{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the persion : ");
        int userAge = sc.nextInt();

        if(userAge > 18)
            System.out.println("Person is elligible for vote.");
        else
            System.out.println("Person is not elligible for vote.");

    }    
}
