// package String.Level2;

import java.util.Scanner;

public class findTotalConstructor {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking string from the user.
        System.out.print("Enter a string : ");
        String userInput = sc.nextLine();

        // Initializing a variable.
        int consonentCount = 0;

        for(int i = 0; i < userInput.length(); i++){
            // Checking whether character of a string is consonent or not.
            if(
                userInput.charAt(i) == 'A' ||
                userInput.charAt(i) == 'a' ||
                userInput.charAt(i) == 'E' ||
                userInput.charAt(i) == 'e' ||
                userInput.charAt(i) == 'I' ||
                userInput.charAt(i) == 'i' ||
                userInput.charAt(i) == 'O' ||
                userInput.charAt(i) == 'o' ||
                userInput.charAt(i) == 'U' ||
                userInput.charAt(i) == 'u'
            ){
                continue;
            }else{
                // If character of a string is consonent than --> count + 1.
                consonentCount++;
            }
        }
        // Printing the total number of consonent found in the input string.
        System.out.print("Total number of consonent in a string : " + consonentCount);

        // Close the scanner.
        sc.close();

    }
}
