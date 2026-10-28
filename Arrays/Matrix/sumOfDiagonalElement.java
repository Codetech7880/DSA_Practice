package Arrays.Matrix;

import java.util.Scanner;

public class sumOfDiagonalElement {
    public static void main(String[] args) {
        
        // Scanner helps to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking the size of row from users.
        System.out.print("Enter the size of row : ");
        int rowSize = sc.nextInt();

        // Taking the size of column from users.
        System.out.print("Enter the size of column : ");
        int colSize = sc.nextInt();

        // Initailaizing an array of the given size of row and column.
        int arr[][] = new int[rowSize][colSize];

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                // Taking each element from the user at each index.
                System.out.print("Enter element of index ("+row+", "+col+") : ");
                arr[row][col] = sc.nextInt();
            }
        }

        int sumOfDiagonalElement = 0;

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < colSize; col++){
                if(row == col){
                    // Sum of all diagonal elements.
                   sumOfDiagonalElement += arr[row][col];
                }
            }
        }
        // Printing the sum of diagonal element.
        System.out.println(sumOfDiagonalElement);

    }
}
