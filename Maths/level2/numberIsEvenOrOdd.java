package Maths.level2;

import java.util.Scanner;

public class numberIsEvenOrOdd {

    // Method to check whther the given number is even or odd.
    public static void isEvenOrOdd(int number){
        // number is divisible by 2 than it is even othervise odd,
        if(number % 2 == 0){
            // Print if number is even.
            System.out.println("Given number is even");
        }else{
            // Print if number is odd.
            System.out.println("Given number is odd");
        }
    }
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the users.
        Scanner sc = new Scanner(System.in);

        // TAking number as input by the user.
        System.out.print("Enter a number to check whether the number is even or odd : ");
        int userInput = sc.nextInt();

        // Calling isEvenOrOdd method.
        isEvenOrOdd(userInput);

        sc.close();

    }
}
