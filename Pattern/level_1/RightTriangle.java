package Pattern.level_1;

public class RightTriangle {
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 1; i <= n; i++){
            // for each row --> variable column.
            for(int j = 1; j<= i; j++){
                // Printing *
                System.out.print("* ");
            }
            // Move to next line.
            System.out.println();
        }

    }
}
