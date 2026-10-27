package Arrays.Assignment.oneDimension;

import java.util.Scanner;

public class reverseTheArray {
    public static void main(String[] args) {
        
        // Scanner helps to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking the size of an array from user.
        System.out.print("Enter the size of an array : ");
        int arraySize = sc.nextInt();

        int arr[] = new int[arraySize];
        int revArr[] = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            // Takin each element from the user.
            System.out.print("Enter element of index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arraySize; i++){
            // Applying logic to reverse the array.
            revArr[i] = arr[arraySize - (i + 1)];
        }

        for(int i = 0; i < arraySize; i++){
            // Printing the reverse array.
            System.out.print(revArr[i] + " ");
        }

    }
}
