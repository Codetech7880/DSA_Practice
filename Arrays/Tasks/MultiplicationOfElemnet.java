// package Arrays.Tasks;

import java.util.Scanner;

public class MultiplicationOfElemnet {
    public static void main(String[] args) {
        
        // Scanner helps us to take input from the user.
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        // Finding the length of an array.
        int n = arr.length;

        for(int i = 0; i <= (n - 1); i++){

            // Taking input element of each index.
            System.out.print("Enter the value of index " + i + " : ");
            arr[i] = sc.nextInt();

        }

        // Initializing a variable.
        int multiple = 1;
        for(int value : arr){

            // Multiply each element with it.
            multiple *= value;

        }
        // Printing the total multiple of each element in an array.
        System.out.println("Total multiple of each element : " + multiple);

    }    
}
