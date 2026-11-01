package Maths.level2;

import java.util.Scanner;

public class HCFofNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // TAking first number from the user.
        System.out.print("Enter first number : ");
        int userFirstInput = sc.nextInt();

        // Taking second number from the user.
        System.out.print("Enter second number : ");
        int userSecondInput = sc.nextInt();

        // Initialize a variable that denotes the larget factor.
        int largestFactor = 0;

        for(int i = 1; i < userFirstInput && i < userSecondInput; i++){
            // Finding the largest factor.
            if(userFirstInput % i == 0 && userSecondInput % i == 0){
                if(i > largestFactor){
                    largestFactor = i;
                }
            }
        }
        // Printing the largest factor.
        System.out.println(largestFactor);

        sc.close();

    }
}
