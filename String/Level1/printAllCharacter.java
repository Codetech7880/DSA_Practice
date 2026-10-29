package String.Level1;

import java.util.Scanner;

public class printAllCharacter {
    public static void main(String[] args) {
        
        // Scanner help us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // TAking string from the user.
        System.out.print("Enter a string : ");
        String userInput = sc.nextLine();

        for(int i = 0; i < userInput.length(); i++){
            // Print all character.
            System.out.println("Character at index " + i + " : " + userInput.charAt(i));
        }

        // Close the scanner.
        sc.close();

    }
}
