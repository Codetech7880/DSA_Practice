package Arrays.twoDimensionArray;

import java.util.Scanner;

public class takeInputArray {
    public static void main(String[] args) {
        
        // Initializing an 2D array.
        int arr[][] = new int[4][5];

        // Scanner is used for taking input from the user.
        Scanner sc = new Scanner(System.in);
        
        for(int row = 0; row <= arr.length - 1; row++){
            for(int col = 0; col <= arr[row].length - 1; col++){

                // Enter the value of each index.
                System.out.print("Enter the value of row =" + row + "and column = " + col);
                arr[row][col] = sc.nextInt();

            }
        }

        for(int row = 0; row <= arr.length - 1; row++){
            for(int col = 0; col <= arr[row].length - 1; col++){

                // Print all elements of 2D array.
                System.out.print(arr[row][col] + " ");
            }
            // Move to the next row.
            System.out.println();
        }

        sc.close();

    }
}
