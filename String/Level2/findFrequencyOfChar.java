// package String.Level2;

import java.util.Scanner;

public class findFrequencyOfChar {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // TAkin string as input by the user.
        System.out.print("Enter a string : ");
        String userInput = sc.nextLine();

        // Initializing the new string that helps to comapre with previous one.
        String newString = "";

        for(int i = 0; i < userInput.length(); i++){
            // Storing all characters with the help of temp variable.
            char temp = userInput.charAt(i);
            newString += temp;
        }

        
        for(int olderInput = 0; olderInput < userInput.length(); olderInput++){
            // Initializing count variable as 0. 
            int count = 0;
            for(int newInput = 0; newInput < newString.length(); newInput++){
                // Checking the frequency of the character.
                if(userInput.charAt(olderInput) == newString.charAt(newInput)){
                    count++;
                }
            }
            // Printing the frequency of the character.
            System.out.println(userInput.charAt(olderInput) + " --> " + count);
        }
        System.out.println("Execution Completed Sucessfully!");

        sc.close();

    }
}
