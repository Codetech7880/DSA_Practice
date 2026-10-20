/* package Pattern.level_2;

public class solidPyramid {
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 1; i <= n; i++){

            // Fromula : n - row
            for(int j = 1; j <= (n - i); j++){
                // Printing space.
                System.out.print("  ");
            }

            // Formula : j --> i
            for(int j = 1; j <= i; j++){
                // Printing stars.
                System.out.print("* ");
            }

            // Formula : row - n + 4;
            for(int j = 1; j <= (i - n) + 4; j++){
                // Printing stars.
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

public class solidPyramid {
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 1; i <= n; i++){

            // Printing space
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }

            // Printing stars.
            for(int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("* ");
            }
            // Move to next line.
            System.out.println();

        }

    }
}