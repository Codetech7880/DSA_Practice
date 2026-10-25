// package Arrays.Tasks;

public class printAllElement {
    public static void main(String[] args) {
        
        // Initializing an array with hard coaded value.
        int arr[] = {12, 34, 56, 23, 43};

        // Finding the length of an array,
        int n = arr.length;

        // Using normal for loop to find each element in an array.
        for(int i = 0; i <= n - 1; i++){

            // Printing each element in an array.
            System.out.println("Element at index "+ i +" is : " + arr[i]);
            
        }

    }
}
