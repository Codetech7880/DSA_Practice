package Pattern.level_4;

public class AlphabetPattern4 {
    public static void main(String[] args) {
        
        int n = 4;

        for(int row = 1; row <= n; row++){

            // For n row --> variable column.

            // This pattern have three parts.
            // First part
            for(int column = 1; column <= (n - row); column++){
                System.out.print("  ");
            }

            // Second part
            for(int column = 1; column <= row; column++){
                int a = column;
                int b = ('A' - 1);
                int result = a + b;
                char finalResult = (char)result;
                System.out.print(finalResult + " ");
            }

            // Third part
            for(int column = 1; column <= (row - 1); column++){
                int a = row;
                int b = ('A' - 2);
                int result = a + b;
                char finalResult = (char)result;
                System.out.print(finalResult + " ");
            }
            // Move to next row.
            System.out.println();

        }

    }
}
