package Pattern.level_4;

public class NumberPyramid1 {
    public static void main(String[] args) {
        
        int n = 5;

        for(int row = 1; row <= n; row++){

            // For n row --> variable column.

            // Part 1
            for(int column = 1; column <= (n - row); column++){
                System.out.print("  ");
            }

            // Part 2
            for(int column = 1; column <= row; column++){
                System.out.print(column + " ");
            }

            // Part 3
            int rowValue = row;
            int decRowValue = (rowValue - 1);
            for(int column = 1; column <= (row - 1); column++){
                System.out.print(decRowValue + " ");
                decRowValue--;
            }
            // Move to next row
            System.out.println();

        }

    }
}
