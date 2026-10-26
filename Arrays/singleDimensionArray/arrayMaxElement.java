/*

// package Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class arrayMaxElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int n = arr.length;

        for(int i = 0; i <= (n - 1); i++){

            // Taking element form the user.
            System.out.print("Enter the value of index "+ i + " : ");
            arr[i] = sc.nextInt();
        }

        // Sorting the arry in ascending order.
        Arrays.sort(arr);

        // finding the index of last element which is maximum.
        int maxindex = arr.length - 1;

        // Printing the max element in an array.
        System.out.println(arr[maxindex]);

    }
} 

*/


// ======================================================================================
//                               ANOTHER METHOD
// ======================================================================================


// package Arrays.singleDimensionArray;

import java.util.Scanner;

public class arrayMaxElement {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int n = arr.length;

        for(int i = 0; i <= (n - 1); i++){
            // Taking each element by the user.
            System.out.print("Enter the element for index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // Initializing the first element as a max element.
        int max = arr[0];

        for(int i = 1; i <= (n - 1); i++){
            // Compare each element to find the max element.
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
