package Pattern.level_2;

public class hollowSquare {
    public static void main(String[] args) {
        
        int n = 4;

        for(int row = 1; row <= n; row++){
            // for each row --> fixed column(6)
            for(int column = 1; column <= 6; column++){

                if(row == 1 || row == 4){
                    System.out.print("* ");
                }else{
                    // Middle rows
                    if(column == 1 || column == 6){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                    
                }
        
            }
            // Move to next line.
            System.out.println();

        }

    }
}
