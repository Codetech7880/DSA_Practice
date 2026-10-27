package Arrays.Assignment.oneDimension;

import java.util.Arrays;
import java.util.Scanner;

public class findSecondLargestElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Takin the size of an array from the user.
        System.out.print("Enter the size of an array : ");
        int arraySize = sc.nextInt();

        int arr[] = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            // Taking each element by user.
            System.out.print("Enter element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // Arrays.sort is sorting method that sort the array in ascending order.
        Arrays.sort(arr);
        // Findingh the second largest element. 
        int secondLargestElement = arr[arraySize - 2];

        // Printing the second largest element.
        System.out.println("Second largest element is : " + secondLargestElement);

    }
}
