package Arrays.Matrix;

import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking the size of row by user.
        System.out.print("Enter the size of the row : ");
        int rowSize = sc.nextInt();
        
        // TAking the size of column by user.
        System.out.print("Enter the size of the column : ");
        int colSize = sc.nextInt();

        int arr[][] = new int[rowSize][colSize];
        int transpose[][] = new int[colSize][rowSize];

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                // Taking each element by user.
                System.out.print("Enter the element at index (" + row+", "+col + ") : ");
                arr[row][col] = sc.nextInt();
            }
        }

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                // Assigning each element into the transpose array. 
                transpose[col][row] = arr[row][col];
            }
        }
        for(int row = 0; row < colSize; row++){
            for(int col = 0; col < rowSize; col++){
                // Printing all element of transpose array. 
                System.out.print(transpose[row][col] + " ");
            }
            // Move to next row.
            System.out.println();
        }
    }
}
