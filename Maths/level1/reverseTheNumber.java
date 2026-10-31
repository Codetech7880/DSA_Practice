package Maths.level1;

import java.util.Scanner;

public class reverseTheNumber{

    // Method for finding reverse of the given number.
    public static void reverseNum(int num){
        // Initializing a variable and storing all digit one by one.
        int revNumber = 0;

        while(num != 0){
            // Condition for finding the reverse of a number.
            int digits = num % 10;
            revNumber = (revNumber * 10) + digits;
            num = num / 10;
        }
        // Printing the reverse number.
        System.out.println("the reverse number is : " + revNumber);
    }
    public static void main(String[] args) {

        // Scanner helps us to  take input from the users.
        Scanner sc = new Scanner(System.in);

        // Takin a number as input by user.
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        
        // Calling the reverse method.
        reverseNum(number);      

        sc.close();

    }
}