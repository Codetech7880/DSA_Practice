package String.Level1;

import java.util.Scanner;

public class checkPallindrom {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // TAking input as string by the user.
        System.out.print("Enter the string : ");
        String userString = sc.nextLine();

        // Initializing a variable as a reverseString that hold the reverse string of the given userString.
        String reverseString = "";

        for(int i = 0; i < userString.length(); i++){
            // Initailizing all characters of userString in reverseString 
            reverseString += userString.charAt((userString.length() - 1) - i);
        }

        // Comparing userString and reverseString is it same or different.
        if(reverseString.equals(userString)){
            // Printing if string is pallindrom.
            System.out.println("Given string is Pallindrom");
        }else{
            // Printing if string is not pallindrom.
            System.out.println("Given string is not Pallindrom");
        }

        // Close the scanner.
        sc.close();

    }
}
