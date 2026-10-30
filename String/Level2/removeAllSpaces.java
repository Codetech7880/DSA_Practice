// package String.Level2;

import java.util.Scanner;

public class removeAllSpaces {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking string from the user.
        System.out.print("Enter a string : ");
        String userInput = sc.nextLine();

        // Remove the beginning and ending spaces from the string.
        String trimedString = userInput.trim();

        // Remove the spaces between the word in a string.
        String updateString = trimedString.replace(" ", "");

        // Printing the string.
        System.out.println(updateString);

        // Close the scanner
        sc.close();

    }
}
