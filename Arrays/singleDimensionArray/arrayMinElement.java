import java.util.Scanner;

public class arrayMinElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int n = arr.length;

        for(int i = 0; i <= (n - 1); i++){
            // Taking each element by the user.
            System.out.print("Enter the element of index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        // Initializing min variable and assigning 0th index element.
        int min = arr[0];

        for(int i = 1; i <= (n - 1); i++){
            // Finding the smaller one and if found then it initialize it in min variable.
            if(min > arr[i])
                min = arr[i];
        }
        // Printing the min element in an array.
        System.out.println("Min element in an array is : " + min);
    }
} 
    



// =======================================================================================
//                                    ANOTHER METHOD
// ========================================================================================

/* 

import java.util.Arrays;
import java.util.Scanner;

public class arrayMinElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int n = arr.length;

        for(int i = 0; i <= (n - 1); i++){
            // Taking each element form the user.
            System.out.print("Enter the elemnet at " + i + " index : ");
            arr[i] = sc.nextInt();
        }

        // Sorting the array in ascending order.
        Arrays.sort(arr);

        // Printing the min element ina na array.
        System.out.println(arr[0]);

    }
} 
    
*/
