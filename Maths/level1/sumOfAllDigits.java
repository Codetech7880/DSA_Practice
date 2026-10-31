package Maths.level1;

import java.util.Scanner;

public class sumOfAllDigits {

    // Method to find total sum of ddigits.
    public static void totalSumOfDigits(int userNumber){

        // Initializing a variable and soting all digits one by one.
        int totalSum = 0;
        while(userNumber != 0){
            // Formula for finding the sum of digits.
            int digits = userNumber % 10;
            totalSum += digits;
            userNumber = userNumber / 10;
        }
        // Printing the sum of digits.
        System.out.println("Total sum of digits of the given numbers : " + totalSum);
    }
    public static void main(String[] args) {

        // Scanner helps us to take input from the users.
        Scanner sc = new Scanner(System.in);

        // Taking a number as input by user.
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        
        // Calling the totalSumOfDigits method.
        totalSumOfDigits(number);      

    }
}
