package Arrays.Assignment.oneDimension;

import java.util.Scanner;

public class countEvenOrOdd {
    public static void main(String[] args) {
        
        // Scanner helps us to take input form the user.
        Scanner sc = new Scanner(System.in);

        // Taking the size of array from the user.
        System.out.print("Enter the size of an array : ");
        int rowSize = sc.nextInt();

        int arr[] = new int[rowSize];

        for(int row = 0; row < rowSize; row++){
            // Takin each element from the user.
            System.out.print("Enter element at index " + row + " : ");
            arr[row] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int row = 0; row < rowSize; row++){
            // Checking number of even and odd element in an array.
            if(arr[row] % 2 == 0){
                evenCount += 1;
            }else{
                oddCount += 1;
            }
        }

        // Printing number of even and odd elements.
        System.out.println("Number of even element is : " + evenCount);
        System.out.println("Number of odd element is : " + oddCount);

    }
}
