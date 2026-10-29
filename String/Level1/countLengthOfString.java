package String.Level1;

import java.util.Scanner;

public class countLengthOfString {
    public static void main(String[] args) {

        // Finding the length of a string without using the length() property.
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Take string as input by user.
        System.out.print("Enter a string : ");
        String userInput = sc.nextLine();

        // Initializing a count variable to to count the number of character.
        int count = 0;

        // Using for each loop
        for(char countChar : userInput.toCharArray()){
            // Count the characters.
            count++;
        }
        // Printing the lenth of a string without using length() property.
        System.out.println(count + 1);

        
        // Close the scanner.
        sc.close();

    }
}
