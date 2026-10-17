package Intro.Conditional;

import java.util.Scanner;

public class lowerToUpper {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String userInput = sc.nextLine();

        System.out.println(userInput.toUpperCase());

    }
}
