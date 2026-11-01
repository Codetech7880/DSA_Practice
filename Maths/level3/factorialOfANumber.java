package Maths.level3;

import java.util.Scanner;

public class factorialOfANumber {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // TAking number as input by the user.
        System.out.print("Enter the number : ");
        int userInput = sc.nextInt();

        // Initializing a variable.
        int factorial = 1;

        // Applying loop for finding factorial of the given number.
        for(int i = 1; i <= userInput; i++){
            factorial *= i;
        }
        // Printing the factorial of the given number.
        System.out.println(factorial);

    }
}
