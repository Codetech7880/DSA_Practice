package Maths.level3;

import java.util.Scanner;

public class checkNumberIsArmstrong {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the users.
        Scanner sc = new Scanner(System.in);

        // Taking number from the user.
        System.out.print("Enter the number : ");
        int userInput = sc.nextInt();

        // Storing in a new variable for further use.
        int initialValue = userInput;
        int updatedUserNumber = userInput;

        int countDigit = 0;

        // Finding the digit of a number.
        while ((userInput > 0)) {
            int digits = userInput % 10;
            countDigit++;
            userInput = userInput / 10;
        }
        
        int digitPower = countDigit; 
        int updatedNumber = 0;

        // Applying formula to check whether the number is armstrong or not.
        while (updatedUserNumber > 0) {
            double digits = updatedUserNumber % 10;
            updatedNumber += Math.pow(digits,digitPower);
            updatedUserNumber = updatedUserNumber / 10;
        }

        if(updatedNumber == initialValue){
            // Printing if number is Armstrong.
            System.out.println("Given number is Armstrong.");
        }else{
            // Printing if number is not Armstrong.
            System.out.println("Given number is not Armstrong.");
        }

    }
}
