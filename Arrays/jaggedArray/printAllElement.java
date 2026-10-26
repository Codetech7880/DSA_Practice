package Arrays.jaggedArray;

public class printAllElement {
    public static void main(String[] args) {
        
        int arr[][] = {
            {2, 3},
            {3, 4, 5, 6},
            {3, 7},
            {5, 9, 6}
        };

        for(int row = 0; row <= arr.length - 1; row++){
            for(int col = 0; col <= arr[row].length - 1; col++){

                // Printing all elements in a jagged array.
                System.out.print(arr[row][col] + " ");

            }
            // Move to next row.
            System.out.println();
        }

    }
}
