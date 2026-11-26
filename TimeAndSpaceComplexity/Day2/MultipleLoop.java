package TimeAndSpaceComplexity.Day2;

import java.util.Scanner;

public class MultipleLoop{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                for(int k = 0; k<= n; k++){
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

        // Time complexity --> O(n) * O(n) * O(n)
        //                 --> O(n^3)
        // Space complexity --> O(1)
    }
}