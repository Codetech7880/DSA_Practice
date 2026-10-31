package Maths.level1;

import java.util.Scanner;

public class pallindromNumber {

    // Method for finding the reverse of the number.
    static int reverseNumber(int number){
        int reverseNum = 0;
        while(number != 0){
            // Applying the fromula to find the reverse.
            int digit = number % 10;
            reverseNum = (reverseNum * 10) + digit;
            number = number / 10;
        }
        // Return the reverse number.
        return reverseNum;
    }
    
    public static void main(String[] args) {

        // Scanner helps us to take input from the users.
        Scanner sc = new Scanner(System.in);

        // Taking a number by the user.
        System.out.print("Enter the number : ");
        int number = sc.nextInt();


        int reverseNumb = reverseNumber(number);

        // Comparing the input and reverse number.
        if(number == reverseNumb){
            // if condition is true --> the number is pallindrom
            System.out.println("Given number is Pallindrom");
        }else{
            // if condition is false --> the number is not pallindrom
            System.out.println("Given number is not Pallindrom");

        }

        // Close the scanner.
        sc.close();

    }
}
