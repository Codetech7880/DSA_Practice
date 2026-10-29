package String.Level1;

import java.util.Scanner;

public class countVowelInString {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking string from the user.
        System.out.print("Enter a string : ");
        String userInput = sc.nextLine();

        // Initializing a variable.
        int vowelCount = 0;

        for(int i = 0; i < userInput.length(); i++){
            // Checking whether character of a string is vowel or not.
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
                // If character of a string is vowel than --> count + 1.
                vowelCount++;
            }
        }
        // Printing the total number of vowel found in the input string.
        System.out.print("Total number of vowels in a string : " + vowelCount);

        // Close the scanner.
        sc.close();

    }
}
