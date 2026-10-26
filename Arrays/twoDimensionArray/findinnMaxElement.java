package Arrays.twoDimensionArray;

import java.util.Scanner;

public class findinnMaxElement {
    public static void main(String[] args) {
        
        // Scanner is used for taking input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking the row length form user.
        System.out.print("Enter the length of row : ");
        int rowLength = sc.nextInt();

        // Taking the column length form user.
        System.out.print("Enter the length of row : ");
        int colLength = sc.nextInt();

        // Initializing the 2D array.
        int arr[][] = new int[rowLength][colLength];

        int maxElement = arr[0][0];

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){

                // Taking each index form each index.
                System.out.print("Enter the element of row "+ row + " column " + col + " : ");
                arr[row][col] = sc.nextInt();

            }
        }

        for(int row = 0; row <= arr.length - 1; row++){
            for(int col = 0; col <= arr[row].length - 1; col++){

                // Finding the largest element from each element in an array.
                if(maxElement < arr[row][col]){
                    maxElement = arr[row][col];
                }

            }
        }

        // Printing the maximum element for the array.
        System.out.println(maxElement);

    }
}
