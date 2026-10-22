public class numberPattern2 {
    public static void main(String[] args) {
        
        int n = 5;

        for(int row = 1; row <= n; row++){

            // For n row --> variable columns.
            for(int column = 1; column <= row; column++){

                // Printing numbers.
                System.out.print(row + " ");

            }
            // Move to next row.
            System.out.println();

        }

    }
}
