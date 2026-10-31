package Maths.level1;

import java.util.Scanner;

public class printEachDigit {

    // Method for printing the digit.
    public static void printNum(int userNumber){
        // Checking if the number is zero or not.
        while(userNumber != 0){
            // Apply condition for finding the digits of a number.
            int digits = userNumber % 10;
            System.out.println(digits);
            userNumber = userNumber / 10;
        }
    }
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the users.
        Scanner sc = new Scanner(System.in);

        // Taking number by the user.
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // Calling method.
        printNum(number);
        
        sc.close();

    }
}
