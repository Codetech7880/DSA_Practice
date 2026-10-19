package Pattern.level_1;

import java.util.Scanner;

public class solidSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            // for each row --> n column
            for(int j = 1; j <= n; j++){
                // print *
                System.out.print("* ");
            }
            // Move to next line.
            System.out.println();
        }

    }
}
