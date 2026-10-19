package Pattern.level_1;

public class solidRombus {
    public static void main(String[] args) {
        // Initialize the value of row.
        int n = 5;

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= (n - i); j++){
                // Printing space.
                System.out.print("  ");
            }

            for(int k = 1; k <= n; k++){
                // Printing stars.
                System.out.print("* ");
            }
            // Move to next line.
            System.out.println();
        }

    }
}
