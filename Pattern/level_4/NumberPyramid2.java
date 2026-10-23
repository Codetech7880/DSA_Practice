package Pattern.level_4;

public class NumberPyramid2 {
    public static void main(String[] args) {
        
        int n = 4;

        for(int row = 1; row <= n; row++){

            // For n row --> variable column.
            
            // This pattern has two parts.
            // First part
            for(int column = 1; column <= (n - row); column++){
                System.out.print("  ");
            }

            // Second part
            for(int column = 1; column <= 2*n - 2*(n - row) - 1; column++){
                System.out.print(row + " ");
            }
            // Move to next row.
            System.out.println();

        }

    }
}
