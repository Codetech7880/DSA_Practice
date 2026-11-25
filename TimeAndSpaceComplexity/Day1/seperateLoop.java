package TimeAndSpaceComplexity.Day1;

import java.util.Scanner;

public class seperateLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        // Two seperate loops.

        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }

        for(int j = 0; j <= n; j++){
            System.out.println(j);
        }

        // Time Complexity --> O(n)
        // Space Complexity --> O(1)

    }
}
