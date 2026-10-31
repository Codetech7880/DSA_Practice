package Maths.level1;

import java.util.Scanner;

public class countAllDigit {

    // Method for counting the digit of a number.
    public static void countDigit(int userNumber){
        int count = 0;
        while(userNumber != 0){
            // Formula for counting the given digit.
            int digits = userNumber % 10;
            count++;
            userNumber = userNumber / 10;
        }
        // Printing total number of digits.
        System.out.println("Total number of digits : " + count);
    }
    public static void main(String[] args) {

        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking the number from the user.
        System.out.print("Enter the number : ");
        int userNum = sc.nextInt();
        
        // Calling the digitcount method.
        countDigit(userNum);  
        
        sc.close();

    }
}
