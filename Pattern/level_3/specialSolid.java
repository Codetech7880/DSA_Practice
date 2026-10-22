public class specialSolid {
    public static void main(String[] args) {
        
        int n = 5; 

        // upper part
        for(int row = 1; row <= n; row++){

            // n row --> variable column.

            // first part
            for(int column = 1; column <= row; column++){
                // Printing stars.
                System.out.print("* ");
            }
            // second part
            for(int column = 1; column <= 2*(n - row); column++){
                // Printing space.
                System.out.print("  ");
            } 
            // third part
            for(int column = 1; column <= row; column++){
                // Printing stars.
                System.out.print("* ");
            } 
            System.out.println();

        }

        // lower part
        for(int row = 1; row <= n; row++){

            // n row --> variable column.

            // first part 
            for(int column = 1; column <= (n + 1) - row; column++){
                // Printing stars.
                System.out.print("* ");
            }
            // second part 
            for(int column = 1; column <= 2*n - 2*((n+1) - row); column++){
                // Printing space.
                System.out.print("  ");
            }
            // third part 
            for(int column = 1; column <= (n + 1) - row; column++){
                // Printing stars.
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
