package Pattern.level_1;

import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Rectangle printing.");
        System.out.print("Enter the value of row : ");
        int row = sc.nextInt();
        System.out.print("Enter the value of column : ");
        int column = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                // print *
                System.out.print("* ");
            }
            // Move to next line.
            System.out.println();
        }

    }
}
