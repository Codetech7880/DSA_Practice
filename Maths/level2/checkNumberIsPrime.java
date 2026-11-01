package Maths.level2;

import java.util.Scanner;

public class checkNumberIsPrime {

    // Methof to find the number is prime or not.
    public static void isPrime(int number){
        // Checking the number is greater than zero or not.
        if(number > 0){
            // Finding the number is prime or not.
            for(int i = 2; i < (number - 1); i++){
                if(number % i == 0){
                   // Printing the number is not prime. 
                    System.out.println("Number is not prime");
                    break;
                }
                // Printing the number is prime.
                System.out.println("Number is Prime");
                break;
            }
        }else{
            System.out.println("Invalid Cridentials !!!");
        }
    }
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the users.
        Scanner sc = new Scanner(System.in);

        // Taking the number as input by user.
        System.out.print("Enter the number : ");
        int userInput = sc.nextInt();

        // Calling isPrime method.
        isPrime(userInput);

        sc.close();

    }
}
