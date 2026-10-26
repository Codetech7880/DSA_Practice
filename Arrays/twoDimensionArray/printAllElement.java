package Arrays.twoDimensionArray;

public class printAllElement{
    public static void main(String[] args) {
        
        // Initializing a 2D array.
        int arr[][] = {{2, 3},{3, 4}, {4,5}};

        for(int row = 0; row <= arr.length-1; row++){
            for(int col = 0; col <= arr[row].length-1; col++){
                // Printing all elements in 2D array.
                System.out.print(arr[row][col] + " ");
            }
            // Move to the next row.
            System.out.println();
        }

    }
}