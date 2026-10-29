package String.Level1;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking a string form the user.
        System.out.print("Enter the string : ");
        String userInput = sc.nextLine();

        // Initializing a reverse string.
        String reverseStr = "";

        for(int i = 0; i < userInput.length(); i++){
            // Assigning all characters into the reverse string.
            reverseStr += userInput.charAt((userInput.length() - 1) - i);
        }
        // Printing the reverse string.
        System.out.print("The reverse string is : " + reverseStr);
        
        // Close the scanner.
        sc.close();

    }
}
