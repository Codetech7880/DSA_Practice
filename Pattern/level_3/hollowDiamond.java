public class hollowDiamond {
    public static void main(String[] args) {
        
        int n = 4; 

        for(int row = 1; row <= n; row++){

            // for n row --> variable column

            // Printing space in outer pyramid.
            for(int column = 1; column <= (n - row); column++){
                System.out.print("  ");
            }

            for(int column = 1; column <= n - (n - row) + (row - 1); column++){
                if(column == 1 || column == (n - (n - row) + (row - 1))){
                    // Printing stars in inner pyramid
                    System.out.print("* ");
                }else{
                    // Printing space in inner pyramid
                    System.out.print("  ");
                }
            }
            // Move to next row.
            System.out.println();

        }

        n = n-1;

        //For lower pyramid.
        for(int row = 1; row <= n; row++ ){

            // For n row --> variable column
            // Printing spaces.
            for(int column = 1; column <= row; column++){
                System.out.print("  ");
            }

            for(int column = 1; column <= (2*n - (row - 1)) - row; column++){
                
                if(column == 1 || column == (2*n - (row - 1)) - row){
                    // Printing stars.
                    System.out.print("* ");
                }else{
                    // Printing space.
                    System.out.print("  ");
                }
            
            }
            // Move to next row.
            System.out.println();
        }

    }
}
