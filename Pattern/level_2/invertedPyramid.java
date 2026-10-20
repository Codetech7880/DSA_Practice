/*
package Pattern.level_2;

public class invertedPyramid {
    public static void main(String[] args) {
        
        int n = 4;

        for(int i = 1; i <= n; i++){

            // for n row --> there is variable column.

            // printing spaces.
            // Formula : (row - n) + 3
            for(int j = 1; j <= (i - n) + 3; j++){
                System.out.print("  ");
            }

            // Printing stars
            for(int j = i; j <= n; j++){
                System.out.print("* ");
            }

            // Printing stars.
            // Formula : n - row
            for(int j = 1; j<= (n -i); j++){
                System.out.print("* ");
            }
            // Move to next line.
            System.out.println();

        }

    }
}
 */


// ===========================================================================================
//                                     OTHER METHOD
// ===========================================================================================

package Pattern.level_2;

public class invertedPyramid {
    public static void main(String[] args) {
        
        int n = 4;

        for(int i = 1; i <= n; i++){

            // for n row --> there is variable column.

            // printing spaces.
            // Formula : row - 1
            for(int j = 1; j <= (i - 1); j++){
                System.out.print("  ");
            }

            // Printing stars
            // Formula : 2n - row - (row - 1)
            for(int j = 1; j <= 2*n - i -(i - 1); j++){
                System.out.print("* ");
            }
            
            // Move to next line.
            System.out.println();

        }

    }
}
