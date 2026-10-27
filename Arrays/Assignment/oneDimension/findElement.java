package Arrays.Assignment.oneDimension;

import java.util.Scanner;

public class findElement{
    public static void main(String[] args) {
        
        // Scanner help us to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Taking the size of an array from the user.
        System.out.print("Enter the size of an array : ");
        int arrSize = sc.nextInt();

        // Enter the element that you want to search.
        System.out.print("Enter the element that you want to search : ");
        int elementSearch = sc.nextInt();

        // Initialize an array of given user size.
        int arr[] = new int[arrSize];

        for(int i = 0; i < arrSize; i++){
            // Taking each element from the user.
            System.out.print("Enter each element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arrSize; i++){
            // Printing the index if element found.
            if(elementSearch == arr[i]){
                System.out.println("Element found at index : " + i);
            }
        }

    }
}