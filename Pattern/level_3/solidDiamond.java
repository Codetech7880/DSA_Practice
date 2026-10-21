// package Pattern.level_3;

public class solidDiamond {
    public static void main(String[] args) {
        
        int n = 4;

        // For n row --> variable column
        // For upper pyramid
        for(int row = 1; row <= n; row++){

            // Printing space.
            for(int column = 1; column <= (n - row); column++){
                System.out.print("  ");
            }

            // Printing stars.
            for(int column = 1; column <= (2*row) - 1; column++){
                System.out.print("* ");
            }
            // Move to next row.
            System.out.println();

        }

        //For lower pyramid.
        for(int row = 1; row <= n; row++ ){

            if(row == 1){

                // Skiping first row.
                continue;

            }else{

                // For n row --> variable column
                // Printing spaces.
                for(int column = 1; column <= (row - 1); column++){
                    System.out.print("  ");
                }

                // Printing stars.
                for(int column = 1; column <= (2*n - row) - (row - 1); column++){
                    System.out.print("* ");
                }
                // Move to next row.
                System.out.println();
            }

        }
    }
}
