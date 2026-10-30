// package String.Level2;

import java.util.Scanner;

public class lowerToUpperConversion {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking string from the user that later on convert in itno upper case.
        System.out.print("Enter the string only in lower case : ");
        String userInput = sc.nextLine();

        // Initializing a new string that hepls us to store the character of olderString.
        String outString = "";

        for(int i = 0; i < userInput.length(); i++){
            // Taking each character and converting it into upper case.
            char newString = userInput.charAt(i);
            outString += (char)(newString - 32);
        }
        // Printing user input string into upper case formate.
        System.out.println("Given input in upper case : " + outString);

        // Close the scanner
        sc.close();
    }
}
