package Arrays.jaggedArray;

import java.util.Scanner;

public class takeInputArray {
    public static void main(String[] args) {

        // Scanner is used for taking input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking row lwngth from user.
        System.out.print("Enter the number of rows : ");
        int rowLength = sc.nextInt();
        
        // Initializing an 2D array.
        int arr[][] = new int[rowLength][];

        
        for(int row = 0; row <= arr.length - 1; row++){

            // Taking column length from user.
            System.out.print("Enter the size of row index " + row + " : ");
            int colIndex = sc.nextInt();

            arr[row] = new int[colIndex];

            for(int col = 0; col < colIndex; col++){

                // Enter the value of each index.
                System.out.print("Enter the value of row =" + row + "and column = " + col + " : ");
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
