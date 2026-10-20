package Pattern.level_2;

public class hollowPyramid {
    public static void main(String[] args) {
        
        int n = 4; 

        for(int row = 1; row <= n; row++){

            // for n row --> variable column

            // Printing space in outer pyramid.
            for(int column = 1; column <= (n - row); column++){
                System.out.print("  ");
            }

            for(int column = 1; column <= n - (n - row) + (row - 1); column++){
                if(row == 4 || column == 1 || column == (n - (n - row) + (row - 1))){
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

    }
}
