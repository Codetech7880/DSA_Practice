// package Arrays.singleDimensionArray;

import java.util.Scanner;

public class InputAllElement {
    public static void main(String[] args) {
        
        // Scanner for taking element from the user.
        Scanner sc = new Scanner(System.in);

        // Initializing an array of length 5.
        int arr[] = new int[5];

        // Finding the length of an array using length method.
        int n = arr.length;

        for(int i = 0; i <= (n - 1); i++){

            // Asking the user to enter the value of each indexes.
            System.out.print("Enter the value of "+ i +" index :");
            arr[i] = sc.nextInt();

        }

        // Using for each loop to print each element in an array.
        for(int value : arr){
            System.out.println(value);
        }

    }
}
