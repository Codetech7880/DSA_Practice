package Pattern.level_1;

public class invertedRightTriangle {
    public static void main(String[] args) {
        
        // Row initialization.
        int n = 5;

        for(int row = 1; row <= n; row++){

            // for every row there is variable column.
            // formula stars = n - row + 1
            for(int j = 1; j <= (n - row) + 1; j++){

                // Printing stars.
                System.out.print("* ");

            }
            // Move to next line.
            System.out.println();

        }

    }
}
