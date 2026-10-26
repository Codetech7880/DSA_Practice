package Arrays.jaggedArray;

import java.util.Scanner;

public class findMinElement {
    public static void main(String[] args) {
        
        // Scanner is used to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking the size of row form the user.
        System.out.print("Enter the size of the row : ");
        int rowSize = sc.nextInt();

        // Initializing a jagged array.
        int arr[][] = new int[rowSize][];
        
        for(int row = 0; row < arr.length; row++){

            // Taking the size of column from the user.
            System.out.print("Enter the size of column : ");
            int colSize = sc.nextInt();

            arr[row] = new int[colSize];

            for(int col = 0; col < colSize; col++){

                // Taking the element for each index.
                System.out.print("Enter the element at row " + row + " and column " + col + " : ");
                arr[row][col] = sc.nextInt();

            }

        }

        // Assumung a minimum value.
        int minElement = arr[0][0];

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){

                // Finding the minimum element in this array.
                if(minElement > arr[row][col]){
                    minElement = arr[row][col];
                }

            }
        }
        // Printing minimum array.
        System.out.println(minElement);

    }
}
