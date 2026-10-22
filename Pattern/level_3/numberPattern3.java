public class numberPattern3 {
    public static void main(String[] args) {
        
        int n = 5; 
        // Initializing i for numbers that is increasing step by step.
        int i = 1;

        for(int row = 1; row <= n; row++){

            // For n row --> variable column.

            for(int column = 1; column <= row; column++){
                // printing numbers.
                System.out.print(i++ + " ");

            }
            System.out.println();

        }

    }
}
