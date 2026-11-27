package TimeAndSpaceComplexity.Day3;

import java.util.Scanner;

public class innerIncrement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j += 2){
                System.out.println(i + " " + j);
            }
        }

        // Time Complexity --> O(n) * O (n / 2)
        //                 --> O(n^2)
        // Space Complexity --> O(1)

        sc.close();

    }
}
