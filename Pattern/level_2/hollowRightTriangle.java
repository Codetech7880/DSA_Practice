package Pattern.level_2;

public class hollowRightTriangle {
    public static void main(String[] args) {
        
        int n = 5;

        for(int row = 1; row <= n; row++){

            // for n row --> variable column.
            for(int column = 1; column <= row; column++){
                if(row == 5 || column == 1 || column == row){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            // Move to next row.
            System.out.println();

        }

    }
}
