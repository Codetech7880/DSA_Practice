package Maths.level4;

import java.util.Scanner;

public class checkNumberIsStrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking a number as input by user.
        System.out.print("Enter the number : ");
        int userInput = sc.nextInt();

        // Initializing a variable and storing the value of user input for further comparision.
        int originalNumber = userInput;

        int sum = 0;

        while(userInput > 0){
            // Extract the digits.
            int digits = userInput % 10;

            // calculate factorial.
            int factorial = 1;
            for(int i = 1; i <= digits; i++){
                factorial = factorial * i;
            }
            sum = sum + factorial;

            // Removing last digit.
            userInput = userInput / 10;
        }

        // Comparing original and computed value.
        if(originalNumber == sum){
            System.out.println("Given number is strong.");
        }else{
            System.out.println("Not a Strong number.");
        }

        sc.close();

    }
}
