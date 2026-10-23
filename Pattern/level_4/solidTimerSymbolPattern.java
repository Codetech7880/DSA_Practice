package Pattern.level_4;

public class solidTimerSymbolPattern {
    public static void main(String[] args) {
        
        int n = 5;
        // This pattern have two parts.
        
        // upper part
        for(int row = 1; row <= n; row++){

            // For n row --> variable column.
            // The upper part have also two part.

            // 1. Space printing part
            for(int column = 1; column <= (row - 1); column++){
                System.out.print("  ");
            }

            // 2. Star printing part
            for(int column = 1; column <= 2*n - row - (row - 1); column++){
                System.out.print("* ");
            }

            // Move to next row.
            System.out.println();
        }

        // Lower part.
        for(int row = 1; row <= n; row++){

            // For n row --> variable column.
            // This lower part have also two parts.

            if(row == 1){

                // Skiping first row.
                continue;

            }else{
                // 1. space printing part.
                for(int column = 1; column <= (n - row); column++){
                    System.out.print("  ");
                }

                // 2. star printing part.
                for(int column = 1; column <= (2*n - 2*(n - row) - 1); column++){
                    System.out.print("* ");
                }
                // Move to next row.
                System.out.println();
            }

        }

    }
}
