package TimeAndSpaceComplexity.Day3;

import java.util.Scanner;

public class fixedSizeArray {
    public static void main(String[] args) {
        
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int values : arr){
            System.out.println(values);
        }

        // Time Complexity --> O(1)
        // Space Complexity --> O(1)

    }
}
