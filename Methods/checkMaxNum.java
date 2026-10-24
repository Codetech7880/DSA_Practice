package Methods;

public class checkMaxNum {

    static String findingMaximum(int num1, int num2){

        // Applying conditions
        if(num1 > num2){
            // Returning if condition is true.
            return "First number is greater";
        }else{
            // Returning if condition is false.
            return "Second number is greater";
        }

    }

    public static void main(String[] args) {
        
        // passing argument in method call
        System.out.println(findingMaximum(34, 56));

    }
}
