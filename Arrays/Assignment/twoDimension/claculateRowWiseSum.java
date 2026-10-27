package Arrays.Assignment.twoDimension;

import java.util.Scanner;

public class claculateRowWiseSum {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking the size of row by user.
        System.out.print("Enter the number of rows : ");
        int rowSize = sc.nextInt();

        // Taking the size of column by user.
        System.out.print("Enter the number of columns : ");
        int colSize = sc.nextInt();

        // Initializing the array by the given row and column.
        int arr[][] = new int[rowSize][colSize];

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                // Taking elements by user at each indexes.
                System.out.print("Enter element at row = " + row + " column = " + col + " : ");
                arr[row][col] = sc.nextInt();
            }
        }

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                // Printing the whole array.
                System.out.print(arr[row][col] + " ");
            }
            // Move to the next row.
            System.out.println();
        }

        for(int row = 0; row < rowSize; row++){
            int rowWiseSum = 0;
            for(int col = 0; col < colSize; col++){

                // Calculayte the sum of all elements.
                rowWiseSum += arr[row][col];

            }
            // Printing the sum of all elements in each row.
            System.out.println("Sum of all elements of row " + row + " : " + rowWiseSum);
        }



    }
}
