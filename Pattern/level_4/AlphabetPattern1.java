package Pattern.level_4;

public class AlphabetPattern1 {
    public static void main(String[] args) {
        
        int n = 5;

        for(int row = 1; row <= n; row++){
            
            // For n row --> variable column.
            for(int column = 1; column <= row; column++){
                
                int a = column;
                int b = ('A' - 1);
                int result = a + b;
                char finalResult = (char)result;

                // Printing alphabets.
                System.out.print(finalResult + " ");
            }
            System.out.println();

        }
    }
}
