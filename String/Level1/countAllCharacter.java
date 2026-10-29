package String.Level1;

import java.util.Scanner;

public class countAllCharacter {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking input as string from the user.
        System.out.print("Enter a string : " );
        String userString = sc.nextLine();

        // Initializing a character.
        int countChar = 0;

        for(int i = 0; i < userString.length(); i++){
            // Count the characters.
            countChar++;
        }
        // Print the sum of characters.
        System.out.println("Total characters in the given string is : " + countChar);

        // Close the scanner.
        sc.close();

    }
}
