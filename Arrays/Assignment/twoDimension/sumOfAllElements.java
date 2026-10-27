package Arrays.Assignment.twoDimension;

import java.util.Scanner;

public class sumOfAllElements {
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

        int allElementSum = 0;
        
        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                // Finding the sum of all elements.
                allElementSum += arr[row][col];
            }
        }

        // Printing the sum of all elements.
        System.out.println("Sum of all elements : " + allElementSum);


    }
}
